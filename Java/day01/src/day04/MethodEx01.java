package day04;


public class MethodEx01 {
    public static void main(String[] args) {
        // 메서드는 클래스 안, main 밖에 만든다.

        hello();
        some(4, 7);
        int sum = sum();
        System.out.println(sum);
        String str = ranString(3, "hi");
        System.out.println(str);

        sayHello("bye");
        sayHello("hello");
    }

    // 매개변수 x, 반환 x
    static void hello(){
        System.out.println("hello");
    }

    // 매개변수 o, 반환 x
    static void some(int a, int b){
        System.out.println(a+b);
    }

    // 매개변수 x, 반환 o
    static int sum(){
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }

        return sum;
    }

    // 매개변수 o, 반환 o
    static String ranString(int a, String b){
        String sum = "";
        for(int i=1; i<=a;i++){
            sum += b;
        }
        return sum;
    }

    static void sayHello(String str){
        // 반드시 hello 문자열이 전달되야 하는 메서드
        if(!(str.equals("hello"))){
            System.out.println("hello 문자열을 넘겨주세요");
            return;
        }
        System.out.println(str);
    }
}
