package chapter00;

public class VariableTest {
	
	public static void main(String[] args) {
		int i = 10;  //main에서 처음만든 변수 -지역변수(로컬변수) 지역변수는 초기화해줘야함.
		short s = 100;
		long l = 90;
		byte b = 20;
		float f = 3.14f;
		double d = 3.14;
		boolean bool = true;
		char c = 'A';
		String str = "Hello World";
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(str);
		System.out.println(c);
		
		//reference type(참조형)
		Circle circle = new Circle(); 

		circle.radius = 5;
		circle.area = 5 * 5 * 3.14;
		
		System.out.println(circle.area);
		
		String str1 = new String("Hello World");
		System.out.println(str1);
		// 둘다 된다. 자동으로 위의 모습으로 jvm이 변화
		String str2 = "Hello World";
		System.out.println(str2);
		
//		기본 자료형은 값을 바로 지정하면 되지만, 참조자료형은 일반적으로 new와 생성자를 지정하여 객체 생성
		
		
		//charcter 형 
		char ch1 = '1';
		char ch2 = 49;
		char ch3 = 1;
		
		System.out.println(ch1 + ":" + ch2 + ":" + ch3);
		//커밋확인
		//다운로드후 커밋확인
		
/*		public class VariableTypes{
			int instanceVariable;			   	//인스턴스변수 - "객체가 생성될 때" 생명시작 그 객체를 참조하고 있는 다른객체없으면 소멸
			static int classVariable;		  	//클래스 변수 - "클래스 생성시" 생명시작 자바프로그램 끝날 때 소멸
		public void method(int parameter){ 		//매개 변수 - "메소드 호출시" 생명 시작 메소드 끝나면 소멸
			int localVariable; 			   		//지역 변수 - "지역 변수를 선언한 곳(중괄호)에서부터" 생명 시작 지역변수를 선언한 중괄호 끝나면 소멸
			}
		}
*/
	}
}
