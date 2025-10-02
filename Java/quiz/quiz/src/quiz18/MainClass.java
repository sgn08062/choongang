package quiz18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        /*
            1. Random클래스를 활용해서 1~45까지의 랜덤한 번호를 생성
            2. Set을 이용해서 6개의 고유한 로또번호를 만들어내는 프로그램 코드를 작성
        */

        Random r = new Random();

        Set<Integer> set = new HashSet<Integer>();

        while(set.size() <= 6){
            set.add(r.nextInt(44) + 1);
        }
        // 로또번호 생성 완료
        System.out.println("금주의 로또번호는!!");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("입니다");
    }
}
