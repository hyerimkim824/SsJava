package kr.s05.object.method;

public class MethodMainArg01 {
	
	//인자 전달 방식 : 값 호출(Call by Value)
	//기본 자료형의 값을 인자로 전달하는 방식. 값을 복사하여 전달
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		
		int var1 = 100;
		MethodMainArg01 me = new MethodMainArg01();
		int var2 = me.increase(var1);
		
		System.out.println("var1 = "+var1+", var2 = "+var2);
	}
}
