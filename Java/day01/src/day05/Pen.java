package day05;

public class Pen {

    // 클래스의 속성 나타내는 것 멤버 변수
    String ink;
    int price;

    // 클래스에서 기능을 나타내는 것을 메서드
    void write(){
        System.out.println("====info====");
        System.out.println("색상: " + ink);
        System.out.println("가격: " + price);
    }
}
