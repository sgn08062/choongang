package day09.inter.basic3;

public class LG implements Printed{
    public void print(String document){
        System.out.println("LG: " + document);
    }

    public void colorPrint(String color){
        System.out.println(color + "색상 프린트를 출력합니다.");
    }

    public int copy(int page){
        for(int i=1;i<=page;i++){
            System.out.println(i + "장 복사");
        }

        return page;
    }
}
