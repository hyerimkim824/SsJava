package kr.s31.iostream.input;
import java.io.IOException;


public class StandardInput {
	public static void main(String[] args) {
		//자바의 기본 입력
		try {
			System.out.print("영문자 1개 입력 : ");
			//문자 하나 입력 받아서 아스키 코드로 반환
			int a = System.in.read();
			System.out.println(a+", "+(char)a);
			
			System.in.read(); //enter 처리 \r 13
			System.in.read(); //enter 처리 \n 10
			
			System.out.println("----------------------");
			System.out.print("숫자 1개 입력 : ");
			int b = System.in.read() -48;
			
			
			
			System.out.println(b);
		}
		catch(IOException e) {e.printStackTrace();
	}
	}

}
