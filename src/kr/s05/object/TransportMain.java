package kr.s05.object;

class Car{
	
	//멤버 필드
	String company = "현대 자동차";
	String model ="그랜저";
	String color ="검정";
	int maxSpeed = 350;
	int speed =90;
	
}

public class TransportMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car car = new Car();
		
		//객체의 멤버 변수 읽기
		System.out.println("제작회사 : "+car.company);
		System.out.println("모델명 : "+car.model);
		System.out.println("색깔 : "+ car.color);
		System.out.println("최고속도 : "+car.maxSpeed);
		System.out.println("현재속도 : "+car.speed);
		
		//필드값 변경
		car.speed = 60;
		System.out.println("수정된 속도 : "+car.speed);
	}

}
