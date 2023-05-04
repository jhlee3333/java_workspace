package day05;

public class A24MySampleMethod {
	
	public static void main(String[] args) {
		   int result = sumToN(23);
		   System.out.println("1~23까지의 합 :" + result);
		   
		   result = sumToN(100);
		   System.out.println("1~100까지의 합 :" + result);
		   
		   result = sumFromNToM(5,10);
		   System.out.println("5~10까지의 합 :" + result);
		   
		   result = sumThreeNumber(5,6,7);
		   System.out.println("3개 정수값의 합 :" + result);
		   
		   System.out.println("3개 실수값의 합 :" + sumThreeDouble(3.4, 5.6, 7.7));
		   double d1 = 3.14;
		   double d2 = 3.141;
		   double d3 = 3.1419;
		   
		   System.out.println("3개 실수 d1+d2+d3 =" + sumThreeDouble(d1, d2, d3));
		   
		   alphabetprint(0);
		   alphabetprint(1);
		   //리턴이 없고, 인자는 0 또는 1입니다. 메소드는 0이면 대문자 A부터 Z, 1이면 소문자 a부터 z 출력
		   char ch = '%';
		   int code = toAscii(ch);   //문자 'A'에 아스키코드값 구해서 리턴받기
		   System.out.println("문자 = " + ch + ", 아스키 코드 = " + code);
		   
		   
		   
	}

	private static int toAscii(char ch) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void alphabetprint(int i) {
		// TODO Auto-generated method stub
		
	}

	private static String sumThreeDouble(double d, double e, double f) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int sumThreeNumber(int i, int j, int k) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int sumFromNToM(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int sumToN(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
