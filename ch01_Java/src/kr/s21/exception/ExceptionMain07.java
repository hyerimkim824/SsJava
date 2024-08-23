package kr.s21.exception;
import java.util.Scanner;

//사용자 정의 예외 클래스
class NegativeNumberUseException extends Exception{
	
	public NegativeNumberUseException(String str) {
		super(str);
	}
	
}



public class ExceptionMain07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0이상만 입력 : ");
		try {
			
			int a = input.nextInt();
			if(a>=0) {
				System.out.println("입력한 숫자 : "+a);
			}else {
				//사용자가 정의한 예외를 인위적으로 발생시킴
				throw new NegativeNumberUseException("음수를 사용할 수 없습니다.");
			}
		
			
		}catch(NegativeNumberUseException e) {//음수일 경우에는 다 이 예외로 보기 때문에
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("예외 발생");
		}finally {//자원 정리, 즉 input을 close
			if(input!=null) input.close();
		}
		

		
	}

}
