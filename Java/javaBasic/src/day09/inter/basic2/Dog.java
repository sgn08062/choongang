package day09.inter.basic2;

public class Dog extends Animal implements IPet {

	@Override
	public void eat() {
		System.out.println("멍멍이는 사료를 먹어요");
	}

	@Override
	public void play() {
		System.out.println("멍멍이는 밖에서 놀아요");
	}

}
