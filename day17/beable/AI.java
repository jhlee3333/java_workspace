package partC.day17.beable;

public class AI implements Thinkable {
	
	protected char op;

	@Override
	public int calculate(int a, int b) {
		int result = 0;
		switch (op) {
		case '+': 
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		default:
			//result = a+b;
			//잘못된 op 필드값은 오류 발생. op 필드 초기값? ' ' 입니다.
			//throw new IllegalArgumentException("Unexpected value:" + op);
		}
		return result;
	}

	@Override
	public void think() {
		System.out.println("학습된 정보를 수집해서 알려드립니다.");
		}

	@Override
	public String beAble() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
