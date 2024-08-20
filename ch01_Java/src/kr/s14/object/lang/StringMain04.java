package kr.s14.object.lang;

public class StringMain04 {
	
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력받은 문자열을 한 문자씩 읽엇 역순으로 표시
		 * 
		 * [입력 예시]
		 * 문자열 : hello
		 * 
		 * [출력 예시]
		 * olleh
	
		 *
		 *
		 */
	
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		System.out.print("문자열 : ");
		String s = input.nextLine();
		
		String[] array = s.split("");
		


		for(int i=array.length-1;i>=0;i--) {
			
			System.out.print(array[i]); //거꾸로 반환
			
		}
		
		input.close();
		
		
		
	
		
		
		
		
		
	}

}
