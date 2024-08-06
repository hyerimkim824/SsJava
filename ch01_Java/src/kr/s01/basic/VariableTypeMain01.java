package kr.s01.basic;

public class VariableTypeMain01 {
	public static void main(String[] args) {
		
		System.out.println("===논리형===");
		//논리형(true,false)
		boolean b = true;
		System.out.println("b = "+b);
		
		System.out.println("===문자형===");
		//문자형, 크기 : 2byte, 표현범위 : 0 ~ 65,535
		//다국어 처리를 위한 유니코드(unicode) 방식
		char c1='A'; //내부적으로 아스키코드값 65가 2byte 크기의 변수에 할당 
		System.out.println("c1 = "+c1);
		
		//A에 해당하는 아스키코드값 65를 직접 대입, 출력시 A 출력
		char c2=65;
		System.out.println("c2 = "+c2)
		;
		char c3 = '\u0041'; //A 를 유니코드로 표현
		System.out.println("c3 = "+c3);
		
		char c4 = '자';
		System.out.println("c4 = "+c4);
		
		char c5= '\uc790'; //자를 유니코드로 표현
		System.out.println("c5 = "+c5);
		
		
		
	}

}
