package kr.s14.object.lang;
import java.util.Scanner;
import java.util.Random;

public class RandomMain02 {
	public static void main(String[] args) {
		
		/*
		 * [입력예시]
		 * 가위바위보 입력(0.가위, 1.바위, 2.보) : 1
		 * 
		 * [출력예시]
		 * ->컴퓨터 : 가위, 사람 :바위 
		 * 결과 :사람 승
		 */
		
		
		String[] item = {"가위","바위","보"};
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1.게임하기, 2.종료 >>");
			int num = input.nextInt();
			

			if(num==1) {//게임하기
				
				System.out.print("가위 바위 보 입력(0.가위,1.바위,2.보) >> ");
				
				
				int person_num = input.nextInt();
				
				if(person_num <0||person_num>2) {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				
				double ran = Math.random();
				
				int index = (int)(ran*3);//0~2 범위의 난수 발생
			    
				System.out.println("컴퓨터 : "+ item[index]+", 사람 : "+item[person_num]);
				
				String result;
				
				if(index==0) {
					 
					
					System.out.print("결과 : ");
					//컴퓨터 : 가위(0)
		
					 if(person_num==1) {//사람: 바위 
						 System.out.println("사람 승");
					 }else if(person_num==2) {
						 System.out.println("컴퓨터 승");
	 
					 }else {System.out.println("비겼습니다.");}
					 
				}else if(index ==1) {
					//컴퓨터 : 바위(1)
					
					 if(person_num==2) {//사람: 보 
						 System.out.println("사람 승");
					 }else if(person_num==0) { //사람 : 가위
						 System.out.println("컴퓨터 승");
					 }else {System.out.println("비겼습니다.");}
					 
					
				}else {
					
					//컴퓨터 : 보(2) 
					result = item[2];
					
					if(person_num==0) {//사람: 가위
						 System.out.println("사람 승");
					 }else if(person_num==1) { //사람 : 가위
						 System.out.println("컴퓨터 승");
					 }else {System.out.println("비겼습니다.");}
				}
				
				System.out.println();
				
				
			}else if(num==2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력했습니다.");
			}
		}
		
		
		input.close();
		
	}

}
