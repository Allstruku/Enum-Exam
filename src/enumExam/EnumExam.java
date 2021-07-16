package enumExam;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	// static은 instance를 사용안해도 가능한 밑의 main method에 돌아갈 수 있게 한다. Final이란, 더이상 쓰이는 변수가 다른 값을 못 받게한다
	// constants들은 변수명이 항상 all caps이다
	public static void main (String[] args) {
		String gender1;
		// String data type (문자열)으로 gender1이라는 변수 한개를 생성
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		// gender1이라는 문자열 변수 속에 MALE, FEMALE이라는 변수를 넣었다
		// MALE, FEMALE은 static이 쓰이는 상수변수들은 클래스 변수로 (클래스명.클래스 변수명)형태
		gender1 = "boy";
		// 하지만 일반 string 변수에는 원하는 MALE, FEMALE 변수 말고도 다른 "boy" 같은 변수도 대입이 가능함
		
		Gender gender2;
		// Enum 변수명은 data type으로 쓰일 수 있다
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		// gender2 = "boy";
		// enum을 쓰면 원하는 값만 들어가기에 위처럼 "boy" 같은 다른 값이 들어갈 경우 에러가 생김
		
	}
	enum Gender {
			MALE, FEMALE;
	}
	// 그렇기에 enum 열거형 data type이 쓰인다
	// 쓰는 방법은 enum 변수명 {값1, 값2;} 형태이다
}
