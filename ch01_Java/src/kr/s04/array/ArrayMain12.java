package kr.s04.array;

public class ArrayMain12 {
	
	
	public static void main(String[] args) {
		
		/*
		 * [실습] 
		 * 단을 입력 받아서 1~9까지 곱하고 결과값을 배열에 저장.
		 * 배열에 저장된 값을 읽어서 구구단 출력 형싱(2*1)으로 출력 하시오.
		 * 
		 * [입력 예시]
		 * 단 입력 : 2
		 * 
		 * [출력 예시]
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * ...
		 * 2 * 9 = 18
		 * 
		 */
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = input.nextInt(); //단 입력
		int dan_num = 9;
		
		int[] dan_array;
		dan_array = new int[dan_num];
		
		System.out.println("=============");
		for(int i=1; i<=dan_num; i++){
			
			int index_num = i-1;
			dan_array[index_num] = dan*i;
			
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
			
		}
		
		
		
		
		
		
		
		
		input.close();
		
		
	}
	
	
	
}
