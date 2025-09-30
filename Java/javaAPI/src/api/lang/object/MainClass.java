package api.lang.object;

public class MainClass {
    public static void main(String[] args) throws Throwable {

        /*
        equals() - 객체의 주소값을 비교 true, false
        toString() - 객체 주소를 문자열로 출력
        hashCode() - 객체의 고유한 주소값을 숫자로 변환
        finalize() - 객체가 사라지는 시점에 호출되는 메서드(deprecated = 없어질 메서드니까 쓰면 안됨)
        clone() - 객체 자체를 복사해서 반환
        */
        Person p = new Person("홍길동");
        Person p2 = new Person("홍길동");


        System.out.println(p.equals(p2));
        System.out.println(p.toString());
        System.out.println(p.hashCode());

        //p.finalize();
        // 가비지 컬렉터가 호출될때 객체가 사라지게 되는데, 이 순서를 보장하지 않기 때문에 사용이 권장되지 않는다.

        Object p3 = p.clone();
        System.out.println(p3.toString());
    }
}
