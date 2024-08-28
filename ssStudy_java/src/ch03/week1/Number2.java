package ch03.week1;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Number2 {
	
	public static void main(String[] args) {
		
		
		//set list(to add of multiple 3)
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//to use bufferedreader class, we should classify
		try{System.out.print("정수 10개 입력 >>");
		
		BufferedReader inputNum = 
				new BufferedReader(new InputStreamReader(System.in));

		
		StringTokenizer st = new StringTokenizer(inputNum.readLine());

		int[] integerArray = new int[10];


		for(int i=0;i<integerArray.length;i++) {

			integerArray[i] = Integer.parseInt(st.nextToken());
			
			int num = integerArray[i];
			
		

			if(num%3 ==0) {
				list.add(num);}}
			
			
			
			for(int n : list) {
				System.out.printf("%d ",n);}

		
		}catch(IOException e){}
		

		}
		
		

		}
		

		
	


