package kr.s07.object.statictest;


class StaticMethod {
	
	String s1 = "여름";
	static String s2 = "겨울";

	public static String getString()
	{
		return s2;
	}

}

public class StaticMain03 {
	
	
	public static void main(String[] args) {
		
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.s1);
		
		//Static 변수는 클래스명.변수명의 형태로 호출가능 
		System.out.println(StaticMethod.s2);
		
		
		//Static 메서드는 클래식명.메서드명의 형태로 호출 가능
		System.out.println(StaticMethod.getString());
		
		
	}
		
	}
	
	


