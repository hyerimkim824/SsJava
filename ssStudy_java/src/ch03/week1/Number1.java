package ch03.week1;
import java.util.*;


public class Number1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하세요>>");
		
		//using reference of ASCII
		//a~z : 97~122
	
		//input one alphabet usig scanner method
		char s = input.next().charAt(0);
		int index = (int)s;
	
		
		//make sequence of alphabet
		StringBuffer alpha = new StringBuffer();
		
		//append alphabet before finshing input alphabet
		for(int i=97;i<=index;i++) {		
		  alpha.append((char)i);
	
		}
		
		//show reverted alphabet sequence
		while(true) {
		
			System.out.println(alpha);
			//to show reverted shape, remve 0
			alpha.deleteCharAt(0);
			if(alpha.length()==0) {
				break;
			}
		}
		
	
		input.close();
		
	}

}
