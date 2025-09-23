package quiz04;

public class MainClass {
    public static void main(String[] args) {
        Ebook e1 = new Ebook("개미", "베르나르 베르베르", 50000, 500);
        Ebook e2 = new Ebook("혼공C", "컴공교수님", 23000, 1300);


        System.out.println(e2.toString());
        System.out.println("이 책의 이름은 개미인가요?: " + e2.findBook("개미") + "입니다.");
        System.out.println("이 책은 그 책보다 저렴한가요?: " + e1.findBook(e2.price));
    }
}
