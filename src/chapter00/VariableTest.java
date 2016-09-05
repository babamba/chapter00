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
		
		//charcter 형
		char ch1 = '1';
		char ch2 = 49;
		char ch3 = 1;
		
		System.out.println(ch1 + ":" + ch2 + ":" + ch3);
		
		
	}
}
