package kr.s16.object.poly;

//부모 클래스

class Parent{
	int a =100;
	
}

class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		
		Parent p = ch; //자식클래스 타입-> 부모 클래스타입 형변환
					   //업캐스팅, 자동적으로 형변환
		System.out.println(p.a);
		//System.out.println(p.b); //자료형이 부모타입이 되었을 때는 부를 수 없다.
		
		
		Child ch2 =(Child)p;//부모 클래스 타입->자식 클래스 타입 형변환
		                    //다운캐스팅, 명시적으로 형변환
		
		System.out.println(ch2.a);
		
	}
}
