package api.util.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        // 자바에서 기본큐는 LinkedList로 구현한다.
        Queue<String> queue = new LinkedList<>();

        // 큐에 삽입하는 메서드
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        // 값을 확인하는 메서드
        String value = queue.peek();
        System.out.println("큐에서 나오는 문자열은: " + value);

        // 값을 꺼내는 메서드
        String v = queue.poll();
        System.out.println("꺼내진 값: " + v);

        // 현재 큐
        System.out.println(queue.toString());

        // size를 사용해도 되고 isEmpty 사용 가능
    }
}
