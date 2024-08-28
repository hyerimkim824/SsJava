package kr.s37.innerclass;
class Outer{
	int x = 100;
	
	//멤버 내부 클래스
	class Inner{
		int y =200;
	}
}


public class InnerMain01 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		//내부 클래스 객체 생성
		Outer.Inner oi = ot.new Inner();
		System.out.println("x = "+ot.x);
		System.out.println("y = "+oi.y);
		
		
	}

}
