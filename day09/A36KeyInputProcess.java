package day09;

import java.util.Scanner;

public class A36KeyInputProcess {
	//nextLine()과 nextInt() 2개 메소드를 같이 사용할 때 문제점.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("문자열 입력 후 정수 입력~~");
		System.out.print("이름 입력하세요. >>>");
		name = sc.nextLine();
		
		System.out.print("나이 입력하세요. >>>");
		age = sc.nextInt();
		
		System.out.println("name = " + name + ",age=" + age);
		
		System.out.println("\n정수 입력 후 문자열 입력~~ ");
		
		System.out.print("나이 입력하세요. >>>");
		age = sc.nextInt();
		
		System.out.print("이름 입력하세요. >>>");
		name = sc.nextLine();
		
		System.out.println("name = " + name + ",age=" + age);
		
		sc.close();

	}

}
