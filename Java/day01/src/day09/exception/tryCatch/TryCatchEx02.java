package day09.exception.tryCatch;

public class TryCatchEx02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        int i=0;
        while(i<5){
            try{
                System.out.println(arr[i]);
            }catch(Exception e){
                System.out.println("예외가 발생했습니다. " + e.getMessage());
            }finally{
                System.out.println("예외가 발생하든, 발생하지 않든 무조건 실행 된다.");
            }
            i++;
        }
    }
}
