package ch03.week1;
import java.util.Scanner;
import java.io.IOException;


public class Number3 {
	public static void main(String[] args) {

		System.out.print("정수를 입력하세요 : ");
		Scanner input = new Scanner(System.in);


		try {

			int input_num = input.nextInt();
			
			if(input_num>0 &input_num%2==0) 
			{System.out.println("짝수");}
			else if(input_num>0 &input_num%2==1)
			{System.out.println("홀수");}
			else {
				System.out.println("양수를 입력하세요");
			}
			}catch(Exception e) 
		{System.out.println("잘못 입력했습니다.");}

		input.close();
	}
}
