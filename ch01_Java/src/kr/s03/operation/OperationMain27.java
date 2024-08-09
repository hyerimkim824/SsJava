package kr.s03.operation;

public class OperationMain27 {
	public static void main(String[] args) {
	
		//=======은행 프로그램=======//
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		long balance = 0L; //잔고, 그냥 0만 입력하면 int로 인식
		//처음부터 0L로 입력해서 long형 데이터로 입력하는 것이 좋다
		
		while(true) {
			System.out.println("-------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료 ");//메뉴가 된다.
			System.out.println("-------------");
			
			System.out.print("메뉴 선택>");
			
			int num = input.nextInt();
			
			if(num ==1) {//예금
				System.out.print("예금액 :");
				
				balance += input.nextInt();			
				
			}
			else if(num ==2) {//출금
				System.out.print("출금액 :");
				balance -= input.nextInt();
				
			}
			else if(num ==3) {//잔고확인
				
				System.out.print("잔고확인 "+balance);
				
			}
			else if(num ==4) {//종료
				
				System.out.println("프로그램 종료");
				
				break; //종료
				
			}
			else {
				System.out.println("잘못 입력 했습니다.");//다시 메뉴를 보여줌
			}		
			
			
			System.out.println("-------------");
			
			
		}
		
		
		
		input.close();
		
		
	}
	

}
