package api.util.collection.map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        // HashMap이랑 사용방법은 동일함 - 키가 정렬됨
        // TreeSet 기반으로 만들어짐 - 키가 정렬됨
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(100, "hong");
        map.put(50, "lee");
        map.put(400, "kim");
        map.put(230, "choi");

        System.out.println(map.toString());
    }
}
