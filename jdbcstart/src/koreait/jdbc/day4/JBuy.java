package koreait.jdbc.day4;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@Builder
public class JBuy {
	private int buySeq;
	private String customid;
	private String pcode;
	private int quantity;
	private Date buyDate;
}


//필드값이 모두 같으면 equals로 true가 되도록 하고 싶사.
//-> equlas와 hashcode를 재정의해야 합니다.
//=> vo입니다. vo는 테스트 케이스에서 객체를 비교할 때 사용할 수 있습니다.
//assertEquals 비교