package chapter00;

import java.util.Scanner;

public class NHelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력테스트>");
		
		int count = scanner.nextInt();
	
		int i = 0;
		while(i < count){
			System.out.println("HelloWorld");
			i++;
		}
		scanner.close();
	
	}
}
