package kr.s04.array;

/*
 * 배열의 경우에는 자료형을 꼭!!! 맞춰줘야 한다.
 */

public class ArrayMain03 {
	public static void main(String[] args) {
		
		int sum =0; //총점
		float average = 0.0f; //평균
		
		//배열 선언, 생성(암시적 배열 생성), 초기화
		int[] score = {100,88,88,100,90};
		              //0  1  2  3  4
		
		//총점 구하기
		                //배열의 길이
		for(int i=0; i<score.length;i++) {
			//누적
			sum+=score[i];
			
	
		}
		//평균 구하기
		average = sum/(float)score.length;
		
		System.out.printf("총점 : %d%n", sum);
		System.out.printf("평균 : %.2f",average);
		
		
	}

}
