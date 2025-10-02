package api.util.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("java");
        set.add("html");
        set.add("css");
        set.add("php");
        set.add("javascript");
        set.add("php");

        System.out.println("set의 크기: " + set.size());

        // 값을 탐색할 때는 반복자라는 개념을 사용해서
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 값의 존재 여부
        if(set.contains("java")){
            System.out.println("java가 존재함");
        }

        // 값의 삭제
        set.remove("java");
    }
}
