package kr.s03.operation;

public class OperationMain18 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int dan = input.nextInt();
		System.out.println(dan+"단");
		System.out.println("-------------");
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
			
		input.close();
	}

}
