package day04;

import java.util.Arrays;

public class MethodEx04 {
    public static void main(String[] args) {
        // 배열을 매개변수로 받거나, 배열을 반환하는 메서드
        // 변수명으로 전달
        int[] arr = {1, 2, 3, 4, 5};
        some(arr);

        String[] arr2 = some2();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(num)));
    }

    // 매개변수로 배열을 받는 메서드
    static void some(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    // 배열을 반환하는 메서드
    static String[] some2(){
        String[] arr = {"hello", "world"};


        return arr;
    }

    // - 매개변수: arr
    // - 반환값: 배열 (뒤집힌 새 배열)
    // - 배열을 받아서 순서를 뒤집은 새 배열을 반환하는 함수 reverseArray를 만들어보세요.
    // - 예시:[1, 2, 3, 4] → [4, 3, 2, 1]

    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
