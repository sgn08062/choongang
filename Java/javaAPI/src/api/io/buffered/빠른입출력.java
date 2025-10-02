package api.io.buffered;

import java.io.*;

public class 빠른입출력 {
    public static void main(String[] args) {
        // 입출력
        try{
            // 빠른 입력
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("입력> ");
            String str = br.readLine();

            // 빠른 출력
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(str);
            bw.flush();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
