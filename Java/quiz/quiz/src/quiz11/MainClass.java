package quiz11;

public class MainClass {
    public static void main(String[] args) {
        Marine m1 =  new Marine();
        Marine m2 =  new Marine();
        Marine m3 =  new Marine();
        Marine m4 =  new Marine();

        Tank t1 =  new Tank();
        Tank t2 =  new Tank();

        DropShip d1 =  new DropShip();

        m1.move(4, 1);
        m2.move(8, 5);
        m3.move(5, 2);
        m4.move(7, 3);

        t1.move(2, 5);
        t2.move(7, 7);

        d1.move(4, 5);

        d1.ride(t1);
        d1.ride(m2);
        d1.ride(m4);
        d1.ride(t2);

        d1.move(8, 2);

        t1.location();
        m2.location();
        m4.location();
        m1.location();
    }
}
