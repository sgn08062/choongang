package day06.this_;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(this);
    }
    Person(String name){
        this(name, 0);
    }
    Person(){
        this("", 0);
    }
    String info(){
        return "이름: " + name + ", 나이: " + age;
    }
}
