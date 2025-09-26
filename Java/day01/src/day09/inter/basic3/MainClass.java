package day09.inter.basic3;

public class MainClass {
    public static void main(String[] args) {
        // 인터페이스를 통해서 클래스를 동작 시킴
        Printed lg = new LG();

        Printed samsung = new Samsung();

        lg.print("Hello World");
        lg.colorPrint("red");
        lg.copy(10);

        samsung.print("Hello World");
        samsung.colorPrint("red");
        samsung.copy(10);
    }
}
