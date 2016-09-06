package chapter00;

public class LeapYear {
	public static void main(String[] args) {
		int year = 4004;
		
		if( year % 4 != 0 ){
			System.out.println("윤년이 아닙니다.");
		}else if(year % 100 != 0){
			//4로 나누어 떨어지고 100으로 나누어 떨어지지않으면
			System.out.println("윤년입니다.");
		}else if(year % 400 != 0){
			//4로 나누어 떨어지고 100으로 나누어 떨어지고 400으로 나누어 떨어지지 않으면
			System.out.println("윤년이 아닙니다.");
		}else{
			//4로 나누어 떨어지고 100으로 나누어 떨어지고 400으로 나누어 떨어지면
			System.out.println("윤년입니다.");
		}
			
		int value = 10;
		if(value % 2 == 0){
			
		} else if( value % 3 == 0){

		} else if( value % 5 == 0) {
			
		} else{
			
		}
	
		}
	}

