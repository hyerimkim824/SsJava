package kr.s03.operation;

public class OperationMain26 {
	public static void main(String[] args) {
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int a, total =0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true) {//메뉴 중심의 console 프로그램을 만들때 while문 활용
			System.out.print("누적할 정수 입력 : ");
			
			a= input.nextInt();
			
			if(a==0) {
				//반복문을 빠져나감
				
				break;
				
			}
			total +=a; //누적
			
		}
		
		System.out.println("total = "+total);
		input.close();
	}

}
