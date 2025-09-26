package quiz14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    /*
    업, 다운 게임
    1 ~ 100까지 랜덤한 정답을 만들고, 사용자에게 정답을 맞출 때까지 입력받는 게임
    한글을 입력하더라고 정상적으로 돌아갈 수 있도록 예외처리
    */

    public static final int NUM = (int) (Math.random()*99 + 1);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.print("숫자를 입력하세요: ");
            try{
                int n = sc.nextInt();
                if(n==NUM){
                    count++;
                    break;
                }else{
                    if(n>NUM) System.out.println("다운");
                    else System.out.println("업");
                    count++;
                }
            }catch(Exception e){
                System.out.println("숫자를 입력해주세요");
                // 버퍼 초기화
                sc.next();
            }
        }

        System.out.println("정답입니다!!");
        System.out.println("시도 횟수: " + count);
    }
}
