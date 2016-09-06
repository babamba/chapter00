package chapter00;

import java.util.Scanner;

public class SumTolnput {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("입력 : ");
	
	int input = sc.nextInt();
	int sum = 0;
	
	for(int i = 0; i < input; i++ ){
					sum += i;
	}
	System.out.println("결과값은" + sum);
	sc.close();
	}
}

//실행 결과 입력>10 55 0에서부터 입력 된 n까지의 합