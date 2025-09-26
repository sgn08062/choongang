package day08.static_.designPattern;

public class Singleton {
    // 객체를 1개만 만들게 함.

    //1. 나 자신의 멤버변수 1개 생성
    private static Singleton singleton = new Singleton();

    // 2. 외부에서 객체 생성을 하지 못하도록  private를 붙임.
    private Singleton() {}

    // 3. 객체 생성을 요구할 때,  getter 메서드로 1번에서 생성해둔 객체를 반환해줌.
    public static Singleton getInstance() {
        return singleton;
    }
}
