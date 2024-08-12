package kr.s04.array;

public class ArrayMain13 {
	public static void main(String[] args) {
		int[][] test ;//2차원 배열 선언
		test = new int[2][3];//2차원 배열 생성(2행 3열)
		
		//2차원 배열 초기화
		//[행번호][열번호]
		test[0][0] =100; //1행 1열
		test[0][1] =200; //1행 2열
		test[0][2] =300; //1행 3열

		test[1][0] = 400; //2행 1열
		test[1][1] = 500; //2행 2열
		test[1][2] = 600; //2행 3열
		
	    //2차원 배열에 요소 출력
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		System.out.println(test[1][2]);
		
		//반복문을 이용한 출력
		//for 문을 2번 이용해야 한다.
		//행은 그냥 length 함수
		
		              //행의길이(2)
		for(int i=0;i<test.length;i++) {
			            //열의길이(3)
			for(int j=0; j<test[i].length;j++){
				System.out.println(
						"test["+i+"]["+j+"] :"+test[i][j]);
			}
			
		}
		
		
		
		
		
		
	}

}
