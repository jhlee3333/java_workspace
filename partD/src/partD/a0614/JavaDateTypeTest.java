package partD.a0614;

import java.text.DecimalFormat;
import java.util.Date;

/* 자바에서 날짜 형식을 지원하는 클래스
 * 1) java.util 패키지의 Date와 Calendar 클래스 : jdk 1.1 버전부터 사용했으나 지금은 소멸된 기능들이 많음
 * 2) java.sql 패키지의 Date와 Timestamp 클래스 : jbk 1.1부터 데이터베이스와 연동할 때 사용
 * 3) java.time 패키지의 LocalDate, LocalTime, LocalDateTime 클래스 : jdk 1.8(자바 8) 버전부터 사용.
 *                                                                다양한 기능의 메소드가 있습니다.
 */

public class JavaDateTypeTest {
	
	public static void main(String[] args) {
		//10진수값 출력 포맷
		DecimalFormat df = new DecimalFormat("###, ###, ###, ###");
		
		long now = System.currentTimeMillis();
		System.out.println("1. 현재 시간을 1970년 1월 1일 0시 기준으로 구합니다. 단위 : ms(1/1000초)");
		System.out.println("현재 시간 = " + now + "ms");
		System.out.println("현재 시간 = " + df.format(now) + "ms");
		System.out.println("--- 현재 시간을 ms로 구하는 방식은 모든 프로그램밍 언어에서 사용합니다. ---");
		
		System.out.println("2. 약 53년을 직접 ms로 계산해 봅니다.");
		long oneday = 24*60*60*1000;              //24시간에 대한 ms값
		long oneyear = 365*oneday;
		System.out.println("1일 24시간 = " + df.format(oneday) + "ms");
		System.out.println("1년 365일 = " + df.format(oneyear) + "ms");
		System.out.println("53년 = " + df.format(53*oneyear) + "ms");
		System.out.println("54년 = " + df.format(54*oneyear) + "ms");
		
		System.out.println("\n3. 날짜 클래스로 객체 생성합니다.");
		System.out.println("java.util.Date 클래스 : " + new Date());
		System.out.println("java.util.Date 클래스 getTime() : " + new Date().getTime());
		System.out.println("------------------------------------------------");
		//java.sql.Date는 기본 생성자 동작 없습니다.
		System.out.println("java.sql.Date 클래스 : " + new java.sql.Date(54*oneyear));
		System.out.println("java.sql.Date 클래스 : " + new java.sql.Date(new Date().getTime()));
		
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println();
	}

}
