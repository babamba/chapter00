package chapter00;

public class Guguadan01 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 9){
			
			int j = 1;
			while(j <= 9){
				int result = i * j;
				System.out.println(i + "X" + j + " =  " + result);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//1단 2단 3단 4단 이런식으로 과제