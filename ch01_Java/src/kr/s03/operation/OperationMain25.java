package kr.s03.operation;

public class OperationMain25 {
	public static void main(String[] args) {
		
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int a, total=0;
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		System.out.print("누적할 정수 데이터 입력 : ");
		
		while((a=input.nextInt())!=0) {//대입 연산자는 원래 나중이다. 그러나 소괄호를 통해서 우선순위를 앞으로
			
			// 누적
			total+=a;
			System.out.print("누적할 정수 데이터 입력 : ");
			
			
			
			
		}
		System.out.println("total = "+total);
		
		input.close();
		
		
		
		
		
	}

}
