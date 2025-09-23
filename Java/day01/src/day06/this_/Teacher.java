package day06.this_;

public class Teacher extends Person {
    String subject;

    String info(){
        return "이름: " + name+ ", 나이: " + age + ", 전공: " +  subject;
    }
}
