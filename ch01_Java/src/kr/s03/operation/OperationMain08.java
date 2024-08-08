package kr.s03.operation;

public class OperationMain08 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 하나를 입력하여 짝수이면 10을 더하고 홀수이면 20을 더하여 
		 * 결과값을 출력하시오.
		 * 
		 * [입력 예시]
		 * 정수 하나 입력 : 5
		 * 
		 * [출력 예시]
		 * 결과 : 25
		 */

		java.util.Scanner input=
				new java.util.Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		
		//변수 선언
		
		int num = input.nextInt();	
		int num_result = num%2; //짝,홀수 check
		
		if(num_result==0) { 
			int even_num = num+10; //짝수 조건
			System.out.println("결과 : "+even_num);
		}
		else if(num_result==1) {
			int odd_num = num+20;//홀수 조건
			System.out.println("결과 : "+odd_num);
		}
		
		input.close();
		
		
		
	}

}
