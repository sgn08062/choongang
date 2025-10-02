package quiz20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        /*
        입사한 회사에서ㅐ는 매일 오전 7시에 연계회사에서
        날짜유형의 csv 파일을 전송한다.

        이 파일의 이름은 2025_10_01data.csv 파일 유형이다.

        그래서 아침마다 csv파일을 읽어서 가져오는 작업을 해야한다.

        이 파일을 읽어서 , 기준으로 분리한 다음에 나이와 이름을 출력해라.
        */

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
        String filename = "C:\\Users\\user\\Desktop\\course\\upload\\" + sdf.format(date) + "_data.csv";

        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String str;
            while((str=br.readLine()) != null){
                String[] ageName = str.split(",");
                bw.write(ageName[0].trim() +" "+ageName[1].trim() + "/");
            }
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
