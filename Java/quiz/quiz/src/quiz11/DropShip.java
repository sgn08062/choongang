package quiz11;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class DropShip extends Unit {
	
	public Unit[] unit = new Unit[8];
	public int index = 0;
	
	public DropShip() {
		super(0, 0, 60);
	}
	
	/*
	 * location()의 기능은 동일합니다
	 */
    public void location() {
        System.out.println("수송선현재위치:" + getX() + "," + getY() );
    }

	/*
	 * move()은 마린과 동일함
	 * 단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치를 수송선의 위치로 바꾼다.
	 * 
	 */
    public void move(int x, int y){
        int length = (x-getX())*(x-getX())+(y-getY())*(y-getY());
        int distance = (int)Math.sqrt(length);
        System.out.println("수송선이동거리: " + distance);
        setX(x);
        setY(y);
        location();

        for(Unit unit : unit){
            if(unit != null){
                unit.setX(x);
                unit.setY(y);
            }
        }
    }

	/*
	 * void ride(모든 유닛을 받도록 선언)
	 * 
	 * 1. 배열의 크기는 8이고, 수송선 배열에는 탱크와, 마린이 탈 수 있다.
	 *    탱크는 배열을 4칸씩 사용한다. 마린은 배열을 1칸씩 사용
	 * 
	 * 2. 배열에 유닉이 탈수 있으면 유닛을 배열에 저장합니다.(탱크가 배열에 타면 인덱스를 4칸 처리)   
	 *    배열이 전부 차거나, 탈수 있는 공간이 없으면 "수송선에 공간이 부족합니다"를 출력
	 *    
	 * 3. 수송선에 탄 유닛을 가로로 출력한다.
	 * 
	 * main에서 Marine객체 4마리 생성, 탱크 2대, 수송선 1대 생성하고, 수송선에 넣어서 확인
	 */
    public void ride(Unit unit){
        if(unit instanceof Tank){
            if(carrier(4)){
                this.unit[index] = unit;
                index += 4;
            }
            else {
                System.out.println("수송선에 공간이 부족합니다");
                return;
            }
        }
        if(unit instanceof Marine){
            if(carrier(1)){
                this.unit[index] = unit;
                index++;
            }
            else {
                System.out.println("수송선에 공간이 부족합니다");
                return;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append("현재 탑승 유닛: [ ");

        String result = Arrays.stream(this.unit) // 배열을 스트림으로 변환
                .filter(Objects::nonNull)             // null이 아닌 유닛만 필터링
                .map(u -> u instanceof Tank ? "탱크" : "해병") // 유닛을 이름(String)으로 변환
                .collect(Collectors.joining(", "));   // ", "를 구분자로 하여 최종 문자열로 결합

        sb.append(result);

        sb.append(" ]");
        System.out.println(sb.toString());
    }

    private boolean carrier(int man){
        return this.index + man <= 8;
    }
}
