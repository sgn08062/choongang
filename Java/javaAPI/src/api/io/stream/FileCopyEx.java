package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {
    public static void main(String[] args) {
        try{
            String path = "C:\\Users\\user\\Desktop\\course\\upload\\penny_wise.jpeg";
            String path2 ="C:\\Users\\user\\Desktop\\course\\upload\\penny_wise2222.jpeg";

            InputStream in = new FileInputStream(path);
            OutputStream out = new FileOutputStream(path2);

            byte[] buffer = new byte[1024];

/*            int result = in.read(buffer); // 읽어들인 길이
            System.out.println("읽어들인 길이: " + result);
            System.out.println(Arrays.toString(buffer));*/

            int result;
            while ((result = in.read(buffer)) != -1) {
                out.write(buffer, 0, result); //배열 시작 끝값
            }
            in.close();
            out.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
