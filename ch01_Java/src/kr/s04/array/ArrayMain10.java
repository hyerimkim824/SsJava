package kr.s04.array;

public class ArrayMain10 {
	
	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 1) 10,20,30,40,50을 초기값으로 갖는 1차우너 배열을 test이름으로 선언,생성,최기화 하시오.
		 * 2)반복문을 이용해서 출력하시오
		 * 3)확장 for문을 이용해서 출력하시오.
		 * 4)인덱스 3의 데이터를 100으로 변경하시오.
		 * 5)마지막 요소의 값을 200으로 변경하시오.
		 * 6)반복문을 사용하여 모든 요소의 값을 0으로 초기화 하시오.
		 * 7)호수 인덱스에 10, 짝수 인덱스에 20 저장
		 * 8)모든 요소의 총합과 평균(총합을 요소의 수로 나눔)구하고 출력하시오.(sum(총합),avg(평균))
		 */
		
		//1)
		
		int[] test = {10,20,30,40,50};
		
		//2)
		for(int i=0;i<test.length;i++) {
			System.out.printf("%d \t",test[i]);	
		}
		System.out.println();
		//3
		for(int j : test) {
			System.out.print(j+"\t");}
		System.out.println();
		//4
		test[3]=100;
		
		System.out.println("인덱스3 = "+test[3]);
		//5
		
		int last_index = test.length -1;
		
		test[last_index] =200;	

		
		System.out.println("인덱스 마지막 = "+test[last_index]);
	
		/* 6)반복문을 사용하여 모든 요소의 값을 0으로 초기화 하시오.
		 * 7)홀수 인덱스에 10, 짝수 인덱스에 20 저장
		 * 8)모든 요소의 총합과 평균(총합을 요소의 수로 나눔)구하고 출력하시오.(sum(총합),avg(평균))
		 */
		//7)
		for(int i=0;i<test.length;i++) {
			test[i]=0;
			System.out.printf("%d \t",test[i]);
			
			
		
		}
		
		
		}
		
		
		
		
		
		
		
	}


