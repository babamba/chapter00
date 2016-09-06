package chapter00;

public class Arith {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);//정수랑 정수를 나누기때문에 정수값으로 리턴
		System.out.println(a % b);		//나머지 연산 나머지만 나오게
		
		//네개 다 똑같은 증감연산자.
		
		a = a + 1;
		System.out.println(a);
		
		a += 1;
		System.out.println(a);
	
		a++;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		
		System.out.println(a++);  
		//System.out.println(a);  
		//a++;
		//syso구문을 먼저 실행하고 
		
		System.out.println(++a);
		//++a;
		//System.out.println(a);
		
		
		//나누기 연산
		System.out.println(10 / 3);
		System.out.println(10. / 3.);
		System.out.println(10. / 3);
		System.out.println(10 / 3.); //더블과 인티저 연산하면 무조건 더블
		System.out.println((double)10 / 3);		//더블로 형변환 값으로 연산
		System.out.println((double)(10 / 3) );	//이미 연산된 3이 더블로 표현됨	
	
		//나머지 연산
		System.out.println( 44 % 3 );
		System.out.println( -7 % 3 );
		System.out.println( 7 % -3 );
	
	
	
	
	
	
	
	
	
	
	}
}
