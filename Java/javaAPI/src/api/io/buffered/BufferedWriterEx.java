package api.io.buffered;

import java.io.*;
import java.util.Scanner;

public class BufferedWriterEx {
    public static void main(String[] args) {
        // 이름에 Buffered가 붙었으면, 성능향상 보조 스트림 입니다.
        // BufferedWriter
        // BufferedReader
        // BufferedInputStream
        // BufferedOutputStream
        try{
            // Writer out = new FileWriter("경로");
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt"));

            Scanner sc = new Scanner(System.in);

            while(true){
                String str = sc.nextLine(); // 입력

                if(str.equals("그만")) break;

                bw.write(str); // 출력
                bw.flush();
            }

            bw.close();


        }catch(Exception e){

        }
    }
}
