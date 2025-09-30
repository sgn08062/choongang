package day06.inherit.good;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.age  = 15;
        s1.studentId = "2020152025";

        System.out.println(s1.info());
    }
}
