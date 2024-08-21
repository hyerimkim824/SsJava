package kr.s15.object.util;
import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source ="100,200,300,400";
		StringTokenizer st =
				new StringTokenizer(source,",");//대상 문자열, 구분자 지정
		//처음 객체 생성할때 여러개의 구분자를 넣어서 생성할 수 있다.
		
		//잘려진 문자열이 있는지 검증
		while(st.hasMoreTokens()) {
			//잘려진 문자열 반환
			System.out.println(st.nextToken());
			
		}
		
		
		
		
		
	}


}
