package ch03.week1;

import java.util.Arrays;
import java.util.Scanner;

public class Number6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"학생","사랑","자바","행복한","미래"};
		
		while(true) {
		System.out.print("영어 단어를 입려하세요 >>");     
	
		//input 
		
		String ex = input.nextLine();
		
		if(ex.equals("exit")) {
			System.out.println("종료합니다...");
			break;
		}
		int num = Arrays.asList(eng).indexOf(ex);
		if(num ==-1) {
			System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			System.out.println();
			
		}else {
		System.out.println(kor[num]);}}
		System.out.println();

		
		input.close();
		
	}

}
