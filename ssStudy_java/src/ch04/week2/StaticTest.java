package ch04.week2;

//This question is number5 question of practice 4th
class Circle{
	private int radius;
	//constructor
	public Circle(int radius) {this.radius = radius;}
	
	//get method, set method
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius = radius;}

}

class CircleManager{
	
	//use static method to copy src reference value to dest
	//if we use this method two referecce valule would be same
	public static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	
	public static boolean equals(Circle a, Circle b) {
		if(a.getRadius()==b.getRadius()) { return true;
	}else {return false;}
	
}
	}

public class StaticTest {
	
	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("pizza 와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle의 크기 다름");
		
		CircleManager.copy(pizza,waffle);
		
		res =  CircleManager.equals(pizza, waffle);
	
		
		if(res==true)
			System.out.println("pizza 와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle의 크기 다름");
		

}
}
