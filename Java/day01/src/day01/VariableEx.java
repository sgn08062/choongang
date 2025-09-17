package day01;

public class VariableEx {
    public static void main(String[] args) {
        // 변수의 선언
        int num;

        num = 20;

        System.out.println(num);

        int num2 = 20;
        System.out.println(num2);

        int result = num + num2;
        System.out.println(result);

        String name = "홍길동";

        int a = 10;
        if(true) {
            int b = 20; // if문을 벗어나면 b는 사용하지 못한다.
            System.out.println(a);
            System.out.println(b);
        }
    }
}
