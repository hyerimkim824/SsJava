package kr.s18.object.abs;



//추상 클래스
abstract class AbsEx1{
	
	//문법적
	abstract public int getA(); //추상 메서드
	public abstract int getB(); //추상 메서드
	public void make() {
		System.out.println("AbsEx1의 make");
	}
}
//추상 클래스
abstract class AbsEx2 extends AbsEx1{
	
	
	//AbsEx1의 getA를 구현
	@Override
	public int getA() {
		return 10;
	}
	
	

	public String getMsg() {
		return "여름";
	}
	
	//public abstract String getMsg(); //추상 메서드
	
}

public class AbstractMain03 extends AbsEx2{
	
	//AbsEx1의 getB를 구현
		@Override
		public int getB() {
			return 20;
		}
		
		
		@Override
		public String getMsg() {
			return "여름";
		}
	
	

	public static void main(String[] args) {
		
		AbstractMain03 ab = new AbstractMain03();
		System.out.println(ab.getA());
		System.out.println(ab.getB());
		System.out.println(ab.getMsg());
		
	}
	

}
