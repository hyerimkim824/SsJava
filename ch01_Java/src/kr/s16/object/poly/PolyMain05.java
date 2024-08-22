package kr.s16.object.poly;


//제품이 늘어날 때 product를 상속받으면 된다.

class Product{
	int price; //제품의 가격
	int bonusPoint; //제품 구매시 제공하는 보너스 점수

	//생성자
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10; //보너스 점수는 제품가격의 10%
	}
	public String getName() {
		return "상품";
	}

}


class Tv extends Product{

	public Tv() { 
		//부모 클래스이 인자가 있는 생성자를 호출
		super(100);//Tv 가격 설정

	}
	@Override
	public String getName() {
		return "Tv";
	}


}



class Computer extends Product{

	public Computer(){ 
		//부모 클래스이 인자가 있는 생성자를 호출
		super(200);//computer 가격 설정
	}

	@Override
	public String getName() {
		return "Computer";
	}
}

class Audio extends Product{
	
	public Audio(){ 
		//부모 클래스이 인자가 있는 생성자를 호출
		super(300);//computer 가격 설정
	}

	@Override
	public String getName() {
		return "Audio";
	}
}


class Buyer{
	int money = 1000; //구매자 보유 금액
	int bonusPoint = 0; //상품 구매 보너스 포인트

	//상품 구매하기
	//type을 부모 타입으로
	//부모 영역으로 호출되어서 문제가 생기는데 자식 개체에 override를 해서
	public void buy(Product p) { //객체형 변수

		if(money <p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
	}
		//상품 구매 가능
		money-=p.price;//보유 금액 차감
		bonusPoint +=p.bonusPoint; //보너스 점수 누적
		System.out.println(p.getName()+"을 구매 했습니다.");
		System.out.println("현재 남은 돈은 "+money+"만원입니다.");
		System.out.println("현재 보너스점수는 " + bonusPoint+"점입니다.");
		
		System.out.println("------------------------");
		
		
	}

}



public class PolyMain05 {
	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio a = new Audio();
		
		//상품 구매하기
		b.buy(tv);// Tv->Product 자동적으로 형변환
		b.buy(com); //Computer -> Product 자동적으로 형변환
		b.buy(a);
		
		//공통의 자료형을 사용하고 싶을 때 부모 타입으로 형변환해서
		//클래스는 자료형이 무한대다.
		//형변환 하는 것은 상속 관계에서만 가능하다.
		

	}
}


