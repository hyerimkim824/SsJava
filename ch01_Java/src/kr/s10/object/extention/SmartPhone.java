package kr.s10.object.extention;

public class SmartPhone extends Phone{
	//전화 기능은 Phone class에서 상속 받느다.
	private String os;
	
	//생성자
	public SmartPhone(String number, String model, String color, String os) {
		
		//number, model, color가 마치 이 class에 원래 있었던 것 처럼
		
		this.number = number;
		this.model = model;
		this.color = color;
		this.os = os;
	}
		
	
	public String getOs() {
		return os;
	}
	

}
