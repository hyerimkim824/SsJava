package kr.s08.object.thistest;

public class ThisMain01 {
	
	
	//생성자
	public ThisMain01() {
		System.out.println("객체 생성 : "+this);
		
	}
	
	public static void main(String[] args) {
		
		ThisMain01 tt = new ThisMain01();
		System.out.println("객체 생성 후 : "+tt);
		
	}

}
