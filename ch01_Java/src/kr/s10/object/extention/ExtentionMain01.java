package kr.s10.object.extention;

//부모 클래스
class Parent extends Object{//자동으로 Object 상속, 기본적으로 생략
	int a =100;
}
//자식 클래스
class Child extends Parent{
	int b =200;
}

public class ExtentionMain01 {
	
	public static void main(String[] args) {
		
		Child ch = new Child();
		Parent pt = new Parent();
		System.out.println(ch);
		System.out.println(pt);
		System.out.println(ch.a);
	}

}
