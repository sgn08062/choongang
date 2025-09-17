package day01;
import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 스캐너가 제공하는 함수를 이용해서 입력받음
        // next() - 문자열 입력 - 공백 앞까지만
        // nextLine() - 문자열 입력 - 공백 포함해서
        // nextInt() - 정수 입력
        // nextDouble() - 실수 입력
        System.out.println("이름을 입력해봐");
        String name = scan.next();

        System.out.println("나이를 입력해봐");
        int age = scan.nextInt();

        System.out.println("이름: " + name + ", 나이 : " + age);

        scan.close();
    }
}
