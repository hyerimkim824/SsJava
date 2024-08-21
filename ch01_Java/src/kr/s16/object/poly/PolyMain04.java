package kr.s16.object.poly;

class Car{
	public void drive() {
		System.out.println("주행");
		
	}
	public void stop() {
		System.out.println("멈춤");
	}
	public void getPower() {
		System.out.println("일반 자동차");
	}
}

class FireEngine extends Car{
	
	@Override
	public void getPower() {
		System.out.println("소방설비를 같춘 자동차!");
		
	}
	public void getWater() {
		System.out.println("water!!!!");
	}
	
}




public class PolyMain04 {
	
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.getWater();
		fe.getPower();
		
		System.out.println("---------------------------");
		
		Car c = fe; //업캐스팅 ,자식 클래스타입->부모클래스타입 형변환
		c.drive();
		c.stop();
		
		//호출 범위를 벗어나서 호출이 불가능
		//c.getWater();
		c.getPower(); //부모로 자료형을 바꾼다고 해도 호출 불가능
		//만약 자료형과 관계없이 부모 class의 method를 호출하고 싶다? -> super를 사용해야 한다.
		
		
		
		
	}
}
