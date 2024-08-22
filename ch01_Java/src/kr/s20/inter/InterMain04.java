package kr.s20.inter;

interface InterP{
	public abstract void make(); //추상 메서드
}

//일반 클래스에 인터페이스 구현
class Child implements InterP{
	
	//InterP의 make 메서드 구현
	@Override
	public void make() {
		System.out.println("make 메서드");
	}
	

	public void play() {
		System.out.println("play 메서드");
		
	}
}

public class InterMain04 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.make();
		ch.play();
		
		InterP i = ch; //클래스 타입->인터페이스 타입 형변환
		               //자동적으로 형변환
		
		i.make();
		//i.play(); //호출이 안된다.->호출 범위를 벗어나 호출 불가
		Child ch2 = (Child)i; //인터페이스타입->클래스타입 형변환
		                      //명시적 형변환
		
		ch2.make();
		ch2.play();
		
		
	}

}
