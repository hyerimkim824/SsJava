package kr.s03.operation;

public class OperationMain06 {
	public static void main(String[] args) {
		java.util.Scanner input=
				new java.util.Scanner(System.in);
		
		//변수 선언
		int score;
		char grade;
		System.out.print("성적 입력 : ");
		
		score = input.nextInt();
		
		//다중 if
		if(score>=90 && score <=100) {
			//90~100
			grade ='A';	
		}
		else if(score>=80 && score<=89) {
			//80~89
			grade = 'B';
				
		}
		else if(score>=70 && score<=79) {
			//70~79
			grade = 'C';
		}
		else if(score>=60 && score<=69) {
			//60~69
			grade = 'D';
		}
		else if(score>=0 && score<=59) {
			//0~59
			grade = 'F';}
		else {
			grade ='?';
		}
		System.out.println("성적 : "+score);
		System.out.println("등급 : "+grade);
		//
		
		input.close();
		
	}

}
