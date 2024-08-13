package kr.s03.operation;

public class OperationMain14 {
	public static void main(String[] args) {
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int result = 0;
		
		System.out.print("첫번째 수 : ");
		int first = input.nextInt();
		
		System.out.print("연산자 : ");
		
		String operator = input.next();
		
		System.out.print("두번째 수 : ");
		int second = input.nextInt();
		
		switch(operator) {
		case "+": 
			result = first+second;break;
		case "-":
			result = first-second;break;
		case "*":
			result = first*second;break;
		case "/":
			if(second!=0) {
			result = first/second;break;}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0); // 프로그램 종료
			}
		case "%":
			if(second!=0) {
				result = first%second;break;}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0); //프로그램 종료
				}
		
		default:
			System.out.println("잘못된 연산자 입력");
			System.exit(0); //프로그램 종료
		}
		
		System.out.println();//단순 줄바꿈
		System.out.printf("%d %s %d = %d",first, operator, second,result);
		
		
		input.close();
		
	}

}
