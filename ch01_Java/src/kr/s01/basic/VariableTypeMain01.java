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
		
		System.out.println("====정수형====");
		//byte, 크기 : 1byte, 표현범위 : -128~127
		byte b1 = 127; 
		System.out.println("b1 = " +b1);
		
		//short, 크기 : 2byte, 표현범위 : -32,768~32,767
		short s1 = 32767;
		System.out.println("s1 = "+s1);
		
		//int, 크기 : 4byte, 표현범위 : -2,147,483,648~2,147,483,647
		int in1 = 1234;
		System.out.println("in1 = "+in1);
		
		//JAVA system은 23같은 숫자는 자동적으로 int형 데이터가 된다.
		//만약 23을 long 데이터로 보고 싶으면 23L로 사용해야한다.
		
		//long, 크기 : 8byte
		long lg1 = 1234L;
		System.out.println("ig1 = "+lg1);
		
		//float, 크기 : 4byte
		//기본적인 실수 데이터는 double 데이터로 인식이 된다.
		float f1 = 9.1f; // 9.1로 사용하면 에러가 난다.
		System.out.println("f1 = "+f1);
		
		//double, 크기 : 8byte(소수점 이하 자리의 정밀도가 향상된다.)
		//더 정밀도를 높이려면 다른 자료형을 사용해야 한다.
		
		double d1 = 9.8;
		System.out.println("d1 = "+d1);
		
		System.out.println("====문자열 표시====");
		//문자열 표시(기본 자료형이 아님, 참조 자료형)
		String str = "Hello World";
		System.out.println("str = "+str);
		
		String str5 = "이름\t나이\t취미";
		System.out.println(str5);
		
		
		
		
	}

}
