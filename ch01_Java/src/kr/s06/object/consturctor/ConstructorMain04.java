package kr.s06.object.consturctor;
import java.util.Scanner; //java.util package에 있는 class Scanner를 호출한다.


class Account{
	
	//멤버필드
	String accountNo;
	String ownerName;
	int balance;

	//생성자
	public Account(String a, String o, int b) {
		accountNo =a;
		ownerName = o;
		balance = b;

		System.out.println(ownerName+"님 계좌가 생성되었습니다.");
	}
	
	//입급하기
	public void deposit(int amount) {
		if(amount <=0) {
			System.out.println("0보다 크게 입력해야 합니다.");
			return; //break랑 비슷하다. But break는 반복문에서 쓰인다.
		}
		
		balance +=amount;
		System.out.println("입금이 완료되었습니다.");
	}

	//출금하기
	public void withdraw(int amount) {
		if(amount <=0) {
			System.out.println("0보다 크게 입력해야 합니다.");
			return;
		}
		if(balance<amount) {
			System.out.println("잔고가 부족합니다.");
			return;
		
		}
		balance -=amount;
		System.out.println("출금이 완료되었습니다.");

	}
	//계좌 정보 출력
	public void printAccount() {
		System.out.println("계좌번호 : "+accountNo);
		System.out.println("예금주 이름: "+ownerName);
		System.out.printf("잔고:%d%n", balance);
	}

}


public class ConstructorMain04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//입력 정보
		System.out.print("계좌번호 :");
		String accountNo = input.nextLine();
		System.out.print("예금주 : ");
		String ownerName = input.nextLine();
		System.out.print("잔고 : ");
		int balance = input.nextInt();
		
		//계좌 생성
		Account account = new Account(accountNo,ownerName,balance);
		
		//정보 처리
		
		while(true) {
			System.out.println("");
			System.out.print("1.예금, 2.출금, 3.잔고확인, 4.종료 : ");
			int num = input.nextInt();
			System.out.println("");
			
			if(num==1) {
				System.out.print("예금액 : ");
				account.deposit(input.nextInt());
				
			}else if(num==2) {
				System.out.print("출금액 : ");
				account.withdraw(input.nextInt());
		
			}else if(num ==3) {
				System.out.println("======잔고확인======");
				account.printAccount();
				
			}else if(num ==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}//end of while
		
		input.close();
		
		
	
		
	}

}
