package kr.s13.object.supertest;

//부모클래스
class People2{
	int a;
	//생성자
	public People2() {} //default 생성자를 명시
	public People2(int a) {
		this.a = a;
	}
}

//자식클래스
class Student2 extends People2{
	int b =200;
	
	public Student2() {
		super();
	}
	public Student2(int c) {
		super(c); //에러가 사라짐
	}
	
}
public class SuperMain03 {
	
	public static void main(String[] args) {
		
		Student2 st = new Student2();
		System.out.println(st.a);
		System.out.println(st.b);

}
}