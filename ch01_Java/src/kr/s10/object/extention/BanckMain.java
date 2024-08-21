package kr.s10.object.extention;

import java.util.Scanner;

public class BanckMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("계좌번호 : ");
		String number = input.next();
		System.out.print("예금주 : ");
		String name = input.next();
		System.out.print("잔고 : ");
		long balance = input.nextLong();
		
		BankAccount account = new BankAccount(number, name, balance);
		
		while(true) {
			System.out.print("1.입금, 2.출금, 3.계좌정보, 4.종료");
			int num = input.nextInt();
			
			if(num ==1) {
				System.out.print("입금액 :");
				account.deposit(input.nextLong());
				
			}else if(num ==2) {
				
				System.out.print("출금액 :");
				account.withdraw(input.nextLong());
				
			}else if(num==3) {
				System.out.println("계좌정보");
				account.printAccount();
				
			}else if(num ==4){
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		
		}

		input.close();
	}

}
