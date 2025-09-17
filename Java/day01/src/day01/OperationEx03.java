package day01;

public class OperationEx03 {
    public static void main(String[] args) {
        double d = Math.random(); // 0~1미만의 랜덤수

        int num = (int) (d*10) + 1; //1~11미만의 랜덤 정수

        System.out.println("랜덤수: " + num);

        String result = num >= 5 ? "5 이상" : "5 이하";
        System.out.println(result);

        System.out.println("=======================");
        //1~100까지 랜덤한 정수를 하나 만들고, 랜덤수가 짝수인지 홀수인지 출력해라.
        int ran  = (int)(Math.random()*100) + 1;
        System.out.println("랜덤수: " + ran);
        result = ran%2 == 0 ? "짝수" : "홀수";
        System.out.println(result);
    }
}
