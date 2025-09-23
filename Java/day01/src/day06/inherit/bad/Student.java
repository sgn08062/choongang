package day06.inherit.bad;

public class Student {
    String name;
    int age;
    String studentId;

    String info(){
        return "이름: " + name+ ", 나이: " + age + ", 학번: " +  studentId;
    }
}
