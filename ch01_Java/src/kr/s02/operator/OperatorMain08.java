package kr.s02.operator;

public class OperatorMain08 {
	public static void main(String[] args) {
		
		/*
		 논리곱(&&)
		 선조건  &&  후조건   결과
		 true      true   true
		 true      false  false
		 false--------->  false!! (실행 안하고 무조건 결과가 나온다.)
		 
		 논리합
		 선조건  ||  후조건  결과
		 false     true  true
		 false     false false
		 true----------> true!!(실행 안하고 무조건 결과가 나온다.)	 
		 
		 */
		//증감연산자, 비교연산자, 논리연산자
		
		int a,b;
		a = b =10;
		
		boolean c = a++>=++b && ++a >b++;
		          //10   11
				  //false----->뒤에 있는 연산을 하지 않는다!!
		System.out.println(a+","+b); //11,11
		System.out.println(c);//false
		
		System.out.println("------------------");
		
		int d, e;
		d = e =10;
		
		boolean f = ++d > e++ || d++ >= ++e;
		            //11  10
		System.out.println(f);		
		
		
	}

}
