package kr.s21.exception;

public class ExceptionMain03 {
	
	public static void main(String[] args) {
		
		int var = 50;
		
		//다중 catch문
		try {
           ///String -> int
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			/*
			 * (주의) 다중 catch문을 사용할때
			 * Exception과 하위 예외 클래스를 동시에 명시할 때는
			 * 하위 예외 클래스를 먼저 명시하고 가장 뒤에 Exception을 명시해야 동작상의 문제가 발생하지 않음
			 * 만약 위의 경우가 허용이 되면 Exception이 다 흡수해 버려서 문제가 된다. 즉, catch블럭을 만들 필요가 없는 경우가 생긴다.
			 */
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력한 데이터가 없습니다.");
			
		
		}catch(NumberFormatException e){
			System.out.println("숫자가 아닙니다.");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 순 없죠!!");
		}catch(Exception e) {
			System.out.println("다근 예외는 여기로~~");
		}
		System.out.println("프로그램 종료!!");
		
		
		
	}

}
