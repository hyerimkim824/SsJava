package kr.s14.object.lang;

public class StringMain05 {
	
	/*
	 * [실습]
	 * 변수에 저장된 문자열 중 대문자는 소문자로 변경하고
	 * 소문자는 대문자로 변경하시오.
	 */
	
	
	
	
	//char -> String
	//String.valueOf(c).toLowerCase()
	
	
	public static void main(String[] args) {
		
		String str = "abcMDye-4W?EWzz";
		
		System.out.println("원본 : abcMDye-4W?EWzz");
		
		System.out.print("변환 : ");
		
		for(int i=0;i<=str.length()-1;i++) {
			
			char c = str.charAt(i);
	
			int n = (int)c;
			
			if (n>= 65& n<=90) {
				
				System.out.print(Character.toLowerCase(c));
	
			}else if(n>=97&n<=122) {
				System.out.print(Character.toUpperCase(c));
			}else {System.out.print(c);}
		

		}
		
		//새롭게 하는 방법
		System.out.println();
		System.out.println("----------------------");
		String result3 ="";
		char[] array = str.toCharArray();
		
		//String ->char[]
		for(char c:str.toCharArray()) {
			
			//static method : Charater라는 class에서 대문자이면 true를 반환하는 method
			if(Character.isUpperCase(c)){
				result3+=Character.toLowerCase(c);//대문자를 소문자로 변환
				
			}else if(Character.isLowerCase(c)){
				result3 +=Character.toUpperCase(c);
			
			}else {
				result3 +=c;
			}
			

		}
		System.out.println("변환2 : "+result3);
		

		
	}
	

}
