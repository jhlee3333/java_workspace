package day11;

import java.util.Arrays;

public class MyArrayUtility {
	
	public static void main(String[] args) {
		
		int[] numbers = {56,45,77,34,89,23,90};
		
		int k = 3;    int value = 999;
		System.out.println("1. 지정된 인덱스와 값으로 데이터 중간 삽입 결과");
		dataAdd(numbers,k,value);
		numbers[numbers.length-4]=999;
		numbers[numbers.length-3]=34;
		numbers[numbers.length-2]=89;
		numbers[numbers.length-1]=23;
		System.out.println(Arrays.toString(numbers));
		
		k=2;
		System.out.println("2. 지정된 인덱스로 데이터 제거 결과");
		dataRemove(numbers,k);
		numbers[numbers.length-1]=0;
		numbers[numbers.length-2]=23;
		numbers[numbers.length-3]=89;
		numbers[numbers.length-4]=34;
		numbers[numbers.length-5]=999;
		System.out.println(Arrays.toString(numbers));
		
		k=3;
		System.out.println("3. 지정된 인덱스로 데이터 제거 결과");
		dataRemove(numbers,k);
		numbers[numbers.length-1]=0;
		numbers[numbers.length-2]=0;
		numbers[numbers.length-3]=23;
		numbers[numbers.length-4]=89;
		numbers[numbers.length-5]=999;
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("4. 지정된 인덱스와 값으로 데이터 중간 삽입 결과");
		k=4;     value=99;
		dataAdd(numbers,k,value);
		numbers[numbers.length-1]=0;
		numbers[numbers.length-2]=23;
		numbers[numbers.length-3]=99;
		numbers[numbers.length-4]=89;
		numbers[numbers.length-5]=999;
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("5. 지정된 인덱스와 값으로 데이터 중간 삽입 결과");
		k=5;     value=9999;
		numbers[numbers.length-5]=999;
		numbers[numbers.length-4]=9999;
		numbers[numbers.length-3]=89;
		numbers[numbers.length-2]=99;
		numbers[numbers.length-1]=23;
		dataAdd(numbers,k,value);
		
		System.out.println(Arrays.toString(numbers));
		
		        //추가 : 맨 뒤에 넣기, **삽입 : 순서가 있을 때 중간에 넣기
				//주어진 인덱스 위치에 주어진 정수값을 저장하고, 그 이후의 값을 뒤로 밀기
				//예시 : 인덱스 3, 값 999, 결과는 56,45,77,999,34,89,23
				/*
				 * numbers[6] = numbers[5];   결과 numbers[6]은 23;
				 * numbers[5] = numbers[4];   결과 numbers[5]은 89;
				 * numbers[4] = numbers[3];   결과 numbers[4]은 34;
				 */
			    //주어진 인덱스 위치의 값을 제거하고, 그 이후의 값들은 앞으로 땡기기
				//현재 상태 : 56, 45, 77, 999, 34, 89, 23
				//예시 : 인덱스 2, 결과는 56,45,999,34,89,23,0
				/*
				 * numbers[2] = numbers[3];   결과 numbers[2]은 999;
				 * numbers[3] = numbers[4];   결과 numbers[3]은 34;
				 * numbers[4] = numbers[5];   결과 numbers[4]은 89;
				 * numbers[5] = numbers[6];   결과 numbers[5]은 23;
				 * 
				 * 수식을 numbers[i] = numbers[i+1]로 했을 때
				 * i의 범위는 2부터 numbers.length-2까지
				 * 
				 * numbers[numbers.length-1]=0;
				 */
			      
	}

	private static void dataRemove(int[] numbers, int k) {
		// TODO Auto-generated method stub
		
	}

	private static void dataAdd(int[] numbers, int k, int value) {
		// TODO Auto-generated method stub
		
	}

}
