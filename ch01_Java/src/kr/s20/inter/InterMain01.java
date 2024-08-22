package kr.s20.inter;


//interface는 객체 생성이 불가능 하다.
interface A1{
	
	//interface의 경우에는 상수의 형태를 가지기 위해서는 public static final의 형태
	//모두다 public static 상수

	public static final int W =10;
	int X =20; //변수처럼 보이지만 변경 안된다.
	static int Y =30;
	final int Z =40;
	
	
}





public class InterMain01 {
	
	public static void main(String[] args) {
		
		//인터페이스는 객체 생성 불가능
		//A1 = ap = new A1();
		//상수는 변겨 불가능
		//A1.X = 100;
		System.out.println("W = "+A1.W);
		System.out.println("X = " +A1.X);
		System.out.println("Y = "+A1.Y);
		System.out.println("Z = "+A1.Z);
		
		
		
	}

}
