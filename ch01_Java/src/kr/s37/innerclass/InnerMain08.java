package kr.s37.innerclass;

interface MyInterface{
	public void make();
}

public class InnerMain08 {
	public static void main(String[] args) {
		//인터페이스를 구현한 익명 내부 클래스
		//객체 생성 + 클래스 정의
		
		MyInterface my = new MyInterface() {
			@Override
			public void make() {
				System.out.println("익명 내부클래스의 make");
			}
		};
		my.make();
	}

}
