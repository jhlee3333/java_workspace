package day07;

import java.util.Scanner;

public class A28ChangeMoneyTest {
	
	public static void main(String[] args) {
		
		
		int won;
		double changeYen;
		double changeDollor;
		double oneYenWon = 1000.86/100;       //네이버환율 계산기 100엔 기준으로 표시
		double oneDollorWon = 1338.5;         //      ''      1달러를    ''
		
		won = 1_000_000;                      //여행 경비 예산 금액(원)
		//yen = (won / 9.84);                 //원을 엔으로 계산(1엔 9.84원)
		//dollor = (won / 1323.38);
		
		System.out.println("=========== 일본 여행 출국하기 전 =============");
		changeYen = ChangeMoney.wonToYen(won, oneYenWon);
		System.out.println("일본 여행의 환전 금액 = " + changeYen + "엔입니다.*");           //101626엔
		
		double useYen = 75000;                //사용한 금액(한국 돈 75만원)
		int temp = (int)(changeYen-useYen);
		System.out.println("여행 입국 후");
		System.out.println("여행에서 돌아왔습니다. 사용 경비는" + useYen + "엔, 남은 금액을 원화로 환전하세요.*");
		System.out.println(temp + "엔을 원화로 환전하면" + ChangeMoney.yenToWon(temp, oneYenWon) + "원입니다.*");
		
		System.out.println("============미국 여행 출국 전================");
		changeDollor = ChangeMoney.wonToDollor(won, oneDollorWon);
		System.out.println("미국 여행의 환전 금액 = " + changeDollor + "달러입니다.*");
		
		double useDollor = 650;               //사용한 금액(한국 돈 87만원)
		temp = (int)(changeDollor-useDollor);
		System.out.println("여행 입국 후");
		System.out.println("귀국 후 사용 경비는" + useDollor + "달러, 남은 금액을 원화로 환전*");		
		System.out.println(temp + "달러->원화로 환전" + ChangeMoney.wonToDollor(won, oneDollorWon) + "달러, 남은 금액을 원화로 환전*");
		
		System.out.println("환전할 원화를 입력하세요 >>> 870000");
		
		
		/*
		System.out.println("\n===========미국 여행 출국하기 전============");
		chanegeDollor = ChangeMoney.wonToDollor(won, oneDollorWon);
		System.out.println("미국 여행의 환전 금액 = " + changeDollor + "엔입니다.");        //101626엔
		 */
		
	}

}
