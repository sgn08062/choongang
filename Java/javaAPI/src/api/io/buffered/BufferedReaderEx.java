package api.io.buffered;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt"));
            String str;
            while((str = br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
