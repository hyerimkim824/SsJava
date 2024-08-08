package kr.s03.operation;

public class OperationMain10 {
	
	public static void main(String[] args) {
		
		java.util.Scanner input=
				new java.util.Scanner(System.in);
		
		int result=0; //초기화
		
		System.out.print("첫번째수=");
		int first = input.nextInt();
		
		System.out.print("연산자=");
		String operator = input.next();
		
		System.out.print("두번째수=");
		int second = input.nextInt();
		if(operator.equals("+")) {//입력한 연산자가  +이면
		result = first +second;
			
		}
		else if(operator.equals("-")) {
			//입력한 연산자가 - 이면 true
			
			result = first - second;
		}
		else if(operator.equals("*")) {
			//입력한 연산자가 * 이면 true
			
			result = first*second;
		}
		else if(operator.equals("/")) {
			//입력한 연산자가 / 이면 true
			if(second!=0) {
			result = first/second;}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0); //프로그램 종료
			}
		}
		else if(operator.equals("%")) {
			//입력한 연산자가 % 이면 true
			
			if(second!=0) {
				result = first%second;}
				else {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0); //프로그램 종료
				}
			
			result = first%second;
		}
		else {
			System.out.println("잘못된 연산자 입력");
			
			//프로그램 종료
			System.exit(0);
		}
		System.out.println();//단순 줄바꿈
		System.out.printf("%d %s %d = %d",first,operator, second, result);
		
		input.close();
	}
	
	

}
