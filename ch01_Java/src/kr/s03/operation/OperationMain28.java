package kr.s03.operation;

public class OperationMain28 {
	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 커피 전문점에서 아메리카노가 4000원입니다. 마실 커피 수량을 정하고 돈을 지불하세요.
		 * 지불한 돈에서 발생한 거스름돈을 출력하고 커피의 총 비용보다
		 * 지불한 돈이 적어서 커피를 구매할 수 없을 경우
		 * "금액이 부족합니다."라고 알려준 후 다시 지불할 수 있는 프로그램을 작성하시오.
		 * (정상적으로 아메리카노를 구매하면 반복문을 빠져나오고 금액이 부족하면 계속 반복)
		 * 
		 * [입력 예시]
		 * 구매 수량 입력 : 1
		 * 내가 지불한 금액 : 5000 or 3000
		 * 
		 * [출력예시]
		 * 거스름돈은 1,000원 입니다. ->반복문을 빠져나감
		 * or
		 * 1,000원이 부족합니다. ->계속 반복
		 * 
		 * 
		 * 
		 */
		
		//=======커피 구매 프로그램=======
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int price = 4000; //커피 단가
		int quantity; //수량
		int balance; //거스름돈
		int payment; //지불한 돈
		int total; //지불해야할 총 금액
		
		System.out.println("=======커피 구매 프로그램======");
		System.out.print("구매 수량 입력 : ");//수량 입력
		quantity = input.nextInt();
		
		System.out.print("내가 지불한 금액 : ");//금액 입력
		payment = input.nextInt();
		
		System.out.println();
		
		while(true) {
			
			//거스름돈이 0이상이면 정상적 구매로 반복문을 빠져나감
			
			if(payment<0) {
				System.out.println();
				System.out.println("잘못된 금액 입니다");
				
			}
			
		    //계산
			total = price*quantity;
			balance = payment - total;
			
			
			if(balance<0){
			
				System.out.printf("%d원이 부족합니다.%n",-balance);
				System.out.println();
				
			}
			
			else{
				System.out.println();
				System.out.printf("거스름돈은 %d입니다.%n",balance);	
				break;			
			}
			
			System.out.print("내가 지불한 금액 : ");//금액 입력
			payment = input.nextInt();
		}
		
		
		input.close();
		
		
	}

}
