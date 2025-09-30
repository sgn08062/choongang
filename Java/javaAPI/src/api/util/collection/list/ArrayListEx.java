package api.util.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 1. 추가하기
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString());

        // 2. 크기 확인
        System.out.println("크기: " + list.size());

        // 3. 중간에 추가
        list.add(1, 8);
        System.out.println(list.toString());

        // 4. 값의 수정
        list.set(1, 5);
        System.out.println(list.toString());

        // 5. 값을 얻기
        int i = list.get(2);
        System.out.println("3번째 인덱스에 위치한 값: " + i);

        // 6. 값의 삭제
        list.remove(0);
        System.out.println(list.toString());

        // 7. 값의 포함 여부 확인
        if(list.contains(10)){
            System.out.println("10이 존재함");
        }else{
            System.out.println("10이 존재하지 않음");
        }

        // 8. 빈 리스트인지 확인
        if(!list.isEmpty()){
            System.out.println("비어 있지 않음");
        }

        // 9. 리스트를 추가하기
        // 제네릭<?> - 어떤 타입이든 다 들어갈 수 있음
        // 제네릭<? extends String> - String의 자식이 들어갈 수 있음
        // 제네릭<? super String> - String의 타입이 될 수 있다면 들어갈 수 있음.
        List<Integer> newList = Arrays.asList(10, 20, 30);
        list.addAll(newList);

        System.out.println(list.toString());
    }
}
