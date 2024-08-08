package kr.s03.operation;

public class OperationMain13 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("성적 입력 : ");
		score = input.nextInt();
		
		if(score<0||score>100) {
			System.out.println("성적은 0~100 만 입력 가능");
			//프로그램 종료
			System.exit(0);
			
		}
		
		switch(score/10) { //score/10이 정수라서 가능
		case 10:
		case 9:  //JAVA에서는 ':'은 단지 구분선의 의미이지 조건을 제한하는 것은 아니다.
			grade = 'A';
			break;
			
		case 8:
			grade = 'B';
			break;
			
		case 7:
			grade = 'C';
			break;
			
		case 6:
			grade = 'D';
			break;
		default :
			grade = 'F';
			
		}
		
		System.out.println();//단순 줄바꿈
		System.out.printf("성적 : %d%n", score);
		System.out.printf("등급 : %c%n", grade);
		
		
		input.close();

	}

}
