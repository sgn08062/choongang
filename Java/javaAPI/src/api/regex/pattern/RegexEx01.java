package api.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {
    public static void main(String[] args) {

        /*


        \w - _와 영문자
        \d - 숫자
        ? - 0번~1번
        * - 0회 이상
        + - 1회 이상
        */

        String info = "30/이경훈/서울/010-1234-1234/sgn08062@naver.com";

        String pattern = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(info);

//        System.out.println(m.find());
        while(m.find()){
            System.out.println("일치하는 문자의 시작인덱서: " + m.start());
            System.out.println("일치하는 문자의 끝 인덱스: " + m.end());
            System.out.println("일치하는 문자는: " + m.group());
        }

        System.out.println("---------------------------------------------------------");

        String email = "\\w+@\\w+.\\w+";
        Matcher m2 = Pattern.compile(email).matcher(info);

        while(m2.find()){
            System.out.println(m2.group());
        }
    }
}
