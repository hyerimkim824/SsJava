package kr.s08.object.thistest;


public class LocalVariable {
	
	//멤버변수 : 클래스 블럭 내에서 정의된 변수
	
	int b = 200;
	
	public void make() {
		
		//지역변수 : 메서드,생성자,제어문 블럭 내에서 생성된 변수
		//		 해당 블럭이 종료되면 변수는 소멸함
		
		int a = 100;
		System.out.println("지역변수 a :"+a);
		System.out.println("멤버변수 b :" +b);
		
	}
	
	public void fun() {
		//System.out.prinln("b : "+b);
	}
	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {
			System.out.print(i+"\t");
		}
		
		//제어문 블럭 안에서 생성된 변수는 제어문입 종료되면 소멸
		//System.out.prinln(i)
		System.out.println();
		int a;
		
		for(a=1;a<=5;a++) {
			
			System.out.print(a+"\t");
			
		}
		
		System.out.println();
		System.out.println(a);
		
	}
		
	}


