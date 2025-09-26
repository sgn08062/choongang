package quiz10;

public class MyArrays {
    // 1. 이 클래스를 외부에서 생성할 수 없도록 생성자에 private를 붙임
    // 2. Arrays.toString() 메서드를 따라해보기

    private static MyArrays myArrays = new MyArrays();

    private MyArrays() {}

    public static MyArrays getInstance() {
        return myArrays;
    }

    public String ArrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length-1;i++){
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]).append("]");

        return String.valueOf(sb);
    }
}
