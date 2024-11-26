package ch05.week3;

interface AdderInterface{
	int add(int x ,int y);
	int add(int n);
}

class MyAdder implements AdderInterface{
	
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
	@Override
	public int add(int n) {
		int sum=0;
		
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		
		return sum;
	}
	
}

public class Q2 {
	public static void main(String[] args) {
		
		MyAdder adder = new MyAdder();
		
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
		
	}

}
