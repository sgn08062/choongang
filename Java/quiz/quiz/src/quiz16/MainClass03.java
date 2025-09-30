package quiz16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass03 {
    public static void main(String[] args) throws IOException {
        // 메뉴를 입력받고, 메뉴에 따라서 기능을 구현
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 유저를 저장할 수 있는 List 선언
        ArrayList<User> users = new ArrayList<>();

        while(true){
            System.out.println("[1. 회원추가, 2. 회원찾기, 3. 회원삭제]");
            int menu = Integer.parseInt(br.readLine());

            if(menu == 1){
                // 이름과, 나이를 입력받아서 list에 추가
                String name =  br.readLine();
                int  age = Integer.parseInt(br.readLine());
                users.add(new User(name,age));
            }else if(menu == 2){
                // 이름을 입력받아서, 이름이 있으면 정보를 출력, 없으면 "찾는 회원은 없습니다
                String name =  br.readLine();
                boolean y = false;
                for(User u : users){
                    if(u.getName().equals(name)){
                        System.out.println("이름: " + u.getName() +
                                ", 나이: " + u.getAge());
                        y = true;
                        break;
                    }
                }
                if(!y) System.out.println("찾는 회원이 없습니다");
            }else if(menu == 3){
                // 삭제할 이름을 입력 받아서, 있으면 삭제하고 없으면 "찾는 회원은 없습니다"
                String name =  br.readLine();
                boolean y = false;
                for(User u : users){
                    if(u.getName().equals(name)){
                        users.remove(u);
                        System.out.println(u.getName() +" 회원이 삭제되었습니다.");
                        y = true;
                        break;
                    }
                }
                if(!y) System.out.println("찾는 회원이 없습니다");
            }
        }
    }
}
