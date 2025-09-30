package day06.super_.basic01;

public class Child extends Parent {
    // 생성자 첫줄에 super()가 들어가야 하는데, 아무것도 적지 않으면 super()가 자동으로 들어간다.
    Child(String father, String mother) {
        super(father, mother);
    }
    void method02(){
        System.out.println("상속받은 2번 클래스");
    }
}
