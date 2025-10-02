package api.lambda.basic2;

import java.util.*;
import java.util.stream.Stream;

public class MainClass01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "이성계", "이순신", "신사임당");

        System.out.println("이터레이터 방식");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("람다 스트림 방식");
        // 람다스트림이 제공하는 내부반복자 방식
        list.stream().forEach(s -> System.out.println(s));
    }
}
