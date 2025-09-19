package day05;

public class Phone {
    String model;
    String color;
    int price;
    static int phonenumber = 0;
    Phone() {
        model = "보급형";
        color = "black";
        price = 500;
        phonenumber++;
    }
    Phone(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
        phonenumber++;
    }

    public void info(){
        System.out.println("====info====");
        System.out.println("모델명: " + model);
        System.out.println("고유번호: " + phonenumber);
        System.out.println("색상: " + color);
        System.out.println("가격: " + price);
    }
}
