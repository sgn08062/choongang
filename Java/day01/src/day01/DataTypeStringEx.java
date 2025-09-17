package day01;

public class DataTypeStringEx {
    public static void main(String[] args) {
        char c1 = 'a';

        char c2 = '가';
        char c3 = 44032;
        char c4 = '\uAC00';
        System.out.println(c2 + " = " + c3 + " = " + c4);

        // 문자열
        String s1 = "오늘 점심은";
        String s2 = "뭐 먹을까";

        System.out.println(s1 + s2);
    }
}
