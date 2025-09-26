package quiz09;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market m = new  Market();

        System.out.print("저장할 상품의 개수를 입력하세요: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){
            System.out.print("상품의 종류를 입력하세요[라디오/티비]: ");
            String product = sc.next();
            sc.nextLine();

            if(product.equals("라디오")){
                System.out.print("상품의 이름을 입력하세요: ");
                String name = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();
                sc.nextLine();

                Radio radio = new Radio(name, price);
                m.barcode(radio);
            }else if(product.equals("티비")){
                System.out.print("상품의 이름을 입력하세요: ");
                String name = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();
                sc.nextLine();

                Tv tv = new Tv(name, price);
                m.barcode(tv);
            }
        }

        System.out.print("저장된 상품 목록을 불러오시겠습니까? [y/n]: ");
        char c = sc.next().charAt(0);

        if(c=='y'){
            m.printAll();
        }
    }
}
