package kr.s05.object.method;

public class OverloadingMain02 {
	
	//전달되는 인자의 타입을 모두 String으로 변환해서 문자열의 길이를 구하는 메서드 만들기
	public void getLength(int n) {
		String s = String.valueOf(n);//int->String
		System.out.println(s.length());
	}
	
	public void getLength(float n) {
		String s = String.valueOf(n); //float ->String
		System.out.println(s+"의 길이 :"+s.length());
		
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000); //10000->"10000"
		om.getLength(3.14f); //3.14f->"3.14" 주의: 여기서 f는 float데이터를 의미한다 따라서 문자열 인식과는 전혀 관계 없음
		
	}
}
