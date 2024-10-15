package ch05.week3;

interface AdderInterface{
	int add(int x ,int y);
	int add(int n);
}

class myAdder implements AdderInterface{
	
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
	@Override
	public int add(int n) {
		return n;
	}
	
}

public class Q2 {
	public static void main(String[] args) {
		
	}

}
