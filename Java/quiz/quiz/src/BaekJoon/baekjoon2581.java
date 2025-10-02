package BaekJoon;

import java.util.Scanner;

public class baekjoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int minPrime = -1;
        int sumPrime = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (minPrime == -1) {
                    minPrime = i;
                }
                sumPrime += i;
            }
        }

        if (minPrime == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sumPrime);
            System.out.println(minPrime);
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}