package chapter00;

public class Guguadan02 {
	public static void main(String[] args) {
		
		int result;
		
		for(int i = 1; i<10; i++){
			for(int j = 1; j<10; j++){
				result = i*j;				
			if(j >= 9){
				System.out.println();
			}
				System.out.print(j + "X" + i + "="+ result + "	");
		}

			
		}
		
		
	//	print(i+"*"+j+"="+(i*j));
	
	}
}

//1단 2단 3단 4단 이런식으로 과제