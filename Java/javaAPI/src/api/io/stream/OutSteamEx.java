package api.io.stream;

import java.io.*;
import java.io.FileOutputStream;

public class OutSteamEx {
    public static void main(String[] args) {
        //FileOutputStream out = new FileOutputStream("가져올 파일 경로);
        OutputStream out = null;

        try{
            out = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");

            String str = "hello World";
            out.write(str.getBytes()); // 파일을 써내림(Byte기반)
        }catch(Exception e){

        } finally{
            try{
                out.close();
            }catch(Exception e){}
        }
    }
}
