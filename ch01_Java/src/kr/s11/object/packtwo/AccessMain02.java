package kr.s11.object.packtwo;
import kr.s11.object.packone.People;

public class AccessMain02 extends People{
	
	public static void main(String[] args) {
		
		AccessMain02 am = new AccessMain02();
		
		//System.out.println(am.a); //private, 같은 클래스가 아님
		//System.out.println(am.b)); //default, 같은 패키지가 아님
		
		System.out.println(am.c); //같은 패키지는 아니지만 상속관계
		
		System.out.println();
	}

}
