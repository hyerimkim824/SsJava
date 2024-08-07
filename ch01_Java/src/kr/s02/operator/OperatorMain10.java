package kr.s02.operator;

public class OperatorMain10 {

	public static void main(String[] args) {
		
		int a =5, b=10;
		
		//최대값과 최소값을 저장하는 변수를 선언
		
		int max;
		int min;
		
		//최대값 구하기
		max = a>b? a:b;
		
		System.out.println("max = " + max);
		min = a<b? a:b;
		System.out.println("min = " + min);	

	}

}
