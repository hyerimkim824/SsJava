package kr.s10.object.extention;



public class BankAccount {
	
	protected String number;
	protected String name;
	protected long balance;
	
	//생성자
	public BankAccount(String number, String name, long balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		
		System.out.println(number+ "계좌가 개설되었습니다.");
		System.out.println();
	}
	
	//method
	//예금하기
	public void deposit(long amount) {
		if(amount <=0) {
			System.out.println("0 이하의 금액은 입금할 수 없습니다.");
			return; //void일 때는 return을 쓰면 함수 종료			
			
		}
		balance +=amount;
		System.out.printf("%d원이 입금 되었습니다.%n", amount);
		System.out.println();
	}
	//출금하기
	
	public void withdraw(long amount) {
		if(amount <=0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if(balance<amount) {
			System.out.println("잔액이 부족합니다.");
			return; //단일 if문을 쓰기 위해서 return
		}
		
		balance -= amount;
		System.out.printf("%d원이 출금 되었습니다.%n", amount);
		
	}
	//계좌 정보 출력하기
	
	public void printAccount() {
		System.out.println("(일반)계좌번호 : "+ number);
		System.out.println("예금주 "+ name);
		System.out.printf("계좌잔액 : %,d원%n", balance);
		System.out.println("----------------------");
		
		
	}
	

}
