package kr.s08.object.thistest;

public class ThisMain04 {
	/*
	 * 생성자 내부에서 또다른 생성자를 호출할 때 this()를 표시함.
	 * 생성자 내부에 반복적인 코드가 있어서 반복적인 코드를 제거하고 
	 * 코드를 재사용하고자 할 때 사용
      */
	
	//생성자1
	public ThisMain04() {
		this("바람");
	}

	//생성자2
	public ThisMain04(int a) {
		this(String.valueOf(a)); 
		System.out.println("-------------");//이 문장이 상위에 올라가면 안된다.
	}
	
	//생성자3
	public ThisMain04(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ThisMain04 tm1 = new ThisMain04();
		ThisMain04 tm2 = new ThisMain04(1234); //1234->"1234"
		ThisMain04 tm3 = new ThisMain04("강남");
		
		
		//git test /
		
	}

}
