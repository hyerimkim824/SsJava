package kr.s06.object.consturctor;

class Car{

	String color; //색상
	String gearType; //변속기 종류 -auto(자동), manual(수동)
	int door; //문의 개수
	
	//기본 생성자 (생략 가능)
	public Car() {};
}


public class ConstructorMain01 {
	public static void main(String[] args) {
		//객체 생성시 생성자는 처음에 한 번만 실행되고 객체 생성
		//이후에는 호출 불가능
		//생성자는 멤버변수를 초기화 하는 역할 수행
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType ="auto";
		c1.door =4;
		System.out.println("c1의 color = "+c1.color+", gearType ="+c1.gearType
				+", door = "+c1.door);
		
		System.out.println("---------------------");
		Car c2 = new Car();
		c2.color = "red";
		c2.gearType = "manual";
		c2.door = 5;
		System.out.println("c2의 color = "+c2.color+", gearType ="+c2.gearType
				+", door = "+c2.door);
		
		
	}

}
