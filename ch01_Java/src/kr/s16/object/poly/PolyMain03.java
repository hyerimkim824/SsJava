package kr.s16.object.poly;



class Parent2{
	public void make() {
		System.out.println("부모클래스의 make");
	}
}

class Child2 extends Parent2{
	
	//부모클래스의 메서드 재정의
	@Override
	public void make() {
		System.out.println("자식클래스의 make");
		
	}
}

public class PolyMain03 {
	
	public static void main(String[] args) {
		
		Child2 ch = new Child2();
		ch.make();
		
		System.out.println("------------------------------");
		
		Parent2 p = ch;//자식 클래스 타입->부모 클래스 타입 형변환
					   //업캐스팅, 자동적으로 형변환
		p.make();
		
	}

}
