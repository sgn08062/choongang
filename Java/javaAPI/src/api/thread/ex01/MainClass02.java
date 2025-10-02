package api.thread.ex01;

public class MainClass02 {
    public static void main(String[] args) {

        // 1개의 객체로 n개의 쓰레드를 실행
        ThreadTest threadTest = new ThreadTest();

        Thread thread1 = new Thread(threadTest, "A");
        Thread thread2 = new Thread(threadTest, "B");

        thread1.start();
        thread2.start();

        System.out.println("메인 쓰레드 종료");
    }
}
