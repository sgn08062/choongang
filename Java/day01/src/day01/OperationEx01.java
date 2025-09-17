package day01;

public class OperationEx01 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(-i); // 부호 연산자

        // 증감 연산자
        int k = 1;
        //int h = k++; // 먼저 값을 대입하고, 그 다음 값 증가
        int h = ++k; // 먼저 값을 증가하고, 대입
        System.out.println("k값: " + k + ", h값: " + h);
        System.out.println("--------");

        byte b = 10; // 0000 1010
        System.out.println(~b); // 1111 1010
        System.out.println(~b + 1); // 1111 1011


    }
}
