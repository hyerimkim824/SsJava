package kr.s05.object.method;

public class MethodMainArg03 {
	
	
	/*
	 * Variable Arguments
	 * 자료형이 일치할 때 전달하고자 하는 값의 개수를 다르게 지정할 수 있음.
	 * 전달되는 데이터는 내부적으로 배열로 인식함
	 */
	
	/*public void argTest(int ...n) {
		
		for(int i=0; i<n.length; i++) {
			
			System.out.println("n["+i+"]:"+n[i]);
		}*/
	public void argTest(int ...n) {

		System.out.println(n.length);
		}


	
	
	public static void main(String[] args) {
		
		MethodMainArg03 me = new MethodMainArg03();
		
		
		me.argTest();//비어있는 배열이 생성된다. length가 0이다.
		System.out.println("----------------");
		me.argTest(10);
		
		System.out.println("----------------");
		me.argTest(10,20);
		
		System.out.println("----------------");
		me.argTest(10,20,30);
	
		
	}


}
