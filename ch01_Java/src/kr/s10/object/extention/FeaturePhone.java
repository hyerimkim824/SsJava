package kr.s10.object.extention;

public class FeaturePhone extends Phone {
	
	private int pixel;
	
	public int getPixel() {
		return pixel;
	}
	
	//생성자
	public FeaturePhone(String number, String model, String color, int pixel) {
		
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;
		
	}
	}


