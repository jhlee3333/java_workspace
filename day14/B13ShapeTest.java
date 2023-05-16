package partB.day14;

public class B13ShapeTest {

	public static void main(String[] args) {
		
		//Shape, Triangle, Circle 객체를 1개씩 생성해보세요. 변수명은 s, t, c
		
		Shape s = new Shape("도형", 100, 100);
		Triangle t = new Triangle();
		Circle c = new Circle(65.3);
		
		System.out.println(s.toString());
		System.out.println(s);          //객체 뒤에 .toString() 생략된 코드
		System.out.println(t.toString());
		System.out.println(t);
		System.out.println(c.toString());
		System.out.println(c);
		
		//테스트를 Shape에 toString을 주석처리 후 실행해 보세요.
		/*
		 * 결과는 toString()을 다시 정의한 것이 없을 때는 아래와 같습니다.
		 * 보기 좋게 필드값 출력하기 위해 toString() 메소드를 다시 정의한 것입니다.
		 * partB.day14.Shape@6504e3b2
		 * partB.day14.Shape@6504e3b2
		 * partB.day14.Traingle@379619aa
		 * partB.day14.Traingle@379619aa
		 * partB.day14.Circle@cac736f
		 * partB.day14.Circle@cac736f
		 * 
		 */
		
		System.out.println("3개 도형의 넓이를 구해 봅시다.");
		System.out.println("s 넓이 = " + s.area());
		System.out.println("t 넓이 = " + t.area());
		System.out.println("c 넓이 = " + c.area());
		}
	

}
