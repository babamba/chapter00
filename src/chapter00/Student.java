package chapter00;

public class Student {

		String number;  //학번 int로 하면 0이 날라가기때문에 스트링으로
		String name;	//이름
		boolean isEnrolled;	//등록여부
		float grade; 	//평점
		String address; 	//주소
		String major;		//전공
		int unit;			//이수학점
		boolean haveMinor;	//부전공 여부
		String juminNo;		//주민번호	남녀구분시 숫자로 구분하기 떄문에 문자열로 보면 편하게 구분
		String cellphone; 	//핸드폰번호 (-가 포함되기때문에 스트링)
		int age; 			//나이
		String email;		//이메일주소
	}
