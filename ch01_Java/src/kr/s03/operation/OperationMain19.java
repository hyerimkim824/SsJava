package kr.s03.operation;

public class OperationMain19 {
	
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 
		 * 
		 * 만나이 = (현재 연도 - 태어난 연도)-(
		 *        (생일이 지났으면 0. 생일이 지나지 않았으면 1)
		 *        
		 *[입력 예시]
		 *출생연도 입력 :2000
		 *월 입력 : 3
		 *일 입력 : 12
		 *
		 *[출력 예시]
		 *만 나이는 24
		 *  
		 */
		//현재 날짜 정보
		
		int nowYear=2024;
		int nowMonth =8;
		int nowDate = 8;
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		System.out.print("출생연도 입력 : ");
		int myYear = input.nextInt();
		
		System.out.print("월 입력: ");
		int myMonth = input.nextInt();
		
		System.out.print("일 입력: ");
		int myDate = input.nextInt();
		
		int result =0;
		int cal_result = nowYear-myYear;

		if(nowYear<myYear&&nowMonth<myMonth&nowDate<myDate) {
			System.out.print("미래의 아이 입니다!!");
			System.exit(0);
			
		}
		
		if(myMonth>=nowMonth&&myDate>nowDate) {
			
			result = cal_result-1;
			
		}
		else {result = cal_result;}
		
		System.out.println();
		System.out.println("만 나이는 "+result);
		
		
		input.close();
		
		//d
	
	}
}
