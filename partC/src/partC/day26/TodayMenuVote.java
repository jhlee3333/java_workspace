package partC.day26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TodayMenuVote {

	public static void main(String[] args) {
		System.out.println("TodayMenuVote===========================");
		Scanner sc = new Scanner(System.in);
		//오늘의 저녁메뉴 투표                 //투표할 메뉴 : 치킨, 곱창, 떡볶이, 불고기, 햄버거
		String foods = "치킨, 곱창, 떡볶이, 불고기, 햄버거";   //메뉴로 출력할 문자열
		Map<String, Integer> map = new LinkedHashMap<>();
		//초기화 : key는 메뉴 이름 value는 투표수는 0
		map.put("치킨", 0);
		map.put("곱창", 0);
		map.put("떡볶이", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		
		foods = "";
		System.out.println("map의 key 값만으로 만든 set : " + map.keySet());
		for(String key : map.keySet())
			foods += key + ",";
		
		while(true) {
			//선택한 메뉴를 입력받으면 => key값입니다.
			System.out.println("\n아래 메뉴 중 투표해 주세요. -" + foods);
			System.out.print("입력(종료는 end) >>> ");
			String menu = sc.nextLine();
			//end를 입력하면 while을 종료합니다.
			if(menu.equals("end")) break;
			//입력받은 key값이 map에 있는지 먼저 검사합니다.(containsKey 사용하기)
			if(map.containsKey(menu)) {
			//  ㄴ    없는 메뉴일 때는 map에 put하고 value는 1로 합니다.
				int count = map.get(menu);
				System.out.println("선택한 메뉴 key : " + menu + ", 현재 득표수 : " + count);
				//count++;
				map.put(menu, ++count);
			}else {
			//  ㄴ    있는 메뉴일 때는 map에서 key에 대한 value를 가져와서 ++1 증가한 후 put합니다.
			map.put(menu, 1);
			foods = map.keySet().toString();
			}
			//현재 map의 key-value 항목을 모두 출력합니다.(map의 toString() 이용)
			System.out.println("=투표 중간 결과=");
			System.out.println(map);
			
		}
		System.out.println("투표를 종료합니다!!!");
		System.out.println("=투표 최종 결과=");
		System.out.println(map);
	}

}
