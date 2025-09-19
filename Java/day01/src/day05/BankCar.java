package day05;

public class BankCar {
    public static void main(String[] args) {
        Car car1 = new Car("Ford");
        Car car2 = new Car("Ferrari");

        int i=0;
        while(i<5){
            car1.accelerate();
            i++;
        }

        i=0;
        while(i<11){
            car2.accelerate();
            i++;
        }
        car1.getCarInfo();
        car2.getCarInfo();

        car1.brake();
        car1.brake();
        car2.brake();
        car2.brake();
        car2.brake();
        car2.brake();
        car1.getCarInfo();
        car2.getCarInfo();

        System.out.println("\n\n\n");

        BankAccount b1 = new BankAccount("LeeKyunghun", 299000);
        BankAccount b2 = new BankAccount("LeeMinsuk", 2040000);

        b1.deposit(100000);
        b2.deposit(400000);

        System.out.println("b1의 잔고: " + b1.getBalance());
        System.out.println("b2의 잔고: " + b2.getBalance());

        b1.withdraw(200000);
        b2.withdraw(800000);

        System.out.println("b1의 잔고: " + b1.getBalance());
        System.out.println("b2의 잔고: " + b2.getBalance());
    }
}
