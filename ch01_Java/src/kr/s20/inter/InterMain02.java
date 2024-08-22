package kr.s20.inter;


interface A2{
	
	//추상 메서드
	public abstract void make(); //원형
	void play();
	
	
	
}

//일반 클래스에 인터페이스의 추상 메서드 구현
class B2 implements A2{
	
	@Override
	public void make() {
		System.out.println("B2의 make");
	}
	
	@Override
	public void play() {
		System.out.println("B2의 play");
	}
	
}
public class InterMain02 {
	
	public static void main(String[] args) {
		
		B2 bp = new B2();
		bp.make();
		bp.play();
		
	}
}
