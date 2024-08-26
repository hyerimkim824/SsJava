package ch03.week1;
import java.util.Scanner;
import java.util.ArrayList;


public class Number2 {
	
	public static void main(String[] args) {
		
		
		Scanner input =
				new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("정수 10개 입력 >>");
		int[] integerArray = new int[10];
		

		for(int i=0;i<integerArray.length;i++) {
			
			integerArray[i] = input.nextInt();
			
			int num = integerArray[i];
			
			if(num%3 ==0) {
			list.add(num);}
			
	
		
			}
		
		for(int n : list) {
			System.out.printf("%d ",n);
		}
		
		input.close();
		

		}
		

		
	}


