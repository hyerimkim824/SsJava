package kr.s05.object.method;

public class MethodMain04 {


	/*
	 * [실습]
	 * 1)배열 요소의 수(사람 수)를 입력 받아서 배열 weight 생성
	 * 2)입력 받은 정수를 배열 weight에 저장하고 배열 weight가 가진 
	 *   모든 요소의 수 중 minOf(int[] w) 메서드에서 전달
	 * 3)minOf(int[] w)는 메서드는 전달된 배열의 요소 중 최소값을 반환
	 * 
	 * [입력 예시]
	 * 사람 수 :3
	 * 1번의 몸무게 : 90
	 * 2번의 몸무게 : 72
	 * 3번의 몸무게 : 45
	 * 
	 * [출력 예시]
	 * 가장 마른 사람의 몸무게는 45kg 입니다.
	 * 
	 *   
	 */
	public int minOf(int[] w) {

		int min = w[0];
		for(int i=0; i<w.length;i++){

			if(w[i]<min)
				min =w[i];

		}
		return min;

	}


	public static void main(String[] args) {

		java.util.Scanner input = //입력 받을 Scanner 형성
				new java.util.Scanner(System.in);

		MethodMain04 me = new MethodMain04();//객체 생성

		System.out.print("사람 수 : ");// 입력받는 요소의 수
		int people_num = input.nextInt();

		int[] x = new int[people_num];


		int arg_num =0; //사용할 변수 초기화

		for(int i=0;i<people_num;i++){ //array[index]에 값 입력

			System.out.printf("%d번 사람의 몸무게 : ",i+1);
			arg_num = input.nextInt(); //input 받는다.
			x[i] = arg_num;		
		}

		System.out.println("");
		System.out.printf("가장 마른 사람의 몸무게는 %dkg 입니다.",me.minOf(x)); //method 이용해서		
		
		input.close();
		


	}

}
