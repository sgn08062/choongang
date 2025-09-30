package day07.poly.basic03;

public class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    String info(){
        return "이름: " + name+ ", 나이: " + age + ", 전공: " +  subject;
    }
}
