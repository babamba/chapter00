package chapter00;

public class ArrayTest3 {
	public static void main(String[] args) {
	
		int[] 		arrayInt1; 		//추천
		int 		arrayInt2[]; 	//비추
//		int[10] 	arrayInt3;		//오류(C언어용)
		

		arrayInt1  = new int[10];
		arrayInt1[0] = 1;
		arrayInt1[1] = 2;
		arrayInt1[2] = 3;
		arrayInt1[3] = 4;
		arrayInt1[4] = 5;
		
		int[] arrayInt4 = {1, 2, 3, 4, 5};		
		//Book[] books = {new Book(), new Book()};
		//보통 이 형태를 많이 씀.
		
		
		String[] month = { "Jan" , "Feb", "Mar" , "Apr", "May" };
		
		int[] arrayInt5 = new int[] {10, 20, 30, 40};
//		되긴 하지만 비추천
		
		
		int[] arrayInt6; //이미 null이 저장되있는 상태이기떄문에 밑은에러 선언과 초기화가 함께
//		arrayInt6 = {100, 200, 300, 400};
	
	}
}
