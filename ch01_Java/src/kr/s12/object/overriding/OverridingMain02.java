package kr.s12.object.overriding;

//부모클래스
class Mother {
	public String getLunch() {
		return "밥";
	}
}

//자식클래스
class Son extends Mother {

}

class Daugther extends Mother {
	// 메서드 재정의
	@Override
	// 어노테이션
	// 메서드 재정의 문법에 맞게 재정의가 되었는지를 검증,
	// 문법에 맞게 재정의되지 않으면 컴파일 오류가 발생
	public String getLunch() {// 형식 변경 x,접근지정자,데이터 타입,메서드 명(다르게 써도 에러 안남)
								// 인자타입 다 동일하게
		return "빵";// 부모에게서 상속받은 것과 다른 것 반환
	}
}

public class OverridingMain02 {

	public static void main(String[] args) {
	
		Son s = new Son();
		System.out.println("아들은 " + s.getLunch() + "을 먹는다");
		Daugther d = new Daugther();
		System.out.println("딸은 " + d.getLunch() + "을 먹는다");

	}

}
