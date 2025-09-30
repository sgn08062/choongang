package day09.inter.basic;

public class MainClass {
    public static void main(String[] args) {
        Basic basic = new Basic();

        basic.method01();
        basic.method02();

        // 인터페이스는 부모타입이 될 수 있다
        Inter1 inter1 = new Basic();
        inter1.method01();
        // inter1.method02(); method02는 사용불가

        Inter2 inter2 = new Basic();
        inter2.method02();

        // 인터페이스도 형변환이 가능하다.
        Basic b1 = (Basic) inter1;
        Basic b2 = (Basic) inter2;
    }
}
