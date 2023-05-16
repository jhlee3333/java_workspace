package partC.day18;

import java.util.Random;

public class RedPenMain {
	private int n1;
	private int n2;
	private char op;
	private boolean isCorrect;
	
	public static void RedPen(String[] args) {
		
		System.out.println("===초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜입니다.===");
		System.out.println("----------------------------------");
		System.out.println("===빨간펜 수학 2자리 덧셈 문제 풀기===");
		System.out.println("----------------------------------");
		System.out.println("===시작합니다.===");
		
		Score[] s = new Score[5];
		for(int i=0;i<s.length;i++) {
			s[i] = new score();
			s[i] = setName();
			System.out.println("Score" + i);
		}
		
		Scanner sc = new Scanner(System.in);
		
	}
}
