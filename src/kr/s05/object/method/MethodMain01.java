package kr.s05.object.method;

public class MethodMain01{
	
	//기본적인 메서드의 이해
	
	
	//반환하는 데이터가 있는 경우
	public int add(int a, int b) {
		return a+b;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		MethodMain01 method = new MethodMain01();
		int result = method.add(5, 8);
		System.out.println("result = "+result);
		
		method.print("오늘은 화요일");
		
		
	}
	

}
