package day06;

public class A26MyUtilityTest {
	
	public static void main(String[] args) {
		
		//MyUtility의 static 즉 클래스 메소드를 테스트합니다. 사용방법은 클래스이름.메소드()
		//private은 다른 클래스에서 사용할 수 없는 접근 제한입니다.
		//int code = MyUtility.toAscii("$");         //오류 : private 메소드
		
		MyUtility.alphabetPrint(0);
		MyUtility.alphabetPrint(1);
		
		double result = MyUtility.sumThreeDouble(3, 4, 5.2);
		System.out.println("result =" + result);
	}

}
