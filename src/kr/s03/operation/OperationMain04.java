package kr.s03.operation;

public class OperationMain04 {
	
	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 두개의 정수를 입력 받아서 최대값과 최소값을 구하시오.
		 * 
		 * [압력예시]
		 * 
		 * 첫번째 정수 : 7
		 * 두번째 정수 : 2
		 * 
		 * [출력예시]
		 * 최대값 : 7
		 * 최소값 : 2
		 * 
		 */
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int num1 = input.nextInt();
		System.out.print("두번째 정수 :");
		int num2 = input.nextInt();
				
		
		//단일 if문에서 다중if로 바꿈
		if(num1>num2) {
			System.out.printf("최대값 : %d%n", num1);
			System.out.printf("최소값 : %d%n", num2);
			}
		else if(num1<num2) {
			System.out.printf("최대값 : %d%n", num2);
			System.out.printf("최대값 : %d%n", num1);
			}
		else {
			System.out.print("두 수는 같다");
		}
		

		//


		
		input.close();
		

	}

}
