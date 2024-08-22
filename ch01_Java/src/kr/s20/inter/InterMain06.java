package kr.s20.inter;

interface Inter1{
	
	public int getA();
	
}

interface Inter2{
	public int getB();
}

//인터페이스 상속
interface Inter3 extends Inter1, Inter2{
	//Inter3에 Inter1,Inter2가 있는것처럼 인식
	public int getData();

	
}
interface Inter4{
	public int getC();
}


//클래스에 인터페이스를 다중 구현
public class InterMain06 implements Inter3,Inter4 {
	@Override
	public int getA() {
		return 10;
	}
	
	@Override
	public int getB() {
		return 20;
	}
	
	@Override
	public int getC() {
		return 30;
	}
	
	@Override
	public int getData() {
		return 40;
	}
	
	

	public static void main(String[] args) {
		
		InterMain06 im = new InterMain06();
		System.out.println(im.getA());
		System.out.println(im.getB());
		System.out.println(im.getC());
		System.out.println(im.getData());
		
		
		
		
	}
}
