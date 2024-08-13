package kr.s05.object;

public class Driver {
	
	//멤버 필드(속성)
	//객체의 구성원이 될 요소들은 class영역에 만든다.
	String name;
	String job;
	String address;
	
	//class만 생성할 수 있지만 main이 없다. 즉, main을 넣고 driver 객체를 생성해야한다.
	
	public static void main(String[] args) {
		//객체 선언
		Driver d;
		
		//객체 생성
		d = new Driver();
		
		//객체의 멤버 변수에 값 할당
		d.name  = "박문수";
		d.job = "운전기사";
		d.address = "서울";
		
		//객체의 멤버 변수에 저장된 값 출력
		System.out.println("이름 : "+d.name);
		System.out.println("직업 : "+d.job);
		System.out.println("주소 : "+d.address);
		
	}

}
