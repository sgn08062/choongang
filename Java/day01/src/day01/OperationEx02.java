package day01;

public class OperationEx02 {
    public static void main(String[] args) {
        int i = 10/3;
        int j = 10%3;
        System.out.println(i);
        System.out.println(10%3);
        System.out.println(1*10);
        System.out.println("==========================");

        // 비교연산자
        System.out.println( i == j);
        System.out.println( i != j);
        System.out.println( i <= j);
        System.out.println( i >= j);
        System.out.println("==========================");

        // 비트연산자
        int a = 192;
        System.out.println(a>>3);
        System.out.println(a<<3);
        System.out.println("==========================");

        // 논리연산자
        // &, | 한개짜리는 무조건 뒤에 코드를 실행
        // &&, || 두개짜리는 만족하지 않는 조건이라면, 뒤에를 실행하지 않음
        int x = 10;
        int y = 20;
        System.out.println(x!=10 & ++y == 21);
        System.out.println("x: " + x + " y: " + y);
        System.out.println(x==10 || ++y == 21);
        System.out.println("x: " + x + " y: " + y);
    }
}
