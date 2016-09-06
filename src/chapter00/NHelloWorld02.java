package chapter00;

import java.util.Scanner;

public class NHelloWorld02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력테스트>");
		
		int count = scanner.nextInt();
	
		for(int i = 0; i<count; i++){
			System.out.println("HelloWorld");
			}
		scanner.close();
		}
	}
