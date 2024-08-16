package kr.s06.object.consturctor;


//package가 같으면 동일한 이름의 class를 만들 수 없다.

class Car2{
	
	String color;
	String gearType;
	int door;
	
	public Car2() {}
	public Car2(String c, String g, int d) {
		
		color = c;
		gearType = g;
		door =d;
		
	}
}



public class ConstructorMain02 {
	
	public static void main(String[] args) {
		
		Car2 c1 = new Car2();//이렇게 쓰기 위해서는 기본 생성자(비어있는 생성자) 꼭 명시해야한다!!
		c1.color ="white";
		c1.gearType ="manucal";
		c1.door =4;
		
		System.out.println("c1의 color ="+c1.color+
				",gearType ="+c1.gearType+", door = "+c1.door);
		
		System.out.println("-----------------------------");
		Car2 c2 = new Car2("blue","auto",2);
		System.out.println("c2의 color ="+c2.color+
				",gearType ="+c2.gearType+", door = "+c2.door);
		
	}
	

}





