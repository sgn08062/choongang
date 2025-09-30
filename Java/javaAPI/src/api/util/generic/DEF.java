package api.util.generic;

public class DEF <T>{ // T 타입은 아직 정해지지 않음 (객체 생성시 지정함)
    private T  t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
