수업 내용 요약

### day17(5.15)


#### InterfaceA.java
+ 인터페이스 정의 형식
+ 상수필드 public static final, 추상메소드는 public abstract : 키워드 생략
+ 인스턴스 메소드 : default 키워드 작성
+ 상수, 추상메소드, 인스턴스메소드, static 메소드는 모두 접근 한정자 public입니다.(*인스턴스 필드*는 인터페이스에 없습니다.)

#### ClassA.java
+ InterfaceA의 구현 클래스 정의
+ 추상메소드는 모두 정의(구현, implements)했습니다.

#### C01InterfaceATest.java
+ ClassA 객체 생성
+ 인터페이스 타입으로 변수 선언하는 연습했습니다.

#### beable 패키지
+ Runnable, Thinkable, Cookable 인터페이스 정의
+ 구현 클래스 AI, Dog, People 정의
+ BeAble 인터페이스 정의하여 Runnable, Thinkable, Cookable의 부모 인터페이스로 수정하고 테스트
+ BeAble 인터페이스의 default 메소드 역할 테스트

#### C02BeAbleTest.java
+ beable 패키지의 구현클래스 객체 생성
+ 인터페이스를 사용한 다형성 연습 : 구현 클래스의 타입 체크

#### C03ComparToTest.java
+ 기본형 타입 데이터 비교 : 관계연산 <, >
+ String 타입 데이터 비교 : ComparTo 메소드

#### C04MemberCompareTest.java
+ 기본형, String 타입처럼 객체의 비교를 위한 연습
+ Comparable 인터페이스의 compareTo 메소드를 재정의하는 연습
  + Member 클래스에서 연습
  + 단점 : 비교할 필드를 고정시켜야 합니다.(name 또는 age 필드 선택)
  + 수정사항 : 비교하는 실행 시점(Runtime)에서 필드를 정하도록 다른 인터페이스를 사용할 예정
+ Member 클래스 객체를 compareTo 메소드로 비교

#### C05MySort.java
+ 비교를 사용하는 대표적인 메소드 sort(정렬) 알고리즘 연습
+ 선택 정렬. 인덱스 0부터 시작해서 가장 작은 값을 순서대로 찾는 방법
+ 정렬 방식 : 기본은 오름차순(작=>큰값), 내림차순(큰=>작은값)

## 참고

### 다형성을 애플리케이션에서 구현한다면 필요한 개념들은 아래와 같습니다.
+ 상속 또는 인터페이스
+ 메소드 오버라이딩(재정의 또는 구현)
+ 업캐스팅 : 자식 클래스 또는 인터페이스의 구현 클래스 객체를 부모 타입 변수(배열) 또는 인터페이스 타입 변수(배열)
+ 다운캐스팅 : 업캐스팅했던 객체를 실제 객체 타입으로 변환(타입 체크는 instanceof 연산)

<hr/>

### day18(5.16)

#### 참고 : 참조 타입 배열(또는 리스트)의 sort 알고리즘
+ 비교와 교환이다
+ 비교는 참조타입의 경우 어떤 기준으로 할 것인지 필드를 정해야 한다.(기본형 C03ComparToTest.java 참고)
   + String 클래스는 필드가 value 변수 1개이므로 이를 이용하여 이미 재정의되어 있다.
   + 개발자가 만든 클래스는 특정 필드를 정해 주어야 한다.
   
+ Comparable 인터페이스는 비교할 객체의 클래스에 미리 comparTo를 재정의해야 한다.
+ Comparator 인터페이스는 실행 시점에서 비교 기준 필드를 comapare 메소드에서 정한다. 아래 3가지 방법으로 구현 완료!
   + Comparator 익명 클래스 구현해서 인터페이스 타입 변수에 대입시킨 후 sort 메소드로 2번째 인자는 변수로 지정
   + Comparator 구현 클래스 정의해서 sort 메소드 2번째 인자는 구현 클래스 객체 생성(new연산)으로 지정
   + Comparator 타입의 sort 메소드 2번째 인자를 익명 클래스 객체 생성으로 바로 지정
   
## Java의 오류
-Error(에러) -> 개발 중인 프로그램 외부의 문제. 시스템 상의 오류.
 (HW, OS, JVM.. 등등)
-Exception(예외) -> 개발 중인 프로그램과 관련된 문제
 -Checked Exception : 예외 처리를 필수적으로 해야 합니다.
                      입출력과 관련된 IOException이 대표적입니다.
 -UnChecked Exception : java.lang.RuntimeException입니다. 예외 처리가 강제되지 않으나 사용자의 입력 오류 등 실행 중에 발생할 수 있는 것들은 처리가 필요합니다.
-java.lang.Error와 java.lang.Exception 2가지 모두 Throwble 클래스의 하위 클래스. Exception은 예외 원인에 따라 정의(생성)되는 자식 클래스를 갖고 있습니다.
-List, Set, Map 특징 비교
-Iterator 반복자
-Scanner, PrintWriter 클래스로 파일 입출력 구현
-Map과 파일 입출력을 이용한 단어장 프로그램 연습
 -HashMap : 해시테이블 이용하며 순서와 정렬 기능이 없다. 임의의 순서로 접근.(key, value)pair(쌍)
 -TreeMap : 이진 트리를 이용한 정렬 알고리즘 적용. key 기준 정렬
 -LinkedHashMap : 연결 리스트 알고리즘 적용. 입력 순서를 유지한다.

## 외부 라이브러리 사용
- 롬복 lombok.jar
 -어노테이션으로 자주 작성되는 코드를 만들어 줍니다. 주로 데이터를 저장하는 클래스에 필요한 코드입니다.
  -getter, setter
  -toString
  -커스텀 생성자
  -... 등등
 -생성된 코드 확인은 이클립스의 outline 창에서 합니다
 -외부 라이브러리 사용 방법
  -lombok.jar를 다운로드
  -프로젝트의 configure build path 실행
  -Libraries 탭에서 add external jar
- 참고 : jar는 압축 파일형식. 자바 프로그램을 실행하기 위한 클래스들과 리소스를 포함.
- 롬복에서는 롬복을 이클리스에 설치가 필요합니다.(이유는 이클립스 IDE 코드 생성을 해야 하기 때문)
 -명령어 java-jar lombok.jar를 cmd에서 실행.
 
## 자바의 오류
- Error(에러) -> 개발 중인 프로그램 외부의 문제. 시스템 상의 오류.(HW, OS, JVM.. 등등)
- Exception(예외) -> 개발 중인 프로그램과 관련된 문제
 - Checked Exception : 예외 처리를 필수적(강제적)으로 해야 합니다. 표준 입출력을 제외한 입출력과 관련된 IOException이 대표적입니다.
 - UnChecked Exception : java.lang.Runtime.Exception입니다.
 
 
- UnChecked Exception : java.lang.RuntimeException
 - NullPointException
 -
- Exception 처리
 - try ~
 - catch ~
 - throws 예외A, 예외B, ... : 예외 처리를 위임(떠넘기기)
- 개발자가 잘못된 입력 또는 실행 중 오류에 대한 처리 방법으로 임의로 Exception을 만들 수도 있습니다. -> throw 명령