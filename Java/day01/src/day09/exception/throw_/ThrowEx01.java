package day09.exception.throw_;

public class ThrowEx01 {
    public static void main(String[] args) {

    }
    public static int calc(int a) throws Exception{
        if(a<0){
            System.out.println("0보다 큰 값을 전달하세요");
            throw new Exception("매개값을 반드시 양수로 전달하세요"); // try-catch 문장이나 throw구문으로 반드시 예외를 처리
        }
        return 0;
    }
}
