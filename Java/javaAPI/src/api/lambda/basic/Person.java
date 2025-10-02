package api.lambda.basic;

public class Person {
    public void greeting(Say01 s){
        s.hello();
    }

    public String greeting(Say02 s){
        return s.greeting("hello");
    }
}
