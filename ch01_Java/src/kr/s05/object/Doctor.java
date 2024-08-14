package kr.s05.object;


public class Doctor {
	//멤버 필드(속성)
	String name;  //멤버변수
	String job ;  //
	
	public static void main(String[] args) {
		
		//객체 선언
		Doctor d;
		//객체 생성
		d= new Doctor();
		
		//객체의 멤버 변수에 값 할당
		d.name = "홍길동";
		d.job = "의사";
		
		//객체의 멤버 변수의 값 출력
		System.out.println(d.name);
		System.out.println(d.job);
		
	}

}
