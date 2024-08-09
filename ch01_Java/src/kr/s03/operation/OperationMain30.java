package kr.s03.operation;

public class OperationMain30 {
	public static void main(String[] args) {
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
	
		
		//변수 선언
		int korean, english ,math, sum;
		char grade;
		float avg;
		
		do {
			System.out.print("국어: ");
			korean = input.nextInt();
		}while(korean<0 ||korean>100); // false가 되면 빠져 나간다. true가 되면 다시 while문
		
		do {
			System.out.print("영어: ");
			english = input.nextInt();
		}while(english<0 ||english>100);
		
		do {
			System.out.print("수학: ");
			math = input.nextInt();
		}while(math<0 ||math>100);
		
		//총점
		sum = korean +english+math;
		//평균
		avg = sum/3.0f;//f : 자료형 문자
		//등급 구하기->switch문 사용해서
		//switch는 조심해야 한다. switch는 int,문자,문자열만 가능하다.
		//따라서 강제로 int로 바꿔야한다.
		
		switch((int)(avg/10)){ //결과값에 대해서 int로 형변환을 해야한다.
		case 10:
		case 9:
			grade ='A';break;
		case 8:
			grade ='B';break;
		case 7:
			grade ='C';break;
		case 6:
			grade ='D';break;
		default:
			grade ='F';
		};
		
		System.out.println();
		System.out.printf("총점 =%d%n",sum);
		System.out.printf("평균 = %.2f%n",avg);
		System.out.printf("등급 = %c",grade);

		input.close();
		
	}

}
