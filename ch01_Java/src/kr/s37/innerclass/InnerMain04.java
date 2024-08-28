package kr.s37.innerclass;

public class InnerMain04 {
	int a =100; //멤버변수

	public void innerTest() {

		int b = 200; //지역 변수
		
		//로컬 내부 클래스
		class Inner{
			
			public void getData() {
				
				a = 10; //멤버 변수 변경 가능
				//로컬 내부 클래스에서 로컬 내부클래스를 감싸고있는 메서드의 지역변수를 호출하면 상수화됨
				//(호출은 가능한데 변경은 할 수 없음)
				
			    //b =20;
				
				System.out.println("a = "+a);
				System.out.println("b = "+b);
			}//end of getData
		}//end of inner class
		Inner i = new Inner();
		i.getData();
	}


	public static void main(String[] args) {
		
		InnerMain04 im = new InnerMain04();
		
		
	}

}
