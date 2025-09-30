package day08.static_.method;

public class Count {
    public int a;
    public static int b;

    // 일반메서드
    public void method01(){
        a = 10;
        b++;
    }

    // 정적메서드 - 같은 static 멤버만 접근 가능
    // 단, 객체를 생성해서 접근하는 건 가능
    public static void method02(){
        b++;
        Count c = new Count();
        c.a = 10;
    }
}
