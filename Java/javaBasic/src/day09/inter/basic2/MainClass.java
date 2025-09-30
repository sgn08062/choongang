package day09.inter.basic2;

public class MainClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] arr ={dog, cat, tiger};

        for(Animal a:arr){
            a.eat();
        }

        // 펫 배열
        // Dog는 Animal 타입이지만, 하위클래스가 상위클래스와 연관이 있으면, 상호변환이 된다.

        IPet[] pets = new IPet[3];
        pets[0] = (IPet) dog;
        pets[1] = (IPet) cat;
        pets[2] = new GoldFish();
        for(IPet a:pets){
            if(a == null){continue;}
            a.play();
        }
    }
}
