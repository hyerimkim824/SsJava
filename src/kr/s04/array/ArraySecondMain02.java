package kr.s04.array;

public class ArraySecondMain02 {
	public static void main(String[] args) {
		//5행 3열의 2차원 배열 생성
		int[][] score = {
				
					{98,97,96},
					{88,95,92},
					{91,97,93},
					{92,95,93},
					{92,95,96},
					{78,97,91},		
				};
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("---------------------");
		              //행의길이
		for(int i=0;i<score.length;i++){
			int sum =0;
			System.out.print(" "+(i+1)+" ");
			             //열의 길이
			for(int j=0;j<score[i].length;j++) {
				sum +=score[i][j];
				System.out.print(score[i][j]+" ");
				
			}
			//총점 출력, 평균을 구하고 출력
			System.out.println(sum+" "+sum/score[i].length);
		}
		
	}

}
