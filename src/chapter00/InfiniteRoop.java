package chapter00;

public class InfiniteRoop {
	public static void main(String[] args) {
//		for(;;){
//			
//		}
		
		int i = 0;
		int sum = 0;
		
		while(true){
			if(i > 1000){
				break;
			}
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
