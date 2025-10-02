package api.thread.ex01;

public class MainClass01 {
    public static void main(String[] args) {
        // 객체를 2개, 각각 쓰레드 2개에 전달
        ThreadTest threadTest1 = new ThreadTest();
        ThreadTest threadTest2 = new ThreadTest();

        Thread thread1 = new Thread(threadTest1, "A"); // 동작시킬 쓰레드, 쓰레드명
        Thread thread2 = new Thread(threadTest2, "B");

        thread1.start();
        thread2.start();

        System.out.println("메인 쓰레드 종료");
    }
}
