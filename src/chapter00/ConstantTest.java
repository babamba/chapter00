package chapter00;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int CONST_NUMBER = 10; 
		//상수(Constant) 변경될 수 없는 고정된 데이터(변경하면 에러남)
		//상수는 두번째 대입이 안됨
		//상수는 대문자로 써주는게 관례
		System.out.println(CONST_NUMBER);
		
		int number = 10;			//변수(Variable)
		System.out.println(number);
	
		number = 20;
		System.out.println(number);
		
		
		
		
	}
}
