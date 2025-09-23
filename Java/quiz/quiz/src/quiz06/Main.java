package quiz06;

public class Main {
    public static void main(String[] args) {
        SuperSonicAp ap = new SuperSonicAp("F-35", 1);

        ap.takeOff();
        ap.fly();
        ap.flyMode = 0;
        ap.fly();
        ap.land();
        System.out.println(ap.info());
    }
}
