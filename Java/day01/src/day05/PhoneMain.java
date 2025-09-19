package day05;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.info();

        Phone phone2 = new Phone("갤럭시 폴드7", "blue", 2500000);

        phone2.info();
    }
}
