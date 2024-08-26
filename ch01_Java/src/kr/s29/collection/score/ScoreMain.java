package kr.s29.collection.score;

import java.util.ArrayList;

import kr.s27.collection.product.Product;
import kr.s28.collection.member.Member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScoreMain {

	/*
	 * [실습]
	 * Score
	 * 멤버변수 : 이름(name),국어(Korean),영어(english),수학(math)
	 * 멤버메서드 : get/set 쌍으로 생성, 총점(int 반환 makeSum()), 평균(double makeAvg)
	 *           등급(String makeGrade())
	 * ScoreMain
	 * 메뉴 : 1. 성적입력, 2. 성적출력, 3. 종료
	 * 메서드명 : 메뉴 callMenu(), 성적입력 inputScore(), 성적출력 printScore()
	 * 입력시 조건 체크 : 성적은 0~100입력 가능 (ParseInputData)
	 *        
	 */
	
	private ArrayList<Score> list;
	private BufferedReader br;
	
	public ScoreMain() {
		
		list = new ArrayList<Score>();
		try { 
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			
			//Exception  메세지 출력
			e.printStackTrace();
			
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}
	
	public void callMenu() throws IOException{
		
		while(true) {
			System.out.print("1.성적입력, 2.성적 출력, 3. 종료 >> ");
			try {
				//String -> int
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					inputScore(); //상품 입력
				}else if(num ==2) {
					printScore();
				}else if(num==3) {
					System.out.println("프로그램 종료");
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용");

			}
		}
		
		
	}
	
	
public void inputScore() throws IOException{
		
		Score s =new Score();
		System.out.print("회원이름 : ");
		s.setName(br.readLine());
	
		
		
		System.out.print("국어 성적 : ");
		while(true) {

		int korean= Integer.parseInt(br.readLine());
		if(korean>=0&korean<=100){s.setKorean(korean);
		break;}
		else {System.out.print("국어 점수를 잘못입력하셨습니다. 다시 입력하세요 :");
			
		}
		}
		
		
		System.out.print("영어 성적 : ");
		while(true) {

		int english= Integer.parseInt(br.readLine());
		if(english>=0&english<=100){s.setEnglish(english);
		break;}
		else {System.out.print("영어 점수를 잘못입력하셨습니다. 다시 입력하세요 :");
			
		
		}
		}
		System.out.print("수학 성적 : ");
		while(true) {

		int math= Integer.parseInt(br.readLine());
		if(math>=0&math<=100){s.setMath(math);
		break;}
		else {System.out.print("수학 점수를 잘못입력하셨습니다. 다시 입력하세요 :");
			
		}
		}
		
		//score를 ArrayList에 저장
		list.add(s);
		System.out.println("학생 1명의 정보가 추가되었습니다.");
		
		}

public void printScore() {
	
	System.out.println("학생 리스트 : 총 학생수 ("+list.size()+")");
	System.out.println("학생이름\t국어점수\t영어점수\t수학점수\t총점\t평균\t등급");
	

	//확장 for문
	for(Score s2 : list) {
		
		System.out.printf("%s\t", s2.getName());
		System.out.printf("%d\t",s2.getKorean());
		System.out.printf("%d\t",s2.getEnglish());
		System.out.printf("%d\t", s2.getMath());
		System.out.printf("%d\t",s2.makeSum());
		System.out.printf("%.2f\t",s2.makeAverage());
		System.out.printf("%s%n",s2.makeGrade());
		
	}
	
	
}



		

	
	
	public static void main(String[] args) {
		new ScoreMain();
	}
}
