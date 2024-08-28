package kr.s37.innerclass;

interface InterEx{
	public void input();
	
}

public class InnerMain07{
	public void make() {
	//인터페이스를 구현한 익명 내부클래스
	//객체생성 + 클래스 정의
		            //생성자 다음에 {}가 있으면 익명 내부 클래스 
	InterEx i = new InterEx() {
		@Override
		public void input() {
			System.out.println("익명 내부 클래스에서 구현된 input");
		}
	};
	i.input();
	}
	
	


	public static void main(String[] args) {
		InnerMain07 im = new InnerMain07();
		im.make();
		
	}

}
