package day04;

import java.util.Arrays;

public class MethodEx02 {
    public static void main(String[] args) {
        // 자료구조 - 배열을 유의미하게 사용할 수 있도록 변경한 구조
        // stack - LIFO

        System.out.println(Arrays.toString(arr));
        push(10);
        System.out.println(Arrays.toString(arr));
        push(20);
        System.out.println(Arrays.toString(arr));
        push(30);
        System.out.println(Arrays.toString(arr));

        pop();
        System.out.println(Arrays.toString(arr));
        pop();
        System.out.println(Arrays.toString(arr));
        pop();
        System.out.println(Arrays.toString(arr));
    }

    static int[] arr = {};

    static int push(int data){
        // 배열의 크기를 +1인 배열을 만들고, 데이터를 옮겨담고, 마지막에 추가
        int[] temp = new int[arr.length + 1];

        // 기존의 배열의 값을 temp에 저장함
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }

        // temp의 마지막에 데이터를 추가
        temp[temp.length - 1] = data;
        // arr를 temp로 변경
        arr = temp;
        temp = null;
        return 0;
    }

    static int pop(){
        // 맨 뒤의 데이터를 백업. 배열의 크기를 줄임
        if(arr.length>0){
            int[] temp = new int[arr.length-1];
            for(int i=0; i<temp.length; i++){
                temp[i] = arr[i];
            }
            int data = arr[arr.length-1];
            arr = temp;

            return data;
        }

        return 0;
    }
}
