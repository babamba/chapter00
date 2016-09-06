package chapter00;

import java.util.Scanner;

public class PowerOfTwo01 {
		public static void main(String[] args) {
			Scanner scaner = new Scanner(System.in);
			
			System.out.println("승수:");
			int pow = scaner.nextInt();
			
			int result = 1;
			int i = 0;
			
			while(i < pow){
				result *= 2;
				i++;
			}
			System.out.println("2의" + pow + "승은" + result + "입니다." );
		}
}
