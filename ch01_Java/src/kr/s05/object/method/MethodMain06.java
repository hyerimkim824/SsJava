package kr.s05.object.method;

class Tv{

	//멤버변수
	boolean power; //전원상태(on/off)
	int channel; //채널

	//멤버 메서드(동작)
	public void isPower() {
		power=!power; //true <-> false 바꾸기
	}

	public void channelUp() {//채널을 높이는 기능
		++channel;
	}

	public void channelDown() {//채널을 내리느 기능
		--channel;
	}
}


public class MethodMain06 {

	public static void main(String[] args) {

		//객체 선언 및 생성
		Tv t = new Tv();
		//Tv 켜기
		t.isPower();
		System.out.println("Tv 실행 여부 : "+ t.power);
		System.out.println("-----------------------");

		//채널 변경
		t.channel = 7;
		System.out.println("첫번째 변경된 채널 : "+ t.channel);
		System.out.println("-----------------------");

		//채널 변경
		t.channelDown();
		System.out.println("두번째 변경된 채널 : "+ t.channel);
		System.out.println("-----------------------");
		
		//Tv 끄기
		t.isPower();
		System.out.println("Tv 실행여부 : "+t.power);

	}


}
