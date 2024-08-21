package kr.s10.object.extention;

public class MinusAccount extends BankAccount{

	/*
	 * [실습]
	 * 1. 한도를 의미하는 minusLimit 멤버 변수 정의
	 * 2. BankAccount를 상속받음
	 * 3. 생성자에서 number, name, balance, minusLimit를 전달 받아서 멤버변수에 저장
	 * 4.withdraw, printAccount 메서드 재정의
	 */

	private long minusLimit;

	//생성자
	public MinusAccount(String number, String name, long balance, long minusLimit) {

		super(number,name,balance);
		this.minusLimit = minusLimit;
	
	}

	//출금하기
	
	@Override
	public void withdraw(long amount) {
		if(amount <=0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			System.out.println();
			return;
		}
		
		if(balance<amount) {
			
		

			long minus_amount = minusLimit-amount;
			
			if(minus_amount<0) {
				System.out.println("마이너스 통장의 한도를 초과하였습니다.");
				System.out.println();
				return;
			}else {
				minusLimit -=amount;
				System.out.printf("마이너스통장에서 %d원 출금되었습니다.%n",amount);
				System.out.println();
			}
		}else {
		balance -= amount;
		System.out.printf("%d원이 출금 되었습니다.%n", amount);
	}
	}
	
	
	public void printAccount() {
		System.out.println("----------------------");
		System.out.println("(마이너스)계좌번호 : "+ number);
		System.out.println("예금주 "+ name);
		System.out.printf("계좌잔액 : %,d원%n", balance);
		System.out.printf("마이너스 계좌 잔액: %,d원%n",minusLimit );
		System.out.println("----------------------");
		System.out.println();
		
		
	}







}
