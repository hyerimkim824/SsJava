package kr.s19.enumtest;

class Course{
	
	//문자열 상수
	public static final String JAVA = "JAVA";
	public static final String ORACLE ="ORACLE";
	public static final String HTML = "HTML";
	
	
}


public class EnumMain01 {
	public static void main(String[] args) {
		
		//프로그래밍에서는 상수는 문자열 일 수 있다.->문자열 상수
		
		System.out.println(Course.JAVA);
		System.out.println(Course.ORACLE);
		System.out.println(Course.HTML);
		
		
		
	}

}
