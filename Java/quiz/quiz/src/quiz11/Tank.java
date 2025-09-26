package quiz11;

public class Tank extends Unit {

	public Tank() {
		super(0, 0, 100);
	}
	
	//location과 move()의 기능은 동일
	@Override
	public void location() {
		System.out.println("탱크현재위치:" + getX() + "," + getY() );
	}
	
	@Override
	public void move(int x, int y) {
		
		int length = (x - getX()) * (x - getX()) + (y - getY()) * (y - getY());
		int distance =  (int)Math.sqrt(length);
		System.out.println("탱크이동거리:" + distance);
		//위치변경
		setX(x);
		setY(y);
		
		location();
	}
	
	public void changeMode() {
		
	}

	
	
}
