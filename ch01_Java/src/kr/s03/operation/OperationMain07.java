package kr.s03.operation;

public class OperationMain07 {

	public static void main(String[] args) {
		
		int a = 10;
		float b =10.0f;
		//만약 a,b를 연산을 하거나 비교를 한다며면 같은 데이터형으로
		
		if(a==b) {
			//a의 자료형이 int에서 float으로 자동 형변환
			System.out.println("10과 10.0f는 같다");
			}
		
		char c ='0'; //'0'의 아스키 코드 48
		int d = 0;
		if(c!=d) {//c : char->int로 형변환되어 48로 인식

			System.out.println("'0'과 0은 같지 않다.");
			
		char e ='A';//'A'의 아스키 코드 65
		int f = 65;
		
		if(e==f) {//e : char->int로 형변환 되어 65로 인식
			System.out.println("'A'는 65와 같다.");
		}
		
			
		}
	}

}
