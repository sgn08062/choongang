package com.sgn08062.spring_myweb.product;

import com.sgn08062.spring_myweb.command.CategoryVO;
import com.sgn08062.spring_myweb.command.ProductUploadVO;
import com.sgn08062.spring_myweb.command.ProductVO;
import com.sgn08062.spring_myweb.util.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;

    // 파일 업로드 경로
    @Value("${project.upload.path}")
    String uploadPath;

    // 폴더 생성 메서드
    public String makeFolder(){
        String path = LocalDate.now().format(DateTimeFormatter.ofPattern("yyMM"));
        File file = new File(uploadPath + "/" + path);
        if (!file.exists()){
            file.mkdirs();
        }

        return path;
    }

    // 메서드 트랜잭션 처리
    // 한 프로세스 안에서 예외 발생시, 롤백을 처리
    // 에러가 try-catch 되어있으면 처리 불가
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int prodRegist(ProductVO productVO,  List<MultipartFile> files) {
        // 1. productVO -> 상품 인서트
        // 2. 업로드
        // 3. productVO의 pk를 fk로 쓰는 upload 테이블 인서트
        // 4. 결과 반환

        // 1.
        int result = productMapper.prodRegist(productVO);

        // 2.
        for(MultipartFile file : files){
            // 위와 동일...

            // 브라우저 별로 사용자의 경로가 앞에 붙어서 들어오는 경우가 있기 때문에 // 기준으로 절삭
            // 동일한 이름으로 올라오는 것 처리
            // 윈도우 시스템이 폴더하나에 저장할 수 있는 파일의 개수가 65536개
            String originalFileName = file.getOriginalFilename(); // 파일의 이름
            String fileName = originalFileName.substring(originalFileName.lastIndexOf("\\") + 1);

            String uuid = UUID.randomUUID().toString(); // 랜더문자연결값
            String dirPath = makeFolder(); // 폴더경로
            String filePath = uploadPath + "/" + dirPath + "/" + uuid + "_" + fileName;
            File saveFile = new File(filePath);

            try{
                file.transferTo(saveFile); // 업로드 처리
            }catch (Exception e){
                e.printStackTrace();
            }

            //3.
            productMapper.fileRegist(
                    ProductUploadVO
                            .builder()
                            .filename(fileName)
                            .filepath(filePath)
                            .uuid(uuid)
                            .prodWriter(productVO.getProdWriter())
                            .prodId(productVO.getProdId())
                            .build()
            );
        }

        // 4.
        return result;
    }

    @Override
    public List<ProductVO> getList(String prodWriter, Criteria cri) {
        return productMapper.getList(prodWriter, cri);
    }

    @Override
    public ProductVO getDetail(long prodId) {
        return productMapper.getDetail(prodId);
    }

    @Override
    public List<ProductUploadVO> getDetailFile(long prodId) {
        return productMapper.getDetailFile(prodId);
    }

    @Override
    public int prodUpdate(ProductVO productVO) {
        return productMapper.prodUpdate(productVO);
    }

    @Override
    public int prodDelete(long prodId) {
        return productMapper.prodDelete(prodId);
    }

    @Override
    public int getTotal(String prodWriter, Criteria cri) {
        return productMapper.getTotal(prodWriter, cri);
    }

    @Override
    public List<CategoryVO> getCategory() {
        return productMapper.getCategory();
    }

    @Override
    public List<CategoryVO> getCategoryChild(CategoryVO categoryVO) {
        return productMapper.getCategoryChild(categoryVO);
    }
}
