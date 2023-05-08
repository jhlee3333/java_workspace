package day10;

import java.util.Arrays;
	
//call by value : 메소드 인자로 데이터 값을 전달. 메소드 인자가 원시 타입
//call by reference : 메소드 인자로 객체의 참조값 전달. 메소드 인자가 배열 또는 클래스 타입.
	public class A40CallByRef {
	
	public static void main(String[] args) {
		int test = 100;
		changeTest(test);
		System.out.println("changeTest 실행 후 test = " + test);
		
		int[] intArr = {1,2,3,4,5};
		changeIntArr(intArr);
		System.out.println("changeIntArr 실행 후 intArr =" + Arrays.toString(intArr));
		
		//String temp = "hello";
		String temp = new String("hello");
		changeString(temp);
		System.out.println("changeString 실행 후 main 지역변수 temp =" + temp);
		
		//String 불변 객체인가 확인
		String temp2="hello";
		System.out.println(temp.hashCode());
		System.out.println(temp2.hashCode());
		System.out.println("temp==temp2 ?" + (temp==temp2));
		
		//"hello"가 이미 있지만 그래도 새로 만들자.
		String temp3="hello";
		System.out.println(temp.hashCode());
		System.out.println(temp3.hashCode());
		System.out.println("temp==temp3 ?" + (temp==temp3));
		System.out.println("**temp.equals(temp3) ?" + temp.equals(temp3));
		//문자열 해시코드값은 문자열 구성이 같으면 동일하도록 변경(override)되어 있어 객체는 다르지만 해시코드 값은 같습니다.
		
		private static void changeString(String temp) {
			temp = temp.replace("11", "**");    //문자열은 문자열 내용이 바뀌면 객체의 위치가 바뀝니다.(불변 객체)
			                                    //->temp의 참조값이 바뀝니다.
			System.out.println("changeString 메소드 지역변수 temp =" + temp);
		}
		
		private static void main changeIntArr(int[] temp) {
		//temp는 changeIntArr 메소드의 지역변수이다. 메소드가 changeIntArr(intArr); 실행될 때
			//intArr 배열의 참조값을 temp가 전달받아 저장합니다.
			temp[3]=100;
		
		}
		
		private static void changeTest(int test) {
			test = 200;
		}
	}
	
	private static void changeString(String temp) {
		// TODO Auto-generated method stub
		
	}

	private static void changeIntArr(int[] intArr) {
		// TODO Auto-generated method stub
		
	}

	private static void changeTest(int test) {
		// TODO Auto-generated method stub
		
	}
}
