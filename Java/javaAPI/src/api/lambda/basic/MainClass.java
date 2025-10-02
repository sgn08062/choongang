package api.lambda.basic;

public class MainClass {
    public static void main(String[] args) {

        Person p = new Person();

        // 코드가 한줄이면 {} 생략 가능
        p.greeting(() -> {
            System.out.println("안녕!!!!");
        });

        // 익명객체
        String result = p.greeting(new Say02(){
            @Override
            public String greeting(String word) {
                return word.repeat(3);
            }
        });
        System.out.println(result);

        // 람다식
        // 람다식에서 매개변수의 타입은 생략된다.
        String resultLambda = p.greeting((word) ->{
            return word.repeat(3);
        });

        System.out.println(resultLambda);

        // 매개변수가 1개면 () 생략 가능
        // 코드가 한줄이면 {} 생략 가능
        String resultLambda2 = p.greeting(word->word.repeat(2));

        System.out.println(resultLambda2);
    }
}
