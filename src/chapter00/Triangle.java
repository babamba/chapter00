package chapter00;

public class Triangle {
	public static void main(String[] args) {

		String x = "X";
		
		for(int i = 0; i < 6; i++){
			System.out.println(x);
//			x += x;
			String sum = x;
			String temp = "X";
			sum = temp; 
			x = x + sum;
		}
		
	}
}
