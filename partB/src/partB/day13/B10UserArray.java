package partB.day13;

import java.util.Scanner;

public class B10UserArray {
	
	public static void main(String[] args) {
		
		User momo = new User("twice1", "김모모", 27, 100);
		User nayeon = new User("twice2", "나연", 25, 110);
		User dahyeon = new User("twice3", "다현", 28, 120);
		User zuwi = new User("twice4", "쯔위", 24, 133);
		
		//1. 위의 4개 객체를 저장할 배열을 배열 크기 7로 선언하세요. 배열 이름은 twice
		//   선언된 배열에 4개의 객체를 저장하세요.
		User[] twice = new User[7];
		twice[0] = momo;
		twice[1] = nayeon;
		twice[2] = dahyeon;
		twice[3] = zuwi;
		//객체 참조변수값을 배열에 전달한 결과 확인
		System.out.println(twice[0]);
		System.out.println(momo);
		System.out.println(twice[0].user());
		System.out.println(momo.user());
		System.out.println("결론 : twice[0]와 momo가 저장한 값은 동일하다.\n" + " 즉, 같은 객체를 참조하고 있다.");
		
		//2. 위의 선언한 배열의 요소를 모드 필드값 출력해보세요. 오류 발생 없이 해결해 보세요.
		System.out.println("==배열의 객체 참조 상태 확인==");
		for(int i=0;i<twice.length;i++) {
			System.out.println(twice[i]);
		}
		
		System.out.println("==배열의 참조하는 객체의 필드값 출력==");
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
				//**객체 null일 때는 메소드 실행 오류**
			System.out.println(twice[i].user());
			}
		//3. 새로운 객체를 생성해서 배열 인덱스 4에 저장해 보세요.
		//객체 참조 변수를 선언하지 않고 바로 배열 요소로 대입하기
		twice[4] = new User("twice5", "사나", 26, 150);
		System.out.println("==새로운 객체를 인덱스 4에 대입한 후==");
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
				//**객체 null일 때는 메소드 실행 오류**
			System.out.println(twice[i].user());
			}
		
		//4. 배열에 참조하는 객체는 User 타입입니다. - User 객체의 name 필드만 출력하기
		System.out.println("==twice 배열에 저장된 User 객체의 name 필드 출력==");
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
			System.out.println(twice[i].getName());
		}
		
		//5. User가 불변 객체로 정의되었으므로, 키보드 입력값으로 객체 생성한다면??
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 >>>");
		String id = sc.nextLine();
		System.out.println("이름 입력 >>>");
		String name = sc.nextLine();
		System.out.println("나이 입력 >>>");
		int age = sc.nextInt();
		
		twice[5] = new User(id, name, age, 0);
		System.out.println(twice[5].user());
		
		twice[6] = nayeon;          //이미 생성된 객체를 6번 인덱스로 참조합니다.
		
		//6. twice 배열에 저장된 객체들의 age 필드값 평균을 구해보세요.
		double sum = 0;
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
			sum = sum + twice[i].getAge();
		}
		System.out.println("합계=" + sum);
		System.out.println("평균=" + sum/twice.length);      //배열 요소 중 null 있다면 count 변수 필요합니다.
		
		System.out.println("==배열 오소 2개를 임의로 null로 변경한 후==");
		twice[4] = null; twice[6] = null;
		sum=0;
		int count=0;
		for(int i=0;i<twice.length;i++) {
			if(twice[i] !=null)
				count++;
				sum += twice[i].getAge();
				
				System.out.println("합계=" + sum);
				System.out.println("null이 아닌 객체의 갯수 =" + count);
				System.out.println("평균=" + sum/count);
			}
		}
		

}


