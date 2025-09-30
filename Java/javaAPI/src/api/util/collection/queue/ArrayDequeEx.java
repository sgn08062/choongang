package api.util.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offerFirst(100);
        deque.offerFirst(200);
        deque.offerFirst(300);

        System.out.println(deque.toString());

        System.out.println("앞에서 꺼낼때 나올 값: " + deque.peekFirst());
        System.out.println("뒤에서 꺼낼때 나올 값: " + deque.peekLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.toString());
    }
}
