package api.util.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args) {
        // util 패키지는 import를 사용해야 한다.

        int[] arr = {3,1,5,6,7,4};

        // 전부 static 메서드로 정의되어 있음
        // 정렬
        Arrays.sort(arr); // 퀵 정렬
        System.out.println(Arrays.toString(arr));

        // 이진탐색 - 선행조건: 정렬
        System.out.println(Arrays.binarySearch(arr,6)); // 6이 발견되는 위치

        // 배열을 list로 변경하는 기능
        List list= Arrays.asList(1,2 ,3, 4, 5, 6, 7, 100, 20, 300);
    }
}
