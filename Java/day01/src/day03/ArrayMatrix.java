package day03;

import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {
        int[] kor = {50, 60,70};
        int[] math = {40, 50, 20};
        int[] eng = {70, 60, 90};

        int[][] arr = {kor, math, eng};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        // 2차원 배열 순회
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 2차원 배열을 한눈에 보는 기능
        System.out.println(Arrays.deepToString(arr));
    }
}
