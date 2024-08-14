package kr.s04.array;

public class ArrayMain05 {
	public static void main(String[] args) {
		
		//배열 선언, 생성, 초기화
		int[] array = {10,20,30,40,50};
		
		//반복문을 이용한 요소의 출력
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:"+array[i]);
		}
		
		/*
		 * 개선된 루프(확장 for문)
		 * 
		 */
		
		for(int num : array) {
			System.out.print(num+"\t");
			
		}
		
		
	}

}
