package kr.s15.object.util;
import java.util.StringTokenizer;


public class StringTokenizerMain02 {
	
	public static void main(String[] args) {
		
		String source = "2024-08-21 12:12:40";
		StringTokenizer st =
				new StringTokenizer(source,"- :");// -, ,: 이 3가지를 인식
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("-------------------------");
		//원래 구분자는 데이터로 인식하지 않아서 출력 되지 않는다.
		                                      //대상문자열, 구분자, 구분자 출력 여부
		StringTokenizer st2 = new StringTokenizer(source,"- :",true); 
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}

}
