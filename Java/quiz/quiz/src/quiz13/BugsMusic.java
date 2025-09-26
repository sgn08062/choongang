package quiz13;

public class BugsMusic implements SongList{
	
	private String[] list = new String[100];
	private int count = 0;
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */

    public void insertList(String song){
        list[count] = song;
        count++;
        System.out.println(song+"을 저장하였습니다.");
    }
    public void playList(){
        for(int i=0;i<count;i++){
            System.out.println(list[i]);
        }
    }
    public int playLength(){
        return count;
    }
	
}
