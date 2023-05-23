package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C18ThrowsTest {
	
	//어떠한 RuntimeException이 생기는지 확인하기
	//            ㄴ   NullPointerException, InputMismatchException, NumberFormatException의 부모클래스입니다.
	public static void main(String[] args) {
		
		try {
			inputData();
			
			
		}catch (InputMismatchException | NullPointerException e) {
			//한 개의 | 연산은 비트 단위의 or 연산입니다.(논리연산 or이 아닙니다.)
			// catch에서 여러 개의 예외를 다룰 때에는 비트연산 or 을 사용해야 합니다.
			//여러 예외 처리에 대해 처리할 내용이 같을 때 쓰는 방식입니다.
			
			System.out.println("정수 입력 예외 : 반드시 숫자만 입력해야 합니다.");
		}

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