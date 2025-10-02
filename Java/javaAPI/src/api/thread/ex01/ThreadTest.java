package api.thread.ex01;

public class ThreadTest implements Runnable {
    private int num = 0;

    @Override
    public synchronized void run() {
        // 쓰레드가 run 메서드를 동작시킴
        for(int i=1;i<=10;i++){
            // 쓰레드 관련 기능을 사용할 때는 Thread.static 메서드
            // 현재 동작하는 쓰레득 이름이 A
            if(Thread.currentThread().getName().equals("A")){
                num++;
            }

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName() + " : " + num);


        }
    }
}
