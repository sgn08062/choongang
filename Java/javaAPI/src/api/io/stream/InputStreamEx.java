package api.io.stream;

import java.io.*;

public class InputStreamEx {
    public static void main(String[] args) {
        // 1바이트 기반이라 텍스트 데이터를 읽거나 쓰는데는 한계가 있음
        // 파일 데이터를 읽고 쓸 때 사용함
        try{
            InputStream in = new FileInputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");

            while(true){
                int a = in.read();
                if(a != -1){
                    System.out.println((char)a);
                }else{
                    break;
                }
            }
        }catch(Exception e){

        }
    }
}
