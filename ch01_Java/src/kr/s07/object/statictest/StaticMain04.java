package kr.s07.object.statictest;

public class StaticMain04 {
	
	//인스턴스 변수
	int a;
	
	//인스턴스 메서드
	public void method1() {
		System.out.println(a +", method1");
	}
	
	//static 변수
	static int b;
	
	public static void method2() {
		System.out.println(b+", method2");
		
	}
	
	public StaticMain04() {
		System.out.println("생성자 시작--------------");
		a =10;
		System.out.println(a);
		
	}
	
	//static 블럭
	static {
		System.out.println("static 블럭 시작---------");
		//객체 생성 후 호출 해야함
		//a=50; //인스턴스 변수
		//method1()//인스턴스 method1();
		b=20;
		method2();
	}
	
	public static void main(String[] args) {
		StaticMain04 s = new StaticMain04();
		s.method1();
		//System.out.println("main 메서드 입니다.");

	}
	
	
	
}
