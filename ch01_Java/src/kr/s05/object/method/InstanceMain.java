package kr.s05.object.method;

public class InstanceMain {

	//클래스의 기본 구조
	//멤버 필드
	int var1;
	String var;
	
	//생성자, 생략 가능하며 생략하면 컴파일시 자동 생성
	public InstanceMain(){}
	
	//멤버 매서드
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		//객체 선언 및 생성
		InstanceMain me = new InstanceMain();
		System.out.println("me : "+me);
		
		int result = me.sum(15,20);
		System.out.println("result ="+result);
		

	}

}
