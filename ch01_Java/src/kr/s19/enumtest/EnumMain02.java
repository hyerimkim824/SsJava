package kr.s19.enumtest;

//열거형 상수
//class는 아니다.
enum Lesson{
	
	//emum은 기본 숫자형 상수가 아니라 문자열 상수다.
	JAVA,ORACLE,HTML //type은 Lesson type으로 해서 호출 가능하다.
}

public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.ORACLE);
		System.out.println(Lesson.HTML);
		
	}
	

}
 