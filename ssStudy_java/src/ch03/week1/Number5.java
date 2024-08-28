package ch03.week1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Number5 {
	
	public static void main(String[] args) {
		

		try{System.out.print("입력하세요 : ");
		BufferedReader inputNum = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(inputNum.readLine());
		
		int[] integerArray = new int[10];
		
		for(int i=0; i<integerArray.length;i++) {
			
			int num = Integer.parseInt(st.nextToken()); 
			integerArray[i] =num;
			if(i==integerArray.length) {
				break;
			}
		
		}
		
		//make arrangement
		for(int i=0; i<integerArray.length;i++) {
			for(int j=0;j<integerArray.length;j++) {
				
				int num1 = integerArray[i];
				int num2 = integerArray[j];
				
				if(num1<num2) {
					integerArray[i] = num2;
					integerArray[j] = num1;
						}
				
			}
		}
		
		
		for(int n :integerArray) {
			System.out.printf("%d ",n);
		}
		
		}	
		
	catch(IOException e){}
	
	}	

}

