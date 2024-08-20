package kr.s14.object.lang;

public class WrapperMain {
	public static void main(String[] args) {
		//Wrapper 클래스
		
		boolean b =true;
		
		//기본 자료형 데이터 ->참조 자료형 데이터
		Boolean wrap_b = new Boolean(b);
		
		boolean b2 = wrap_b.booleanValue();
		System.out.println(b2);
		System.out.println("-----------------");
		
		//기본자료형 데이터 -> 참조 자료형 데이터(boxing)
		Integer obj1 = 10; //객체가 생성 된거다.
		Integer obj2 = 20;
		
		int result2 = obj1+obj2;
		System.out.println("result = "+result2);
		
	}

}
