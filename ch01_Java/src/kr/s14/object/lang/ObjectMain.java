package kr.s14.object.lang;

public class ObjectMain {
	public static void main(String[] args) {
		
		ObjectMain ob = new ObjectMain();
		System.out.println(ob.getClass());
		System.out.println(ob.getClass().getName());
		System.out.println(ob.hashCode());
		System.out.println(ob);//자동적으로 toString이 동작하면서 참조값 만들어 준다.
		System.out.println(ob.toString());
		
		//object method가 많은 것이 아니지만 항상 상속 받는다.
		//toString을 재정의하면 원하는 값이 출력된다.
		
	}

}


