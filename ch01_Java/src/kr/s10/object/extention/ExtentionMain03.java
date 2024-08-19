package kr.s10.object.extention;

//부모 클래스

class A{
	int x =100;
	private int y = 200;
	//은닉화-> 대리인 필요(public method를 만들어 준다!)
	public int getY() {
		return y;
	}
}
class B extends A{
	int z =300;
}


public class ExtentionMain03 {
	public static void main(String[] args) {
		
		B bp = new B();
		System.out.println(bp.x);
		//System.out.prinln(bp.y); //private때문에 호출이 안된다.
		//private 멤버변수는 다른 클래스에서 호출 불가능
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
	

}
