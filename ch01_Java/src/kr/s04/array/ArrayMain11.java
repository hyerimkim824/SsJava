package kr.s04.array;

public class ArrayMain11 {
	public static void main(String[] args) {
		
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		/*
		 * [실습]
		 * double형인 배열의 모든 요소의 합과 평균을 구하는 프로그램 작성
		 * 
		 * [입력 예시]
		 * 요소의 수>>3
		 * a[0]=2.2
		 * a[1]=2.2
		 * a[2] = 3.3
		 * 
		 * [출력 예시]
		 * 모든 요소의 합은 7.7입니다.(System.out.println으로)
		 * 모든 요소의 평균은 2.57입니다.(System.out.printf로 소수점 둘째자리까지 표시)
		 */
		
		double[] a;
		
		System.out.print("요소의 입력>>");
		
		int num= input.nextInt();
		a = new double[num];
		
		System.out.println();
			
		//입력 & 총합
		double sum = 0d;
		
		for(int i=0;i<a.length;i++) {	
			System.out.print("a["+i+"]=");
			a[i] = input.nextDouble();
			sum += a[i];
		}
		
		//평균
		double avg = sum/num;
		
		//출력
		System.out.println();
		System.out.println("모든 요소의 합은"+sum+"입니다.");
		System.out.printf("모든 요소의 평균은 %.2f입니다.",avg);
		
		input.close();
		
		//배열은 고정 길이이다. 즉, 정해진 길이 범주 내에서 작업을 해야한다.
		
		
	}

}
