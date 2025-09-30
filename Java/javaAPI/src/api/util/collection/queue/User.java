package api.util.collection.queue;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(){}

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.getName()); // 나의 이름과 쟤의 이름을 compareTo로 비교
    }

    @Override
    public String toString() {
        return  "User{" + "name=" + name + ", age=" + age + '}';
    }
}
