package kr.s37.innerclass;

class Inner6{
	public void disp() {
		System.out.println("부모클래스의 disp");
		
	}
}


//클래스 이름이 없는 것을 익명 내부 클래스라고 한다.
public class InnerMain06 {
	
	public void make() {
		
		//익명 내부 클래스
		//클래스 정의 + 객체생성
		
		Inner6 i = new Inner6() {
			
			@Override
			public void disp() {
				System.out.println("자식클래스의 disp");
			}
		};
		i.disp();
	}
	
	
	public static void main(String[] args) {
		InnerMain06 im = new InnerMain06();
		im.make();
		
	}

}
