package partB.day14;

public class LadderShape extends Shape {
	
	private int topLength;                 //윗변
	private int bottomLength;              //아랫변
	private String radius;
	
	//부모 클래스의 width=0으로 사용하지 않음. 생성자/getter와 setter/toString 재정의
	//사다리꼴 넓이 구하는 공식으로 메소드 재정의해보세요.
	public LadderShape(String shapName, int height, int topLength, int bottomLength) {
		super(shapName, 0, height);
		this.topLength = topLength;
		this.bottomLength = bottomLength;
	}
	
	//day15에 추가. 자식 LadderShaper의 인스턴스 메소드
	public void iamLadder() {
		System.out.println("I am Ladder. - " + super.getShapeName());
		System.out.println("반지름 = " + radius);
	}
	public int area() {
		int sum = topLength + bottomLength;
		return sum*getheight()/2;
		
	}
	private int getheight() {
		return 0;
	}

	//toString 재정의하세요. Shape의 toString() 활용하려면?
	@Override
	public String toString() {
		return super.toString() + ", 윗변 : " + topLength + ", 아랫변 : " + bottomLength;
	}

}
