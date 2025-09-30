package day06.super_.basic01;

public class Parent {
    String father, mother;

    Parent(String father, String mother) {
        this.father = father;
        this.mother = mother;
    }
    void method01(){
        System.out.println("부모님의 1번 메서드 실행");
    }
    void method02(){
        System.out.println("부모님의 2번 메서드 실행");
    }
}
