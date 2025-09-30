package quiz16;

import java.util.ArrayList;

public class MainClass02 {
    public static void main(String[] args) {
        /*
         * 1. User클래스를 저장할 수 있는 ArrayList선언
         * 2. User객체를 2개 생성해서 리스트에 추가하세요.
         *
         * 3. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
         * 4. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
         *
         * 5. list에 "홍길동" 이 있다면 객체를 삭제.
         */
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("홍길동", 25));
        users.add(new User("이순신", 43));
        users.add(new User("홍길자", 100));

        for(User u: users){
            System.out.println("이름: " + u.getName() + ", 나이: " + u.getAge());
        }
        System.out.println("====================================");

        for(User u: users){
            if(u.getName().equals("홍길자")) {
                System.out.println("이름: " + u.getName() + ", 나이: " + u.getAge());
                break;
            }
        }

        System.out.println("====================================");
        for (int i = users.size() - 1; i >= 0; i--) {
            User u = users.get(i);
            if (u.getName().equals("이순신")) {
                users.remove(i); // 인덱스로 삭제
                continue;
            }
            System.out.println("이름: " + u.getName() + ", 나이: " + u.getAge());
        }
    }
}
