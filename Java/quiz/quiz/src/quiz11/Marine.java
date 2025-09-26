package quiz11;

public class Marine extends Unit {
	
	/*
	멤버변수
	마린은 attack = 6이고, armor가 0 입니다.
	단, 모든 마린은 똑같은 공격력과 똑같은 방어력을 가져요.
	*/
    private final static int attack = 6;
    private final static int armor = 6;
	
	/*
	생성자
	마린은 생성될때 좌표는 0, 체력은 60은로 생성됩니다.
	*/
    public Marine() {
        super(0, 0, 60);
    }

	/*
	 * location()의 기능
	 * 마린의 현재위치 x, y의 출력
	 */
    public void location(){
        System.out.println("해병현재위치: " + getX() + ", " + getY());
    }
	
	/*
	 * move()의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구한다
	 *    루트 근사값은 Math.sqrt(제곱근)을 이용하면 됩니다
	 *    
	 * 2. 현재 좌표값을 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 * 4. location() 메서드를 호출   
	 */

    public void move(int x, int y){
        int moveX = x - this.getX();
        int moveY = y - this.getY();
        setX(x);
        setY(y);
        int distanceX = moveX*moveX;
        int distanceY = moveY*moveY;
        int distance = (int) Math.sqrt(distanceX + distanceY);

        System.out.println("이동한 거리: " + distance);
        location();
    }
	
	
	
}
