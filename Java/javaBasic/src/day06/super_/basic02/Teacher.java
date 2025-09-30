package day06.super_.basic02;

public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    String info(){
        return "이름: " + name+ ", 나이: " + age + ", 전공: " +  subject;
    }
}
