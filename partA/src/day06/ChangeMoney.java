package day06;

import java.util.Scanner;

public class ChangeMoney {
	/*
	 * main 메소드는 테스트한 후에는 지우세요. -> MyUtility 클래스처럼 사용하기 위한 목적입니다.
	 * 환전금액 구하기 메소드 만들어 보세요.
	 * 메소드 인자는 2개: int 바꿀 금액, double 환율
	 * 리턴값 : double 환전된 금액. 소숫점 1자리로 반올림.
	 * 일본 : 원화 <-> 엔화   wonToYen, yenToWon 메소드
	 * 미국 : 원화 <-> 달러화  wonToDollor, dollorToWon 메소드
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int balance = 0;
		int money;
		boolean status = true;
		while(status) {
		
		int won;
		int yen;
		int dollor;
		
		double wonyenRate;  //원화 -> 엔화
		double wonyen;      //원화 -> 엔화 변경 후 금액
		double wondollorRate;  //원화 -> 달러화
		double wondollor;   //엔화 -> 달러화 변경 후 금액
		
		double yenwonRate;  //엔화 -> 원화
		double yenwon;      //엔화 -> 원화 변경 후 금액
		double dollorwonRate;   //달러화 -> 원화
		double dollorwon;   //달러화 -> 원화 변경 후 금액
		
		won = 500000;            //엔, 달러 소숫점 반올림해서 적용
				yen = 10000;     //1엔 = 999.36원(9원), 1만엔 = 10만원
				dollor = 2000;   //1달러 = 1336.20원(1336원) 2천 달러 = 267만원
				
				
				switch(won) {
				case 1:
				System.out.println(":::원화 -> 엔화 변경하려고 할 때:::");
				System.out.println("환전할 원화는 얼마?" + won + '원');
				System.out.println("원화 -> 엔화" + yen + '엔');
				yen = sc.nextInt();
					
				case 2:
				System.out.println(":::원화 -> 달러화 변경하려고 할 때:::");
				System.out.println("환전할 원화는 얼마?" + won + '원');
				dollor = sc.nextInt();
					
				case 3:
					
				
				
	}
	}
}
}