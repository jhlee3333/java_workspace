package partB.day14;

//ClassA의 자식 클래스 : extends (확장하다)
public class ClassAA extends ClassA {

	double point;
	
	//기본 생성자가 생략된 상태. 기본 생성자로만 객체를 생성해야 합니다.
	//생략된 기본생성자 *참고:this는 현재 자신의 객체. super는 부모 객체.
	public ClassAA() {
		super();         //부모 생성자 호출. 생략된 형식으로 사용됨.
	}
	
	//2) 자식 클래스 생성자는 부모 클래스 생성자를 먼저 호출(실행)합니다.
	//   부모 클래스의 객체가 만들어지고, 자식 필드와 메소드로 추가되어 확장되는 객체가 생성(자식 생성자 실행)
	public void print() {
		System.out.println("포인트 = " + point);
	}

}
