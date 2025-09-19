package day05;

public class Car {
    String brand;
    int speed = 0;

    Car(String brand){
        this.brand = brand;
    }

    void accelerate(){
        if((speed + 10) > 100){
            System.out.println(brand + "의 속도가 너무 빠릅니다.");
        }
        else speed += 10;
    }

    void brake(){
        if((speed - 10) < 0){
            System.out.println("브레이크 좀 그만 밟아");
        }
        else speed -= 10;
    }

    void getCarInfo(){
        System.out.println("====info====");
        System.out.println("브랜드명: " + brand);
        System.out.println("속도: " + speed);
    }
}
