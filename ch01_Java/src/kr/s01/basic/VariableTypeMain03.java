package kr.s01.basic;

public class VariableTypeMain03 {
	public static void main(String[] args) {
		System.out.println("====묵시적 형변환(자동 형변환)======");
		//더 큰 자료형으로 승격이 일어나는 형태, 정보의 손실이 전혀 업으며 자동적으로 발생
		byte b1 = 127;
		byte b2 = 127;
		
		int result1 = b1 +b2; //32bit 미만의 자료형 데이터를 연산하면 자료형이 32bit(int)로 변환됨
		System.out.println(result1);
		
		short s1 = 32767;
		short s2 = 32767;
		
		int result2 = s1+s2; //32bit미만의 자료형 데이터를 연산하면 자료형이 32bit(int)로 변환됨
		System.out.println(result2);
		
		int in1 = 1234;
		long lg1 = 5678L;
		long result3 = in1 +lg1; //in1 : int -> long 자동 형변환
		System.out.println(result3);
		
		int in2 =1234;
		double du2 = 345.567;
		double result4 = in2+du2;//in2 : int -> double 자동 형변환
		System.out.println(result4);
		
		int in3 = 123;
		long lg3 = 567L;
		int result5 = in3 +(int)lg3; //long->int 강제 형변환
		System.out.println(result5);
		

		
		//
		
		
	}

}
