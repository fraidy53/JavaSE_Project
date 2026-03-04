package workshop.animal.entity;

public class Spider extends Animal{
	public Spider() {
//		super(); // 부모 생성자 부르는 것
		super(8);
	}
	
	// 추상 메서드는 반드시 오버라이딩 하기
	// 부모 클래스의 메서드를 자식 클래스에서 다시 정의(재작성)하는 것
	@Override
	public void eat() {
		System.out.println("Spider는 작은 벌레를 먹어요!!");		
	}
}
