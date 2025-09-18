package day03;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        //복사
        // 복사의 개념 2개
        // 얕은 복사 - 주소값을 복사(원본값도 복사)
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = arr;

        newArr[2] = 60;
        System.out.println(Arrays.toString(arr));
        // 깊은 복사 - 완전히 새로운 배열을 하나 생성
        int[] newArr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr2[i] = arr[i];
        }
    }
}
