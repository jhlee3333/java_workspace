package partA.day04;

import java.util.Scanner;

public class SumToN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int start, end;
		int total = 0;
		
		System.out.println("1~N까지 합계 구하기");
		System.out.println("시작값 start");
		start = sc.nextInt();
		System.out.println("마지막값 end");
		end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {  
		
		System.out.println(start + " ~ " + end + "까지의 합계 : " + total);
		sc.close();
		int sum = 0;
		for(int a=1; a<11; a=a+1) {
			sum=sum+a;
			System.out.println(sum);
		sum=sum+1;
		sum=sum+2;
		sum=sum+3;
		sum=sum+4;
		sum=sum+5;
		sum=sum+6;
		sum=sum+7;
		sum=sum+8;
		sum=sum+9;
		sum=sum+10;
			System.out.println(a+"+");
		for(; a<10; a=a+1) {
	
	}
		}
}
}
}