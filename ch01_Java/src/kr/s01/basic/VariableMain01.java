package kr.s01.basic;

public class VariableMain01 {
	public static void main(String[] args) {
		//변수(Variable)값을 저장할 수 있는 메모리의 공간
		//변수 선언
		int num; //int : 정수(메모리 공간 만들기)
		
		//변수의 초기화
		num = 17; // =이 하나일 때는 대입을 의미한다
		System.out.println(num);
		
		//변수 선언, 초기화
		int number = 20;
		System.out.println(number);
		
		//데이터 변경
		number = 40;
		System.out.println(number);
		
		
		//주의사항
		//동일한 변수명으로 변수를 선언하면 오류 발생
		//int number =30
		
		System.out.println("---------------");
		
		//동일한 자료형을 사용하기 때문에 두번째 변수명 앞의 자료명은 생략함.
		/*
		int a = 10;
		int b = 20
		*/
		
		int a=10, b =20;
		int result = a+b;//변수의 값을 호출해서 연산
		System.out.printf("result=%d%n",result);
		
		/*
		 * + : 연산
		 * 숫자+숫자
		 * 
		 * + : 연결
		 * 문자열+슷자 -> 문자열과 숫자를 연결해서 새로운 문자열
		 * 숫자+문자열
		 * 문자열+문자열
		 */
		
		System.out.println("result="+result);//연결
		
		
		//주의사항 
		System.out.println("결과 : "+a+b); //연결
		System.out.println("결과 : "+(a+b)); //연산
		
		//변수 선언
		


		//변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야 맘
		//System.out.println(no);
		
		
	}

}
