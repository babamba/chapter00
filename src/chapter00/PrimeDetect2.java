package chapter00;

import java.util.*;	// Scanner 클래스를 사용하기 위함

public class PrimeDetect2 {

   public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	System.out.print("소수인지 판단할 숫자: ");
	int num = stdin.nextInt();

	int i = 2;
	boolean isPrime = true;
	

	while(i < num){
		int result = num % i;
		if(result == 0){
			//소수가 아님
			isPrime = false;
			break;
		}else{
		isPrime = true;
	}
		i++;
	}
		if(isPrime) {
			System.out.println(num + "은 소수입니다.");				
		}else{
			System.out.println(num + "은 소수가 아닙니다.");
	}	

    }	
}