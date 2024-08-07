package kr.s02.operator;

public class OperatorMain13 {

	public static void main(String[] args) {
		
		/*
		 [실습]
		 A전자 대리점에서 그날 물건 판매액의 15%를 할인해주기로 했습니다. 
		 판매한 상품명과 상품의 단가와 수량을 입력해서 지불 금액을 출력하는 프로그램을 작성하시오.
		 [입력 및 출력 예시]
		 상품명 입력 : 냉장고
		 단가 입력 : 5000000
		 판매 수량 입력 : 3
		 냉장고 3대의 가격은 1,275,000원
		 */
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		System.out.print("상품명 :");
		String str= input.nextLine();
		
		
		System.out.print("단가 입력 :");
		int num1 = input.nextInt(); //단가 input
		
		System.out.print("판매 수량 입력 :");
		int num2 = input.nextInt(); //판매 수량 input
		
		double total = (num1*num2)*0.85;
		
		//System.out.printf("가격 : %,.0f원%n",total);
		System.out.printf("%s %d개의 가격 : %,.0f원%n", str, num2, total);
		
		
		input.close();
		
	}

}
