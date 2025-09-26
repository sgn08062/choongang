package day08.final_.method;

public class Child extends Parent {
    //public void method01(){}

    // final 변수는 변경금지
    public final String nation = "한국";
    public final String ssn;
    public String name;

    public Child(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
