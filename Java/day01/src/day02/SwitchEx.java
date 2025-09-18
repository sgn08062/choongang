package day02;

import java.util.*;
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력");
        int point = sc.nextInt();

        // switch 구문의 ()에는 변수, 변수의 연산식이 들어간다.
        switch(point/10){
            case 9:
                System.out.println("A등급");
                break;
            case 8:
                System.out.println("B등급");
                break;
            case 7:
                System.out.println("C등급");
                break;
            default:
                System.out.println("F등급");
                break;
        }
    }
}
