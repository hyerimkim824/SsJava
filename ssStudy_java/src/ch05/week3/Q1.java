package ch05.week3;

class Circle{
	private int radius;
	public Circle(int radius) {this.radius=radius;}
	public int getRadius() {return radius;}
}

class NamedCircle extends Circle{
	
	private String food;
	public NamedCircle(int radius,String food ) {
		super(radius);
		this.food = food;
	}
	
	public void show(){
		System.out.println(food+", 반지름 = "+getRadius());
	}
	
}

public class Q1 {
	
	public static void main(String[] args) {
		
		NamedCircle w = new NamedCircle(5,"waffle");
		w.show();
		
	}

}
