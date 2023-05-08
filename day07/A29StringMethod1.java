package day07;

import java.util.Scanner;

public class A29StringMethod1 {

	public static void main(String[] args) {
		//문자열 데이터를 위한 변수 선언 : 참조타입
		String name = "momo";
		String address = "Seoul";
		String message = "Hi~ Hello~ !!";
		
		System.out.println("name = " + name);
		System.out.println("address = " + address);
		System.out.println("message = " + message);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("웰컴 메시지 입력하세요. >>>>");
		message = sc.nextLine();
		
		System.out.println("보낸 메시지 =" + message);
		System.out.println(":::: String의 핵심기능 메소드 ::::");
		System.out.println("1. 문자열의 길이를 구해주는 메소드 - length");            //리턴은 int 형식
		System.out.println("message.length() = " + message.length());
		System.out.println("address.length() = " + address.length());
		System.out.println("name.length() = " + name.length());
		
		System.out.println("2. 문자열의 문자들이 같은지 비교하는 메소드 - equals");
		System.out.println("name.equals(\"momo\") = " + name.equals("momo"));           //name이 "momo"와 같은지 참 또는 거짓 리턴
		System.out.println("name.equals(\"Momo\") = " + name.equals("Momo"));
		System.out.println("address.equals(\"Seoul\")" + address.equals("Seoul"));
		System.out.println("address.equals(\"seoul\")" + address.equals("seoul"));
		//동등비교 기호(관계연산) : ==, !=은 문자열의 내용을 비교할 때는 사용 못합니다.
		
		System.out.println("3. 대소문자 변환 메소드 - toUpperCase, toLowerCase");
		//리턴은 String 형식
		System.out.println(name.toUpperCase());               //모든 문자들을 대문자로 변환
		System.out.println(address.toUpperCase());
		System.out.println(name.toUpperCase());               //모든 문자들을 소문자로 변환
		System.out.println(address.toUpperCase());
		
		//참고 : 아래와 같은 원시 타입 age는 메소드가 없습니다
		//int age = 23;
		System.out.println("4. 문자열의 특정 위치의 문자 1개를 가져오기 - charAt");
		//인자는 int 1개, 리턴 타입은 char 
		int i=0;     //문자열의 첫번째 문자 위치는 0으로 시작합니다. 위치는 index라고 부릅니다.
		System.out.println("name.charAt(0) =" + name.charAt(i));                //i=0 , 리턴 'm'
		i++;
		System.out.println("name.charAt(1) =" + name.charAt(i));                //i=1 , 리턴 'o'
		i++;
		System.out.println("name.charAt(2) =" + name.charAt(i));                //i=2 , 리턴 'm'
		i++;
		System.out.println("name.charAt(3) =" + name.charAt(i));                //i=3 , 리턴 'o'
		
	}

}
