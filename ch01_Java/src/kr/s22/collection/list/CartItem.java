package kr.s22.collection.list;

public class CartItem {
	
	private String code;
	private int num;
	private int price;
	
	public CartItem() {}
	
	public CartItem(String code, int num, int price) {
		this.code = code;
		this.num = num;
		this.price = price;
	}
	

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
