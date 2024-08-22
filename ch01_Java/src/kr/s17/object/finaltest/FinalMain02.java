package kr.s17.object.finaltest;

class Me{
	public final void make() {
		System.out.println("부모클래스의 make");
	}
}

//자식 클래스




public class FinalMain02 extends Me{
	
	/*@Override
	public void make() {
		System.out.println("자식 클래스의 make");*/
	
	
	public static void main(String[] args) {
		FinalMain02 fm = new FinalMain02();
		fm.make();
	}

	
	
	}


