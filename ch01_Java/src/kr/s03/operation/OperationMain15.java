package kr.s03.operation;

public class OperationMain15 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) { //i=1 :  변수 선언 & 초기화
			System.out.println(i+"번째 수행");
		}
		
		System.out.println("---------------------");
		//수행문이 한 줄일 경우 {}생략 가능
		//but 가급적으로는 중괄호를 넣는 것이 좋다.
		
		for(int i=1;i<=5;i++)
			System.out.println(i); //반복문을 쓸 경우에는 중괄호 명시가 더 좋다.
		
		
		System.out.println("프로그램 끝");
		

	}

}
