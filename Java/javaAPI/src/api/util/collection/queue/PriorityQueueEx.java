package api.util.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(5);
        queue.offer(3);
        queue.offer(8);
        queue.offer(1);
        queue.offer(2);
        queue.offer(4);

        System.out.println(queue.toString());


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


        // 객체를 우선순위 큐에 저장
        // 우선순위 큐에 값이 들어가면, 우선순위를 지정하기 위해서 내부적으로
        // compareTo 메서드를 호출 시킨다.
        // compareable 인터페이스를 상속받는 compareTo 메서드를 반드시 구현해야한다.
        Queue<User> que = new PriorityQueue<>();

        que.offer(new User("홍길동", 34));
        que.offer(new User("홍길자", 43));
        que.offer(new User("이순신", 38));
        que.offer(new User("김나박이", 82));
        que.offer(new User("이도", 24));

        System.out.println(que.toString());

        while(!que.isEmpty()){
            System.out.println(que.poll());
        }
    }
}
