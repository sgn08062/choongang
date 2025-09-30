package quiz16;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {
    public static void main(String[] args) {
        // list에 1~20까지 정수를 반복문으로 저장
        // 저장한 값을 반복문으로 출력
        StringBuilder sb = new  StringBuilder();

        List<Integer> list = new ArrayList<>();

        for(int i=1;i<21; i++){
            list.add(i);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
