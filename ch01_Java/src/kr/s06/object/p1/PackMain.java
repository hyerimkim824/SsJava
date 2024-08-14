package kr.s06.object.p1;

import kr.s06.object.p2.PackTwo;



public class PackMain {
	
	public static void main(String[] args) {
		
	    //같은 패키지의 클래스를 호출 할 때는 패키지를 생략하고 클래스만 명시 가능
		//kr.s06.object.p1.PackOne p1 =	new kr.s06.object.p1.PackOne();
		
		PackOne p1 = new PackOne();
		
		//같은 패키지가 아닐 경우 패키지 생략 불가
		kr.s06.object.p2.PackTwo p2 = 
				new kr.s06.object.p2.PackTwo();
	
		//다른 패키지일 경우 import문을 이용해서 호출하고자 하는 클래스의 패키지를 등록하고
		//클래스명 기재하는 것이 가능
		
		PackTwo p3 = new PackTwo();
		
	}

}
