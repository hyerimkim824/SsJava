package kr.s18.object.abs;

//부모 클래스
abstract class Animal{
	public void breathe() {
		System.out.println("숨을 쉬다");
		
	}
	
	public abstract void sound(); //추상 메서드
	//sound를 의무적으로 구현하는데 기본값은 없도록!!

	
}
//자식 클래스1 
class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("개는 멍멍멍~~~~~~");
	}
}
//자식 클래스2
class Cat  extends Animal{
	
	@Override
	public void sound() {
		System.out.println("고양이는 야옹!!");
	}
}


public class AnimalMain {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breathe();
		d.sound();
		System.out.println("------------------------");
		
		Cat c = new Cat();
		c.breathe();
		c.sound();
	}

}
