package partB.day12;

import java.util.Arrays;

//Member 클래스의 객체를 비교 가능하도록 인터페이스 사용하기
public class Member implements Comparable<Member> {
	private String id;
	private String name;
	private int age;
	private double point;
	private String[] message;              //getter와 setter는?
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	//private 필드에 대한 접근 메소드 : getter(읽기), setter(쓰기)
	//getter : 현재 필드값을 리턴하는 형식 필요
    public String getId() {return id;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public double getPoint() {return point;}
	public String[] getMessage() {return message;}
	//setter : 인자값을 받을 매개 변수 선언 필요
	public void setId(String id) {this.id=id;}
	public void setName(String name) {this.name=name;}
	public void setAge(int age) {this.age=age;}
	public void setPoint(double point) {this.point=point;}
	public void setMessage(String[] message) {this.message=message;}
	
	//객체 필드값 정보 리턴
	public String member() {
		return String.format("id=%s, name = %s, age = %d, point = %.1f, message = %s\n",
				            id, name, age, point, Arrays.toString(message));
	}
	
	//Comparable<Member> 인터페이스의 추상 메소드 정의하기
	@Override
	public int compareTo(Member o) {
		// name 필드를 비교한다면     //this.name과 인자 객체인 o의 name 비교
		//return this.name.compareTo(o.getName());
		//age 필드로 비교한다면  //age 필드는 int 형이므로 뺄셈식으로 리턴
		return this.age-o.age;
	}

}
