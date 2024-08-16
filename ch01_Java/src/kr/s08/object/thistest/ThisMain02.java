package kr.s08.object.thistest;

class ThisTest{//소문자로 생성하면 class의 명명규칙에 위반된다. 컴파일에는 문제 없다.
	//은닉화
	private int a;
	//캡슐화
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	
	
	
	
}



public class ThisMain02 {
	
	public static void main(String[] args) {
		
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
		
	}
}
