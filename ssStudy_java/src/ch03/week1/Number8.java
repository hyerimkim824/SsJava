package ch03.week1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number8 {
	
	public static void main(String[] args) {
		
		String str[] = {"가위","바위","보"};
		
		double ran = Math.random();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("컴퓨터와 가위바위 보 게임을합니다. ");
		System.out.println("=========================");
		while(true) {
			
			System.out.print("가위 바위 보!!>>");
			
			String hand = input.next();
			int index = (int)(ran*3);//1~3 범위의 난수 발생
			int num = Arrays.asList(str).indexOf(hand);
			
			if(num==-1) {
 				System.out.println("잘못입력하셨습니다.");
 				continue;
 			}
			
			if(hand.equals("그만")){
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			System.out.print("사용자 = " +hand+", 컴퓨터 = "+ str[index]);
			           //컴퓨터  //사람
 			int calNum = index-num;
 			/*
			 * 컴퓨터     사람      calNum  결과
			 * 가위(0) - 바위(1)    -1      사람
			 * 가위(0) -  보(2)    -2      컴퓨터
			 * 바위(1) - 가위(0)     1     컴퓨터 
			 * 바위(1) -  보(2)    -1       사람
			 * 보(2)  -  바위(1)    1       컴퓨터
			 * 보(2)  -  가위(0)    2       사람
			 *
			 */
 			
 			
 			if(calNum ==0) {
 				System.out.println(", 비겼습니다.");
 			}else if(calNum ==-1 || calNum==2) {
 				System.out.println(", 사람이 이겼습니다.");
 			}else {
 				System.out.println(", 컴퓨터가 이겼습니다.");
 			}
 			
 			
 			
			
			
			
		}
		
		input.close();
	}

}
