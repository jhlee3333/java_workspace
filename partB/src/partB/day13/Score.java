package partB.day13;

//day12 Score 클래스로 생성자 동작 확인. 기본생성자 동작 여부를 day12의 Score 클래스와 비교가 핵심.
public class Score {
	
	private String name;
	private int korea;
	private int english;
	private int science;
	
	//생성자를 day13에서 배우고 나서 보니, 여기는 기본 생성자가 생략된 상태로
	//객체 생성 시에는 기본 생성자만 실행이 가능합니다.
	
	public Score(String name, int korea, int english, int science) {
		//this();            //오류:기본생성자가 없다.
		this.name=name;
		this.korea=korea;
		this.english=english;
		this.science=science;
	}

	public Score() {
	}
	public int sum() {
		return korea + english + science;
	}
	public String getName() {return name;}
	public int getKorea() {return korea;}
	public int getEnglish() {return english;}
	public int getScience() {return science;}
	
	public void setName(String name) {this.name = name;}
	public void setKorea(int korea) {this.korea = korea;}
	public void setEnglish(int english) {this.english = english;}
	public void setScience(int science) {this.science = science;}
		
	public double average() {
		return (double)sum()/3;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", korea=" + korea + ", english=" + english + ", science=" + science + "]";
	}
	
}
