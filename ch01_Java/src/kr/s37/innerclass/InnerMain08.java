package kr.s37.innerclass;

interface MyInterface{
	public void make();
	//public void make2();
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
		System.out.println("-----------------");
		/*
		 * 람다식은 인터페이스를 구현한 익명 내부클래스를 객체 생성해서 사용하는데 표기 방식은
		 * (매개 변수, ...)->{처리 내용}
		 */
		
		//익명 객체를 람다식으로 변경
		MyInterface my2 = () ->{
			System.out.println("람다식으로 표시");
		};
		
		my2.make();
	}

}
