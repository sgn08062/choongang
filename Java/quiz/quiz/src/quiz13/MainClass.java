package quiz13;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. 멜론뮤직, 2. 벅스뮤직");
        int choice = scan.nextInt();
        SongList list = null;
        if(choice == 1){ list = new MelonMusic();}
        else if(choice == 2){ list = new BugsMusic();}
        while(true){
            System.out.println("메뉴를 선택하세요.");
            System.out.println("메뉴: 1.저장, 2.재생, 3.목록개수 >");

            int menu =  scan.nextInt();

            if(menu == 1){
                System.out.println("음악>");
                String song = scan.next();
                list.insertList(song);
            }
            else if(menu == 2){
                list.playList();
            }else if(menu == 3){
                System.out.println(list.playLength());
            }
        }
    }
}
