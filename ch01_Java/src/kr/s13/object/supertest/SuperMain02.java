package kr.s13.object.supertest;


//부모클래스

class People{
	int a =100;
	
	public People() {
		super(); //Object의 default 생성자
	}
	
}

//자식 클래스
class Child extends People{
	int b =200;
	
	//생성자
	public Child() {
		super(); //부모클래스의 기본 생성자
	}
	
}


public class SuperMain02 {
	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
	}

}
