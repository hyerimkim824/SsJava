package kr.s02.operator;

public class OperatorMain03 {
	public static void main(String[] args) {
		System.out.println("====비교(관계)연산자====");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a < b; //a와 b를 비교할 때 a가 자동적으로 double 데이터가 된다.
		System.out.println("a < b : " + result);
		
		result = a > b;
		System.out.println("a > b : " + result);
		
		result = a >= b;
		System.out.println("a >= b : " + result);
		
		result = a <= b;
		System.out.println("a <= b : " + result);
		
		result = a == b;
		System.out.println("a == b : " + result);
		
		result = a != b;
		System.out.println("a != b : " + result);
		
	}
}





