package day01;

public class CastingEx01 {
    public static void main(String[] args) {
        // 자동 형변환 - 크기가 작은 타입을 큰 타입에 저장할 때, 자동으로 타입변환
        byte b = 10;
        int a = b;
        long l = b;


        char s = '가';
        int i = s;
        System.out.println(i);

        System.out.println("--------------------------");

        // 명시적 형변환 - 큰 타입을 작은 타입으로 넣을 때 캐스팅
        int k = 70;
        char c = (char) k;
        System.out.println(c);

        float f = k;
        System.out.println(f);

        int j = 1000;
        byte b1 = (byte) j;
        System.out.println(b1);
    }
}
