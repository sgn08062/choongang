package BaekJoon;

import java.util.Scanner;

public class baekjoon11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) return ;

        StringBuffer sb = new StringBuffer();
        // 소인수
        int i = 2;
        while(n!=1){
            if(n%i==0){
                // 소인수인 경우
                sb.append(i);
                sb.append("\n");
                n /= i;
            }else{
                // 소인수가 아닌 경우
                i++;
            }
        }

        System.out.println(sb);
    }
}
