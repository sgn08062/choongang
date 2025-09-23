package Quiz01;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문제 3: 원의 넓이
        // - 반지름을 받아서 원의 넓이를 계산하는 함수 circleArea를 만들어보세요
        // - 원의 넓이 = pi x 반지름^2 (pi는 3.14159)
        circleArea(sc.nextInt());

        // 문제 4: 약수 개수
        // - 양의 정수를 받아서 약수의 개수를 세는 함수 countDiv를 만들어보세요
        countDiv(sc.nextInt());
    }

    static void circleArea(int r){
        System.out.println(3.14159 * Math.pow(r, 2));
    }

    static void countDiv(int num){
        int cnt = 0;
        for(int i=1;i<=num;i++){
            if(num%i == 0) cnt++;
        }

        System.out.println(cnt);
    }
}
