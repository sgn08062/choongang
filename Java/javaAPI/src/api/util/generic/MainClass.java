package api.util.generic;

public class MainClass {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.setObj("홍길동");
        String name = String.valueOf(abc.getObj());
        System.out.println(name);

        // 값을 꺼내쓸 때마다 저장된 타입을 캐스팅 해줘야함
//        abc.setObj(new int[3]);
//        abc.getObj();

        System.out.println("---------------------------");

        //DEF def = new DEF(); // 뭐든지 저장할 수 있는 Object 타입으로 지정

        // 타입을 지정해서 생성함
        DEF<String> def = new DEF<>();

        def.setT("홍길동");
        String s = def.getT();

        DEF<Integer> def2 = new DEF<>();
        def2.setT(500);
        int i = def2.getT();
    }
}
