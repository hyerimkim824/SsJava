package kr.s16.object.poly;

//부모 클래스
class Car2{

	String color;
	int door;
	public void drive() {
		System.out.println("운전");
	}
	
	public void stop() {
		System.out.println("정지");
	}
}

class FireEngine2 extends Car2{
	public void water() {
		System.out.println("water~");
	}
}

public class PolyMain07 {
	public static void main(String[] args) {
		
		FireEngine2 fe = new FireEngine2();
		
		//대상 객체          자료형  
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine2 instance");
			
		}
		if(fe instanceof Car2) { //부모 타입을 사용할 수 잇따.
			System.out.println("This is a Car2 instance");
			
		}if(fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
	}

}
