package kr.s03.operation;

public class OperationMain34 {
	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 동전을 넣고 커피를 주문하면 커피를 판매하는 자판기 프로그램
		 * 자판기는 자판기 보유동전(1000), 커피(10),프림(10),설탕(10) 보유하고 있고
		 * 커피를 주문할 때 마다 자 판기 보유 동전-거스름돈, 커피 5, 프림 3, 설탕 1씩 차감되고 0이 되면 판매를 중단함
		 *
		 *[입력 및 출력 예시]
		 *동전을 넣으세요(커피값 : 400) : 500
		 *거스름돈 : 100원
		 *맛 좋은 커피가 준비되었습니다. <-계속 주문할 수 있다.
		 *
		 *======현재 자판기 정보=======
		 *커피양 : 5
		 *프림양 : 7
		 *설탕양 : 9
		 *자판기 보유 동전 금액 : 900원
		 *투입한 동전 금액 : 500원
		 *=========================
		 *or
		 *
		 *동전을 넣으세요(커피값:400) : 300
		 *(고객이 투입한 동전이 커피값보다 작으면) 투입한 동전이 부족합니다.
		 *
		 *or
		 *
		 *동전을 넣으세요(커피값:400) : 2000
		 *(커피가 부족하면) 커피가 부족합니다.
		 *(프림이 부족하면) 프림이 부족합니다.
		 *(설탕이 부족하면) 설탕이 부족합니다.
		 *(자판기 보유 동전이 부족하면) 거스름돈이 부족합니다.
		 */
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		//커피 정보
		int price = 400;
		
		//커피 한 잔에 들어갈 양
		int content_coffee=5;
		int content_cream =3;
		int content_sugar =1;
		
		//커피에 들어갈 재료의 현재 보유량
		int coffee = 10;
		int cream =10;
		int sugar=10;
		
		//투입한 금액 누적
		int amount =0;
		
		//자판기 보유 동전
		int coin = 1000;
		
		System.out.println("=======커피 자판기=======");
		
		while(true) {
	
	        System.out.println();
			System.out.print("1:커피 마시키, 2:종료>");
			int num = input.nextInt();
			System.out.println();
			
			if(num==1) {//커피마시기
				
				if(coffee<=0) {
					System.out.println("커피가 부족합니다.");
					break;		
				}
				else if(cream<=0) {
					System.out.println("프림이 부족합니다.");
					break;
					}
				else if(sugar<=0) {
					System.out.println("설탕이 부족합니다.");
					break;
					}
				
				
				System.out.print("동전을 넣으세요 : ");
				
				int payment = input.nextInt();
				
				if(payment<400) {
					System.out.println("커피를 살 수 없어요ㅠㅠ");
					break;
				}
				
				amount += payment;
				coffee -= content_coffee;
				cream -= content_cream;
				sugar -=content_sugar;
				
				int balance = payment-price;
				
				coin-=balance;
				
				
				
				if(coin<0) {
					System.out.println("거스름돈이 부족합니다.");
					break;
				}
				System.out.println("거스름돈 : "+balance);
				System.out.println("맛 좋은 커피가 준비되었습니다.");//계속 주문 가능
			
				
				System.out.println();
				System.out.println("=======현재 자판기 정보=======");
				System.out.println("커피양 : "+coffee);
				System.out.println("프림양 : "+cream);
				System.out.println("설탕양 : "+sugar);
				System.out.println("자판기 보유 동전 금액 : "+amount);
				System.out.println("투입한 동전 금액 : "+payment);
				System.out.println();
				System.out.println("******************");
			
				//
				
				
			}else if(num==2) {
				System.out.println("커피 그만 마실래요~");
				break;
				
			}else {
				
				System.out.println("잘못 입력 하셨어요~~");
				break;
				
			}
			
			
			
		}
	
		
		
		input.close();
		
		
		
		
		
		
		
		
		
	}

}
