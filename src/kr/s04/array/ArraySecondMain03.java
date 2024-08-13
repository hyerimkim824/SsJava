package kr.s04.array;

public class ArraySecondMain03 {
	public static void main(String[] args) {
		
		//여러명의 총점과 평균을 저장하기 위해서 2차원 배열을 사용했다.
		
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		//과목명

		String[] course = {"국어","영어","수학"};
		
		//인원수(행의 길이)
		System.out.print("인원수 : ");
		int num = input.nextInt();
		
		//점수가 지정될 2차원 배열 생성
							//인원수    과목수
							//행의 길이 열의 길이
		int[][] score = new int[num][course.length];
		
		//총점
		int[] sum = new int[num];
		
		//평균
		float[] avg = new float[num];
		
		//성적을 입력받고 총점과 평균 구하기
		
		for(int i=0; i<score.length;i++) {//i : 행 번호
			for(int j=0; j<score[i].length;j++) {
				//성적을 입력 받음
				do {
					//과목명 출력
					System.out.print(course[j]+"=");
					score[i][j] = input.nextInt();
					
				}while(score[i][j]<0||score[i][j]>100);
				
				//총점 구하기
				sum[i] +=score[i][j];	
			}//end of inner for
		
			//평균 구하기
			       //총점        과목수
			avg[i]=sum[i]/(float)course.length; //score[i].length, 하나를 꼭 float 데이터로 만들어야 한다.
			System.out.println();//단순 줄바꿈
			
		}//end of outer for
		
		//총점과 평균 출력
		for(int i=0;i<num;i++) {
			System.out.println();//단순 줄바꿈
			System.out.printf("총점= %d%n", sum[i]);
			System.out.printf("평균 %.2f%n", avg[i]);
			System.out.println("--------------------");
		}
	

		input.close();
		
	}

}
