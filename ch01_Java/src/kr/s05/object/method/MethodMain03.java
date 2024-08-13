package kr.s05.object.method;

public class MethodMain03 {
	
	
	/*
	 * [실습]
	 *1)배열의 요소의 수를 입력 받아서 int형 배열 x 생성
	 *2)생성한 배열 x에 값을 입력
	 *3)배열 x가 가진 모든 요소의 합을 구하는 sumOf(int[] a)
	 * 
	 * [입력 예시]
	 * 요소의 수 : 3
	 * x[0] = 1
	 * x[1] = 2
	 * x[2] = 3
	 * 
	 * [출력 예시]
	 * 모든 요소의 합은 6입니다.
	 */
	
	public int sumOf(int[] a) {// array의 합을 구하는 method
		
		int sum =0;
		for(int i=0;i<a.length;i++) {//for문을 이용해서 sum구하기
			sum +=a[i];
		}
		return sum;		
	}
		
	
	public static void main(String[] args) {
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		MethodMain03 me = new MethodMain03();//객체 형셩
		
		System.out.print("요소의 수 : ");// 입력받는 요소의 수
		int num = input.nextInt();
		
		int[] x = new int[num]; //요소의 개수 만큼의 array 만들기 
		
		int arg_num =0; //사용할 변수 초기화
		
		for(int i=0;i<num;i++){ //array[index]에 값 입력
			
			System.out.printf("x[%d] =",i);
			arg_num = input.nextInt(); //input 받는다.
			x[i] = arg_num;	
		}
		
		System.out.println("");
		System.out.printf("모든 요소의 합은 %d 입니다.",me.sumOf(x)); //method 이용해서		
		
		input.close();
		
	}

}
