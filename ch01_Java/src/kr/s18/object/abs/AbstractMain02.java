package kr.s18.object.abs;

abstract class A2{
	private int x;
	
	//구현이 완벽하게 되어 있지 않는 메서드
	//일반적으로 추상 클래스를 만들면 추상 메서드를 하나 만든다.
	//추상 클래스를 만드는 목적은 추상 메서드를 만들기 위해서다.
	public abstract void make(); //추상 메서드 : 메서드 안에 내용이 없다.
	
	public void setS(int x) {
		this.x = x;
	}
}

//자식클래스

class B2 extends A2{
	@Override
	public void make() {
		System.out.println("자식클래스의 make");
		
	}
	
}



public class AbstractMain02 {
	public static void main(String[] args) {
	
}

}
