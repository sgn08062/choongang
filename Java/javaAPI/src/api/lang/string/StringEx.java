package api.lang.string;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};

        String str2 = new String(arr); // 문자열은 - 문자배열의 합으로 만들어짐
        System.out.println(str2);

        String str = "Hello World";
        // 문자열 한글자 자르기
        System.out.println(str.charAt(0));
        // 문자열 길이
        System.out.println(str.length());
        // 문자열 비교
        System.out.println(str.equals("hello world"));
        // 특정 문자 위치로 자르기
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, str.length()-1));
        // 공백제거
        System.out.println(str.trim());
        // 대소문자 바꾸기
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        // 문자열 찾기
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.contains("Hel")); // hel문자열이 있으면 true
        // 문자열 변경
        System.out.println(str.replace('l', '헑'));
        System.out.println(str.replaceFirst("l", "헑"));
        // 문자열을 잘라서 배열로 반환
        String[] arr2 = str.split("");
        System.out.println(Arrays.toString(arr2));
        // 문자열 대소비교
        System.out.println("코끼리".compareTo("사자")); // 각 글자를 비교해서 같지 않으면 종료시키고 양수가 나오면 앞 문자열이 사전적으로 뒤에 있다는 뜻
        System.out.println("사자".compareTo("코끼리"));
        System.out.println("홍길동".compareTo("홍길동"));
    }
}
