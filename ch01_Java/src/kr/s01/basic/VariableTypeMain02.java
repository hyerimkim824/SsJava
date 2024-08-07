package kr.s01.basic;

public class VariableTypeMain02 {
	public static void main(String[] args) {
		
		//확장 특수 출력 문자(escape sequence)
		
		char single = '\''; //특수문자(')를 일반문자로 바꿨다.
		System.out.println("single = "+single);
		
		String str ="오늘은 \"화요일\" 입니다.";//특수문자(")를 일반문자로 바꿨다
		System.out.println("str = "+str);
		
		//문자열에 '를 표시하면 자동으로 일반문자로 변환됨
		String str2 = "여기는 '서울'이고 비가 와요~"; //에러가 나지 않는다. 자동으로 '이 변환이 된다(문자열 이라서).
		System.out.println(str2);
		
		String str3 ="C:\\javaWork";
		System.out.println(str3);
		
		String str4 ="오늘은 화요일\n 내일은 수요일";
		System.out.println(str4);
		
		//자료형이 다르면 서로 연산이 안된다.
	
		
		
	}

}
