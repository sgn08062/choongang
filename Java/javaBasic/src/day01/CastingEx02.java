package day01;

public class CastingEx02 {
    public static void main(String[] args) {
        //  연산에서의 형변환
        char c = 'c';
        int i = 65;
        // 1. 서로 다른 타입에서 큰 타입에 맞춰서 자동 형변환된다.
        char cc = (char) (c + i);
        System.out.println(cc);
        System.out.println("--------------");

        byte b1 = 100;
        byte b2 =  2;
        // 2. int보다 작은 타입의 연산의 결과는 무조건 int가 된다.
        byte b3 = (byte) (b1 + b2);
    }
}
