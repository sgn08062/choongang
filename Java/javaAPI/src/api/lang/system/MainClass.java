package api.lang.system;

public class MainClass {
    public static void main(String[] args) {
        // new System()
        System.out.println("HELLO WORLD");

        // 1970년 1월 1일 기준으로 - 현재까지 지나온 시간을 밀리초로 반환
        long start = System.currentTimeMillis();

        //프로그램 코드를 호출
        long sum = 0;
        for(int i=1;i<=1000000000; i++){
            sum += i;
        }

        long end = System.currentTimeMillis();

        System.out.println((end-start) * 0.001 + " seconds");


        System.gc(); // 가비지 컬렉터를 실행시킴

        System.out.println(System.getenv()); // 환경변수
        System.out.println(System.getProperties()); // 운영체제의 환경
    }
}
