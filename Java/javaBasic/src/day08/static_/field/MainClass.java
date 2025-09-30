package day08.static_.field;

public class MainClass {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.a++;
        c1.b++;

        System.out.println(c1.a + ", "  + c1.b);

        Count c2 = new Count();
        c2.a++;
        c2.b++;

        System.out.println(c2.a + ", "  + c2.b);

        // static 키워드는 객체랑 상관없이 다른 영여겡 1개 만듬
        // static 변수는 객체들 사이에서 공유하는 변수가 됨
        // static 변수는 객체 바깥에 만들어지기 때문에 (클래스명.변수명)으로 사용함

        c1.b = 300;
        System.out.println(Count.b);
    }
}
