package kr.s08.object.thistest;

public class Animal {
	/* [실습]
	 * Animal
	 * 멤버 변수 : private - 이름(name),나이(age),비행여부(fly(boolean type))
	 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
	 * 멤버 메서드 : public - set/get 메서드*/
	
	private String name;
	private int age;
	private boolean fly;
	
	//인자 없는 생성자
	public Animal(){}
	
	//인자가 있는 생성자
	public Animal(String n, int a, boolean f) {
		name =n;
		age = a;
		fly = f;
	}
	
	private static String printFly(boolean fly) {
		return fly ? "가능 " : "불가능" ;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	
	

}
