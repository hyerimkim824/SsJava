package kr.s21.exception;


public class ExceptionMain04 {
	public static void main(String[] args) {
		//try~catch~fianlly
		//finally 영역은 예외가 발생하든 발생하지 않든 무조건 수행하는 블럭
		//입출력, 파일 접근 등 꼭 해야하는 영역
		
		System.out.println("=====예외가 발생하지 않는 경우=====");
		try{System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		}catch(Exception e) {
			
		}finally {
			System.out.println("4");
			
		}
		System.out.println("프로그램 종료");
		
		System.out.println("---------------------");
		
		System.out.println("====예외가 발생하는 경우====");
		try {
			System.out.println("1");
			System.out.println(10/0);
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
			
		}finally {
			System.out.println("4");
		}
		
		System.out.println("프로그램 종료");
		
	
	
	}

}
