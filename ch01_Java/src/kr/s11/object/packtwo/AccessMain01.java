package kr.s11.object.packtwo;
import kr.s11.object.packone.People;

public class AccessMain01 {
	
	public static void main(String[] args) {
		People p = new People();
		//System.out.prinln(p.a); 같은 클래스가 아님

		//System.out.println(p.b); //default 같은 패키지에서 호출
		
		//System.out.prinln(p.c); //protected같은 패키지가 아니고 상속 관계도 아님
		
		//System.out.println(p.d);//public, 접근 제한이 없음
}
}
