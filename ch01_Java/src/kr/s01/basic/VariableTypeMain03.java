package kr.s01.basic;

public class VariableTypeMain03 {
	public static void main(String[] args) {
		System.out.println("====묵시적 형변환(자동 형변환)====");
		//더 큰 자료형으로 승격이 일어나는 형태, 정보의 손실이 전혀 
		//없으며 자동적으로 발생
		byte b1 = 127;
		byte b2 = 127;
		int result1 = b1 + b2;//32bit미만의 자료형 데이터를 연산
		                      //하면 자료형이 32bit(int)로 변환됨
		System.out.println(result1);
		
		short s1 = 32767;
		short s2 = 32767;
		int result2 = s1 + s2;//32bit미만의 자료형 데이터를 연산
		                      //하면 자료형이 32bit(int)로 변환됨
		System.out.println(result2);
		
		int in1 = 1234;
		long lg1 = 5678L;
		long result3 = in1 + lg1;//in1 : int -> long 자동 형변환
		System.out.println(result3);
		
		int in2 = 1234;
		double du2 = 345.567;
		double result4 = in2 + du2;//in2 : int -> double 자동 형변환
		System.out.println(result4);
		
		//대입연산자 사용시 자동적으로 형변환
		int in3 = 567;
		float ft3 = 123.567f;
		in3 += ft3; 
		System.out.println("in3 += ft3 : " + in3);
		
		//산술연산자 사용시 명시적으로 형변환
		int in4 = 567;
		float ft4 = 123.567f;
		int result5 = in4 + (int)ft4;
		System.out.println("result5 = " + result5);
	}
}





