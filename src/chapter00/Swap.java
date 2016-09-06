package chapter00;

public class Swap {
	public static void main(String[] args) {
		int n1 = 40;
		int n2 = 50;
		
		//n1값이 항상 큰 값이 되도록, 필요할 경우 n1 과 n2를 교체하라
		if( n1 > n2 ){
			System.out.println("n1:" + n1);
			System.out.println("n2:" + n2);			
		}else{
			int temp = n1;				
			if(n1 < n2){
				n1 = n2;
				n2 = temp;
				temp = n1;
			}
			System.out.println("n1:" + n1);
			System.out.println("n2:" + n2);			
		}
		//최대값을 판별하는 조건을 완성
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
		if( a1 >= a2 ){
			// a1이 a2보다 큰거나 같은경우
			if(a1 > a3){
				System.out.println("최대값은" + a1 + "입니다.");
			}else{
				System.out.println("최대값은" + a3 + "입니다.");
				}
			}else{
				//a2가 a1보다 큰 경우
				if(a2 > a3){
					System.out.println("최대값은" + a2 + "입니다.");
				}else{
					System.out.println("최대값은" + a3 + "입니다.");
				}
			
			}
}
}



