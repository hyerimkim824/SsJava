package kr.s37.innerclass;

class Outer3{
	//멤버 내부 클래스
	
	//Static 내부클래스는 내부 클래스를 감싸고 있는 클래스의 객체
	//생성 없이 바로 static 내부 클래스 객체 생성이 가능
	//static 내부 클래스
	static class StaticInner{
		int iv =200; //인스턴스 변수
		static int cv =300; //static 변수
		static void make() {
			System.out.println("하하 호호");
		}
		
	}
}

public class InnerMain05 {
	public static void main(String[] args) {
		Outer3.StaticInner i = new Outer3.StaticInner();
		
		System.out.println(i.iv);
		System.out.println(Outer3.StaticInner.cv);
		Outer3.StaticInner.make();
	}

}
