package kr.s09.object.array;

public class Book {
	
	
	//은닉화를 했으니 반드시 캡슐화
	private String category;
	private String name;
	private int price;
	private double discount;

	//Getter&Setter
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	//생성자
	public Book() {}
	public Book(String category, String name, int price, double discount) {
		
		this.category = category;
		this.name = name;
		this.price = price;
		this.discount=discount;
	}

}
