package kr.s05.object.method;

public class MethodMain02 {
	
	/*
	 * [실습]
	 * 입력한 int형 정수값이 음수이면 -1 반환. 0이면 0을 반환, 양수이면 1을 반환하는
	 * signOf 메서드를 작성하시오.
	
	 */
	public int signOf(int x) {
		
		if(x>0){return 1;}
		else if(x<0) {return -1;} 
		else {return x;}
	}
	
	/*
	 * 참고 code
	 * 
	 * return을 1번만 사용하려면 int x값을 초기화 해줘야 한다.
	 * 
	 */
	
	public static void main(String[] args) {
		
		MethodMain02 me = new MethodMain02();//객체 생성
		
		
		//input 받기
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		//입력 정수
		System.out.print("입력한 정수 : ");
		int num = input.nextInt();
		
		//출력 정수
		System.out.print("출력값 : ");
		System.out.println(me.signOf(num));
		
		input.close();
	}

}
