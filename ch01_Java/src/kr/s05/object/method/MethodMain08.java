package kr.s05.object.method;
	

class Account{
	
	//멤버 변수
	String account_num;
	String name;
	int balance;
	
	//method
	public void deposite(int n) {
		balance += n;
		System.out.println("예금 처리 후 입금이 완료되었습니다.");
	}
	
	public void withraw(int n) {
		balance-=n;
		System.out.println("출금 처리 후 출금이 완료되었습니다.");
		
	}
	public void printAccount() {
		System.out.println("계좌번호 : "+account_num);
		System.out.println("예금주 : "+name);
		System.out.println("잔고 : "+balance);
		
	}
	
	
	/*
	 * [실습]
	 * Account
	 * 1)멤버변수 : 계좌번호(account_num),예금주(name), 잔고(balance)
	 * 2)멤버 메서드 : -예금하기(deposite) : balance 값 누적
	 * 				예금 처리 후 입금이 완료되었습니다.(문구 출력)
	 * 				-출금하기(withraw) : balance 값 차감
	 * 				 출금 처리 후 출금이 완료되었습니다.(문구 출력)
	 * 				-계좌정보(printAccount) : 계좌번호, 예금주, 잔고 출력
	 * 
	 * MethodMain08의 main
	 * 1)Scanner 생성
	 * 2)Account 생성
	 * 3)계좌 기본 정보 입력 : 계좌번후, 예금주, 잔고
	 * 4)while(true)형식으로 반복문 안에 메뉴
	 *  (1.예금|2.출금|3.잔고확인|4.종료)
	 * 
	 */
}


public class MethodMain08 {
	
	public static void main(String[] args) {
		
		java.util.Scanner input = //scanner 생성
				new java.util.Scanner(System.in);


		//계좌 생성
		Account account = new Account(); //생성자
		//계좌 기본 정보 입력
		
		/*
		 * 해결해야 할 문제
		 * ------------------------------------
		 * String account_num;
	       String name;
		 * 
		 * 
		 * System.out.print("계좌번호 입력 : ");
		  account.account_num = input.nextLine();
		  System.out.print("이름 입력 : ");
		  account.name = input.nextLine();
		  ---------------------------------------
		  아래와 같이 코드를 짜면 이름 입력이 잘 되지 않는다.
		  고쳐보자!!!
		  
		   int account_num;
	       String name;
		 * 
		 * 
		 * System.out.print("계좌번호 입력 : ");
		  account.account_num = input.nextInt();
		  System.out.print("이름 입력 : ");
		  account.name = input.nextLine();
		 * 
		 */
		System.out.print("계좌번호 입력 : ");
		account.account_num = input.nextLine();
	
		System.out.print("이름 입력 : ");
		account.name = input.nextLine();
		
		account.balance = 0;
		int input_money =0;
		int input_num=0;
		int output_money = 0;
		
		while(true) {
			System.out.println();
			//은행 코드
			System.out.print("1.예금|2.출금|3.잔고확인|4.종료>>");
			input_num = input.nextInt();
			
			//예금
			if(input_num ==1) {
				
				System.out.print("예금 금액 : ");
				input_money = input.nextInt(); //예금 금액 입력
				if(input_money>=0) {//금액이니 양수가 되어야 한다.
				account.deposite(input_money);}
				
			}else if(input_num==2) {
				System.out.print("출금 금액 : ");//출금 금액 입력
				output_money = input.nextInt();
				if((account.balance-output_money)<=0) {//출금 금액이 잔고보다 많아야 한다.
					System.out.println("계좌 잔고가 부족합니다");
				}else {account.withraw(output_money);}//출금
				
			}else if(input_num ==3) {
				System.out.println("====잔고확인===="); //잔고 정보 확인
				account.printAccount();}
			else if(input_num ==4) {
				System.out.println("종료되었습니다."); //종료
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다."); //처음 입력을 잘못 했을때
			}
			
		}
		input.close();

		
	}
		
		
	}


