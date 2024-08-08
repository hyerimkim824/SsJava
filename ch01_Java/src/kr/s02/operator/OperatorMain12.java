package kr.s02.operator;

public class OperatorMain12 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * [실수]
		 * 키보드에서 입력한 정수값에 마지막 자리수를 제외한 값과 마지막 자릿수를 표시하시오.
		 * 
		 * [입력 예시]
		 * 정수값 : 123
		 * 
		 * [출력 예시]
		 * 마지막 자릿수를 제외한 값 : 12
		 * 마지막 자릿수 : 3
		 */
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		System.out.print("정수값:");
		int num = input.nextInt();
		
		int num2 = num/10;//마지막 자릿수를 제외한 값
		int num3 = num%10;//마지막 자릿수
		
		System.out.println("마지막 자릿수를 제외한 값 = " + num2);	
		System.out.println("마지막 자릿수 = " + num3);	
		
			
		
		input.close();
	

	}

}
