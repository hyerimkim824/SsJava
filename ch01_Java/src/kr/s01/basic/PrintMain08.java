package kr.s01.basic;

public class PrintMain08 {
	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 유재석은 은행계좌를 가지고 있다. 계좌에 1,000원이 예금되어 있는데 오늘 325을 송금 받아서 잔고가 1,324이 되었다.
		 * 특별 이자율은 0.3이 적용되어 내일 이자 397.5원을 받는다.
		 * 
		 * 예금자, 송금되기전 잔금, 송금된 금액, 송금이후 잔금, 내일 입금될 이자를 출력하시오.
		 */
		
		System.out.println("==========실습=========");
		
		int num1=1000;
		System.out.printf("송금 되기 전 잔금 : %,d원%n",num1);
		
		int num2=325;
		System.out.printf("송금된 금액 : %,d원%n",num2);
		
		int num3=1324;
		System.out.printf("송금 이후 잔금 : %,d원%n",num3);
		
		double num4=397.5;
		System.out.printf("송금 이후 잔금 : %,.1f원%n",num4);
		
		
		
		
		
	}

}
