package ch03.week1;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Number5_2 {
	
	public static void main(String[] args) {
		
		
		int[] num_array = {3,24,1,2,10};
		/*try { 
			input_num = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e) {	
			//Exception  메세지 출력
			e.printStackTrace();
			
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		*/
		
		for(int i=0; i<num_array.length;i++) {
			for(int j=0;j<num_array.length;j++) {
				
				int num1 = num_array[i];
				int num2 = num_array[j];
				
				if(num1<num2) {
					num_array[i] = num2;
					num_array[j] = num1;
					
				}
				
			}
		}
		
		for(int n : num_array) {
			System.out.print(n+" ");
		}
		
	}

}
