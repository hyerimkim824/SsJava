package kr.s07.object.statictest;

public class StaticMain02 {
	
	
		//인스턴스 변수
		int a;
		static String s;
	    public static void main(String[] args) {
		
		
		//인스턴스 변수는 객체 생성 후에 사용
		//a = 10;
		
		StaticMain02 sm = new StaticMain02();
		System.out.println();
		
		//static 변수는 호출하면 메모리에 만들어짐
		s ="서울";
		System.out.println(s);
					
	}

}
