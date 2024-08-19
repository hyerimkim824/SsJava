package kr.s12.object.overriding;

//부모클래스(형식은 그대로 두면서 안에 있는 내용을 바꿔서 호출하려고-자식 클래스에서 *재정의*)
class GrandParent {
	public String getCar() {
		return "구형 자동차";// 원형-변경 불가능
	}
}

//자식클래스(1개만 있는 것이 아니라 부모클래스에서 변경 불가능, 해당 자식클래스에서 변경 가능)
class Father extends GrandParent {
	// Method Overriding(메서드 재정의)
	// 상속관계에서 자식클래스에 메서드 재정의를 하면 부모클래스의
	// 메서드가 호출되는 것이 아니라 자식클래스의 메서드가 호출
	public String getCar() {// 데이터타입, 메서드 등 부모 클래스와 일치 해야함
		return "신형 자동차";// 신형-변경 가능
	}
}

class Uncle extends GrandParent {

}

public class OverridingMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father ft = new Father();
		System.out.println("아버지는 " + ft.getCar() + "를 좋아합니다.");
		Uncle uc = new Uncle();
		System.out.println("삼촌은 " + uc.getCar() + "를 좋아합니다.");

	}

}
