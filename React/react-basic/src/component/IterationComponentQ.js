import { useState } from "react";

function IterationComponentQ(){
  // 더미데이터
  const arr = [
    {src: '/img/img1.png', title: '아이폰10', price:1000},
    {src: '/img/img2.png', title: '아이폰11', price:2000},
    {src: '/img/img3.png', title: '아이폰12', price:3000},
    {src: '/img/img4.png', title: '아이폰13', price:4000},
  ]

  const [imgList, setImgList] = useState(arr);
  const [mainImg, setMainImg] = useState(imgList[0].src);

  // 이미지를 화면에 출력
  const imgShow = imgList.map((item, index) => {
    console.log(item);
    
    return  <li 
              key={index}
              style={{display:"inline-block", width: "25%", cursor: "nwse-resize"}}
              onClick={() => setMainImg(item.src) }
            >
              <div>
                <img src={item.src}/>
                <p>상품: {item.title}</p>
                <p>가격: {item.price}</p>
              </div>
            </li>
  })

  return(
    <>
      {/* public 폴더 아래값은 정적리소스 형태로 경로참조가 가능 */}
      <ol>
        <li>대표이미지를 state로 관리</li>
        <li>더미데이터는 state로 관리하고, 컴포넌트 반복으로 화면 출력</li>
        <li>컴포넌트 클릭시, 대표 이미지를 변경한다.</li>
      </ol>
      <img src={mainImg}></img>

      <ul>
        {imgShow}
      </ul>
      
    </>
  )
}

export default IterationComponentQ;