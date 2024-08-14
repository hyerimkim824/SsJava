package kr.s02.operator;

public class OperatorMain01 {
	public static void main(String[] args) {
		
		System.out.println("====증감 연산자====");
		
		//증가 연산자
		int i = 5;
		
		//증가 연산자를 변수명 앞에 명시하면 변수값을 1 증가시킨 후 증가된 값을 읽어옴
		System.out.println(++i);
		System.out.println("-------------------");
		
		//증가연산자를 변수명 뒤에 명시하면 변수값을 먼저 읽어 온 후 메모리의 변수값을 1 증가시킴
		//증가된 값을 보기 위해서는 한 번 더 호출해야 함
		System.out.println(i++); //6 증가가 안되었음, 메모리 공간에는 data가 7이 들어가있음, 뒤늦게 메모리 공간에 반영됨
		System.out.println(i);//7
		System.out.println("===================");
		//감소 연산자
		int j =10;
		System.out.println(--j);
		System.out.println("-------------------");
		System.out.println(j--);
		System.out.println(j);
	}

}
