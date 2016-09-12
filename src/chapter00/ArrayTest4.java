package chapter00;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		int[] IntArray;
		IntArray = new int[5];
		IntArray[0] = 3;
		IntArray[1] = 6;
		IntArray[2] = 9;

		int result = 0;
		
		//=가 있어서 5번째가 없는데 오류
//		for ( int i =0; i <=  IntArray.length; i++ ){
		for ( int i =0; i <  IntArray.length; i++ ){
			System.out.println(i + ":" + IntArray[i]);
		result = result + IntArray[i];
		}

		//확장 for(추천)
		for(int value : IntArray){
			System.out.println(value);
			result = result + value;

	}
		System.out.println("result" + result);
	
	}	
	
}
