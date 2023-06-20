package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C18ThrowsTest2 {
	
	//어떠한 RuntimeException이 생기는지 확인하기
	//            ㄴ   NullPointerException, InputMismatchException, NumberFormatException의 부모클래스입니다.
	public static void main(String[] args) {
		// main에서 예외를 throws하면 JVM이 위임받게 되고 결국은 try ~ catch 처리하기 이전과 같은 결과가 됩니다.
		
			inputData();
	}

	
	public static void inputData() throws InputMismatchException{
		//InputMismatchException 예외는 inputData 메소드를 호출한 main으로 위임(떠넘기기) 합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력하세요.(1) >>>");
		int a = sc.nextInt();    //java.util.InputMismatchException
		                         //숫자가 아닌 문자 입력하면 정수로 처리(nextInt)할 수 없어서 발생합니다.
		System.out.println("입력 값(1) = " + a);
		
		sc.nextLine();       //위의 nextInt()가 가져가지 않은 문자 엔터를 처리하기 위한 명령.
		
		System.out.println("정수 입력하세요.(2) >>>");
		a = Integer.parseInt(sc.nextLine());         //java.lang.NumberFormatException
		                         //숫자가 아닌 문자 입력하면 정수로 처리(parseInt)할 수 없어서 발생합니다.
		System.out.println("입력 값(2) = " + a);
	}

}