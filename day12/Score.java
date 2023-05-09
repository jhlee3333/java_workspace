package partB.day12;

//sum(), average() 메소드는 인스턴스 필드로 계산한 결과를 리턴하는 인스턴스 메소드
import java.util.Arrays;

public class Score {
	
	private String name;
	private int korea;
	private int english;
	private int science;
	//매개변수가 있는 생성자(오버로딩)를 만들었다면, 기본생성자 사용하고 싶을 때 꼭 정의를 해야 합니다.
	//이 Score 클래스는 기본 생성자로 객체를 생성할 수 없습니다.
	//인스턴스 메소드로 만듭니다.
	public int sum() {
		return korea + english + science;
	}
	
	public int getKorea() {return korea;}
	public int getEnglish() {return english;}
	public int getScience() {return science;}
	
	public void setName(String name) {this.name = name;}
	public void setKorea(int korea) {this.korea = korea;}
	public void setEnglish(int english) {this.english = english;}
	public void setScience(int science) {this.science = science;}
		
	public double average() {
		return (double)sum()/3;
		
		public String score() {
			/*return String.format("이름 : %s, 성적[국어:%d, 영어:%d, 과학:%d]\n",
		     *name, korea, english, science);
		     *
		     */
			return String.format("이름 : %s, 성적[국어:%d, 영어:%d, 과학:%d], 총점:%d, 평균:%.2f\n",
					name, korea, english, science, sum(), average());
		}
		
	}

	public String score() {
		return null;
	}

	}
	
	