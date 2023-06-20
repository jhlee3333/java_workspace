package jdbc;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import koreait.jdbc.day4.JBuy;
import koreait.jdbc.day4.JBuyDao;
//테스트 케이스입니다.
//테스트할 메소드 앞에는 @Test 에노테이션을 작성하기. @DisplayName은 테스트 내용 작성.
//테스트 결과는 성공 또는 실패입니다. 테스트 메소드에는 대부분의 경우 리턴이 없습니다.
class BuyDaoTest {
	
	private JBuyDao dao = new JBuyDao();
	
	@DisplayName("buy 테이블에 insert 성공하면 리턴값은 1(기댓값)이 되어야 합니다.")
	@Test
	void insertTest() {
		JBuy buy = JBuy.builder()
				.customid("hongGD")
				.pcode("")
				.quantity(5).build();
		int i = dao.insertMany(buy);
		
		//성공 또는 실패 결과를 확인하는 테스트 메소드 실행하기
		assertEquals(1, i);      //기댓값, 실제값
		                         //기댓갑과 실제값이 같으면 성공
		
		@DisplayName("buy 테이블에서 buy_seq 컬럼으로 조회하면 null이 아닌 dto가 리턴된다.")
		@Test
		void selectOneTest() throws SQLException {
			JBuy buy = dao.selectOne(1001);
			print();
			assertNotNull(buy);
		}
		
		@Disabled
		@Test
		void test() {
			fail("테스트를 비활성화하는 연습");
		}
		
		//테스트 메소드 아닌 것도 정의하여 호출할 수 있습니다.
		void print() {
			System.out.println("테스트 중입니다.");
		
	}
}