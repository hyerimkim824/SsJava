package kr.s14.object.lang;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 =" aBa ";
		String s2 = "abc";
		int a = 100;
		String msg = null; //아직은 객체가 할당되지 않기 때문에 null로 초기화
		
		msg = s1.toUpperCase(); //대분자로 변환
		System.out.println("msg :"+ msg);
		
		msg = s1.toLowerCase();//소문자로 변환		
		System.out.println("msg :"+ msg);
		
		//old 문자를 new 문자 대체
		msg = s1.replace("aB", "b");
		System.out.println("msg :"+ msg);
		
		msg = s1.trim(); //앞뒤 공백 제거
		System.out.println("msg :"+ msg);
		
		//지정한 문자가 포함되어 있는지 검증
		boolean f = s1.contains("aB");
		System.out.println("f : "+f);
		
		//지정한 문자가 앞에 있는지 검증
		f = s2.startsWith("ab");
		System.out.println("f : "+f);
		
		//지정한 문자가 뒤에 있는지 검증
		f = s2.endsWith("bc");
		System.out.println("f : "+f);
		
		//int ->string
		
		msg = String.valueOf(a);
		msg = a+"";
		System.out.println("msg :"+ msg);
		
		}

}
