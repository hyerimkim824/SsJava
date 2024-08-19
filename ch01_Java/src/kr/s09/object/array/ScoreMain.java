package kr.s09.object.array;
import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("인원수 : ");
		int num = input.nextInt();
		
		//배열 생성
		Score[] scoreArray = new Score[num];
		
		for(int i=0; i<scoreArray.length;i++) {
			
			System.out.print("이름 >");
			String name = input.next();
			System.out.print("국어>");
			int korean = input.nextInt();
			System.out.print("영어>");
			int english = input.nextInt();
			System.out.print("수학>");
			int math = input.nextInt();
			
			//객체를 생성해서 배열에 저장
			scoreArray[i] = new Score(name,korean,english,math);
			System.out.println("----------------------------------------------");
					}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("---------------------------------------------");
		
		//확장 for문
		for(Score score : scoreArray) {
			System.out.printf("%s\t", score.getName());
			System.out.printf("%d\t", score.getKorean());
			System.out.printf("%d\t", score.getEnglish());
			System.out.printf("%d\t", score.getMath());
			System.out.printf("%d\t", score.makeSum());
			System.out.printf("%d\t", score.makeAvg());
			System.out.printf("%s\n", score.makeGrade());
			
		}
		
		input.close();
	}

}
