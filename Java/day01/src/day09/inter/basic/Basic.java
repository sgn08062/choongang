package day09.inter.basic;

public class Basic implements Inter1, Inter2{
    // 인터페이스가 가지고 있는 추상메서드는 클래스에서 반드시 오버라이딩이 들어감

    @Override
    public void method01() {
        System.out.println("오버라이딩 된 1번 메서드");
    }

    @Override
    public void method02() {
        System.out.println("오버라이딩 된 2번 메서드");
    }
}
