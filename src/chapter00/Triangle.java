package chapter00;

public class Triangle {
	public static void main(String[] args) {

		String x = "X";
		
		
		for(int i = 0; i < 6; i++){
			System.out.println(x);
//			x += x;
			int sum = i;
			x = x + sum;
		}
		
	}
}
