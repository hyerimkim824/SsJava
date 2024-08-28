package ch03.week1;

//Question number 4

import java.util.Scanner;
import java.io.IOException;


public class Number4 {
	
	public static void main(String[] args) {
		
		//make day array
		String[] dayArray = {"월","화","수","목","금","토","일"};
		
		
		
		while(true) {
		try{Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		int date = input.nextInt();
		
		if(date<0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		if(date%7 == 0) {
			System.out.println(dayArray[0]);
			continue;
		}else if(date%7==1) {
			System.out.println(dayArray[1]);
			continue;
			
		}else if(date%7==2) {
			System.out.println(dayArray[2]);
			continue;
		}else if(date%7==3) {
			System.out.println(dayArray[3]);
			continue;
		}else if(date%7==4) {
			System.out.println(dayArray[4]);
			continue;
		}else if(date%7==5) {
			System.out.println(dayArray[5]);
			continue;
		}else if(date%7==6) {
			System.out.println(dayArray[6]);
			continue;
		
		}
		input.close();
		}catch(Exception e) 
		{System.out.println("정수를 입력하지 않았습니다.");

		}
		}

		
		
	}

}
