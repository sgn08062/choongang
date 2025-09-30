package api.util.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.addFirst(100); // 처음에 값추가
        list.addLast(200); // 마지막에 값추가

        System.out.println(list.toString());

        list.removeFirst(); // 앞에서 샂게
        list.removeLast(); // 뒤에서 삭제

        System.out.println(list.toString());
    }
}
