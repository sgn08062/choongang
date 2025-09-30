package day02;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();

        for(int i=1;i<=9;i++){
            System.out.println(dan + " x " + i + " = " + dan*i);
        }
    }
}
