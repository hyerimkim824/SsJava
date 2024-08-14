package kr.s05.object.method;


class Capsule{
	//접근 지정자 private : 같은 클래스에서 호출 가능하지만 다른 클래스에서는 호출 불가능
	//은닉화
	private int a;
	
	//캡슐화
	public void setA(int n) {
		
		//데이터 검증을 하기 위해서
		if(n>0) {
			a=n;
		}else {
			System.out.println("음수는 허용되지 않습니다.");
		}
		
	}
		
		public void setQuestionA(double n) {
			
			//데이터 검증을 하기 위해서
			if(n>0) {
				a=(int)n;
			}else {
				System.out.println("음수는 허용되지 않습니다.");
			}
		
	}
	
	public int getA() {
		return a;
	}

	//Quetion
	public float getQuestionA() {
		
		return (float)a;
	}
	
	
	

}


public class MethodMainCapsule {
	
	public static void main(String[] args) {
		//변수 a의 접느 지정자가 private이기 때문에 같은 클래스에서는 호출이 가능하지만
		//다른 클래스에서는 호출 불가능
		//cap.a = 10
		
		Capsule cap = new Capsule();
		
		cap.setQuestionA(10.0);
		System.out.println(cap.getQuestionA());
		System.out.println(cap.getQuestionA());
		
		cap.setA(-100);
		System.out.println(cap.getA());
		
		
	}

}
