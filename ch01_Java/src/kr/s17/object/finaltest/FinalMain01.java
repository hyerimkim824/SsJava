package kr.s17.object.finaltest;


class A{
	
	//멤버필드
	//지정한 겂은 변경 불가능, 즉 초기화는 가능하지만 그 이후에는 바꿀 수 없음
	final int NUM = 10;
	
	//static 상수
	public static final int NUMBER = 20;
	
	
}

public class FinalMain01 {
	public static void main(String[] args) {
		
		//System.out.println(NUM); NUM이라는 것은 객체를 생성해야 호출 할 수 있음
		A ap = new A();
		//ap.NUM = 20;
		System.out.println(ap.NUM);
		System.out.println("------------------");
		
		//Static 상수
		System.out.println(A.NUMBER);
		
		final int NO =30;
		System.out.println((NO));
		
		
		
		
	}

}
