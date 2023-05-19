package partC.day21;

import java.util.ArrayList;             //util은
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C12CollectionExampleTest {
	
	public static void main(String[] args) {
		
		//List 는 데이터를 순서를 갖도록 저장하며 인덱스 사용한다.동일한 값을 중복하여 저장할 수 있다.
		//List의 구현 클래스? ArrayList, LinkedHashMap , ?
		System.out.println("1. 리스트");
		List<String> list = new ArrayList<>();       //업캐스팅
		list.add("트와이스");
		list.add("뉴진스");
		list.add("에스파");
		list.add("소녀시대");
		list.add("원더걸스");
		list.add("뉴진스");
		System.out.println("list 의 크기 = " + list.size());       //예상 결과 : 6
		System.out.println("list 에 저장된 문자열 = " + list);
		for(int i=0;i<list.size();i++)      //순서(인덱스)를 갖고 있으므로 for문으로 반복
			System.out.println(String.format("list[%d] 의 값 = \"%s\"", i,list.get(i)) );
		
		
		//Set(집합) 은 데이터 저장에 순서(인덱스)가 없다. 동일한 값을 중복하여 저장할 수 없다.
		//Set 인터페이스의 구현 클래스?
		System.out.println("\n2. Set");
		Set<String> set = new HashSet<>();   //HashSet을 LinkedHashSet으로 변경
//		Set<String> set = new LinkedHashSet<>();    //데이터가 추가되는 순서를 표현할 수 있습니다.
		set.add("트와이스");               //데이터 저장 메소드
		set.add("뉴진스");
		set.add("에스파");
		set.add("소녀시대");
		set.add("원더걸스");
		set.add("뉴진스");
		System.out.println("set 의 크기 = " + set.size());       //예상 결과 : 5
		System.out.println("set 에 저장된 문자열 = " + set);        //출력 순서는 실행 컴퓨터마다 다르게 무작위
		
		//set 은 list의 get() 메소드와 같은 역할의 메소드가 없습니다.
		System.out.println("== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
		Iterator<String> setIterator = set.iterator();         //데이터를 가져오는 집계(반복자)
		                             //<String> 가져오는 데이터의 형식
		int cnt =0;
		while(setIterator.hasNext()) {           //반복자를 이용한 데이터 접근. hasNext는 데이터 더 있음?
			String temp =setIterator.next();     //반복자로 가져오기
			System.out.println("cnt = " + cnt++ + ", 값 = " + temp);
		}
			
		//대표적인 Map의 예시 : 객체의 식별값 해시코드(key)로 객체의 메모리 주소(value)를 찾아 데이터 접근
		//                 객체가 생성되면 메모리 할당하고 그 주소로 해시함수를 실행하면 해시코드가 만들어집니다.
		//                 해시테이블이라는 메모리 영역에 key와 value를 저장합니다.
		//Map 은 key-value 한쌍으로 데이터를 저장하며 , key를 이용하여 value를 가져올 수 있다. 
		//		 key는 동일한 값을 중복하여 저장할 수 없다.
		System.out.println("\n3. Map");
		Map<String,String> map = new HashMap<>();
		map.put("tw", "트와이스");
		map.put("nu", "뉴진스");
		map.put("as", "에스파");
		map.put("gr", "소녀시대");
		map.put("tw", "원더걸스");
		map.put("js", "뉴진스");
		System.out.println("map 의 크기 = " + map.size());        //예상 값 : 5
		System.out.println("map 에 저장된 문자열 = " + map);         //key - "tw"의 값은 "원더걸스"
		System.out.println("== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
		
		Set<String> keySet = map.keySet();    Iterator<String> tempItr = keySet.iterator();
		
		Iterator<String> mapIterator = map.keySet().iterator();      //위의 두 개 명령문을 합치기
		//keySet() 메소드는 map에서 key만으로 Set(집합)을 만들 수 있습니다. map 자체는 iterator를 갖지 않습니다.
		cnt =0;
		while(mapIterator.hasNext()) {              //집합에서만 iterator를 사용합니다.
			String temp =mapIterator.next();        //key 값
			System.out.println(String.format("count=%d , key= %s , value=%s",
					cnt++,
					temp,            //key
					map.get(temp)    //get(key)으로 value 가져오기
					));
		}
		
		//List, Set, Map 모두 <> 안에 데이터의 타입을 지정합니다.(제네릭 타입)
		//           기본형은 래퍼 클래스 사용합니다. 모든 타입을 클래스(참조) 타입으로 합니다.
		
	}

}
