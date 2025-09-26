package day09.inter.basic3;

public class Samsung implements Printed{
    @Override
    public void print(String document) {
        System.out.println("삼성: " + document);
    }

    @Override
    public void colorPrint(String color) {
        System.out.println("삼성: " + color);
    }

    @Override
    public int copy(int page) {
        System.out.println("삼성: 복사 " + page);
        return page;
    }
}
