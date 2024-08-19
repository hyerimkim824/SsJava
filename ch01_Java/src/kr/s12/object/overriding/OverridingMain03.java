package kr.s12.object.overriding;

//부모클래스
class People {

	// Method Overriding
	@Override
	public String toString() {
		return "people";

	}

}

class Animal {

}

public class OverridingMain03 {

	public static void main(String[] args) {

		People p = new People();
		System.out.println(p.toString());

		Animal a = new Animal();

		// Object로부터 상속도니 toString 호출
		System.out.println(a.toString());

		System.out.println(a);

	}

}
