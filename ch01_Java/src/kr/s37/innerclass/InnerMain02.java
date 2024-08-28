package kr.s37.innerclass;

class Outer2{
	private int x =100;
	
	//멤버 내부 클래스
	class Inner2{
		private int y =200;
		//내부 클래스의 메서드에서 내부 클래스를 감싸고 있는 클래스이 멤버변수 호출 가능
		//같은 멤버로 보기 때문에 호출이 가능하다.
		public void make(){
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			
		}
	}
}

public class InnerMain02 {

}
