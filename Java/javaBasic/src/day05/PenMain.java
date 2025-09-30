package day05;

public class PenMain {
    public static void main(String[] args) {
        // Pen 클래스를 사용하려면 "객체"로 생성함
        Pen red = new Pen();
        red.ink = "red";
        red.price = 1000;
        red.write();

        Pen green = new Pen();
        green.ink = "green";
        green.price = 2000;
        green.write();
    }
}
