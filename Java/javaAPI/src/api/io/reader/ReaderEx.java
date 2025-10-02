package api.io.reader;

import java.io.*;

public class ReaderEx {
    public static void main(String[] args) {
        try{
            Reader in = new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");

            while(true){
                int result = in.read(); // 더 이상 읽을 데이터가 없으면 -1 반환
                if(result == -1){
                    break;
                }
                System.out.print((char) result);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
