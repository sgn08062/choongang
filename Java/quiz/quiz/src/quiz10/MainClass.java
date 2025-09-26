package quiz10;

public class MainClass {
    public static void main(String[] args) {
        MyArrays newArray = MyArrays.getInstance();
        int[] arr = {1,2,3,4,5,9,8,7,6,5};

        System.out.println(newArray.ArrayToString(arr));
    }
}
