package api.util.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // 값을 저장하는 메서드
        map.put(1, "홍길동");
        map.put(2, "이성계");
        map.put(3, "이순신");
        map.put(4, "강감찬");
        map.put(5, "을지문덕");

        System.out.println(map.size());
        System.out.println(map.toString());

        // 맵에 key는 고유하기 때문에, 동일한 키를 저장하면, 값이 수정된다
        map.put(4, "김철수");
        System.out.println(map.toString());

        // 값 얻기
        String name = map.get(4); // 키를 주면 값을 반환
        System.out.println("4키 값은: " + name);

        // 맵을 반복하려면 key를 set으로 변경
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();

        while(it.hasNext()) {
            int key = it.next();
            String value = map.get(key);
            System.out.println(key+"번째 이름은: " + value);
        }

        // entrySet
        Set<Map.Entry<Integer, String>> sets = map.entrySet();

        for(Map.Entry<Integer, String>entry: sets){
            System.out.println(entry.getKey()+"반째 손님: " + entry.getValue());
        }

        // 키 혹은 값의 유무를 contains 메서드로 확인
        if(map.containsKey(5)){
            System.out.println("4번 키는 존재함");
        }

        if(map.containsValue("이경훈")){
            System.out.println("여깄내");
        }else{
            System.out.println("그런 사람은 없다");
        }
    }
}
