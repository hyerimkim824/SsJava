package kr.s01.basic;

public class PrintMain06 {
	public static void main(String[] args) {
		/*
		 * System.out.printf(포맷문자,데이터)를 이용한
		 * 출력(데이터의 종류를 표시할 수 있는 포맷 문자 지운
		 */
		
		//문자             포맷문자,전달될 데이터
		System.out.printf("%c%n",'A');
		System.out.printf("%6c%n",'B');
		System.out.printf("%-6c%n",'B');//6자리 확보, 오른쪽에 정렬
		
		//정수 
		System.out.printf("%d%n",67);
		System.out.printf("%,d원%n",10000); //3자리 단위로 쉼표 표시
		System.out.printf("%5d%n", 20); //5자리 확보, 오른쪽 정렬
		System.out.printf("%-5d%n", 20); //5자리 확보, 왼쪽 정렬
		
		//실수
		//소수점이하 6자리 확보. 비어있는 자리는 0으로 채움
		System.out.printf("%f%n", 35.896);
		//소수점 이하 둘째자리까지 출력(셋째자리에서 반올림)
		System.out.printf("%.2f%n", 35.896);
		//10자리 확보. 오른쪽에 정렬, 소수점이하 둘째자리까지 출력
		System.out.printf("%10.2f%n", 35.896);
		
		System.out.println("------------------");
		//문자열
		System.out.printf("%s%n", "우주");
		System.out.printf("%5s%n", "하늘");
		
		System.out.println("------------------");
		
		//논리값
		System.out.printf("%b%n",true);
		System.out.println("------------------");
		//데이터의 종류가 다른 여러개의 데이터 표시
		//System.out.printf("점수는 %d점입니다.%n",98);
		System.out.printf("%s는 %d점입니다.%n","점수",98);
		
		
		
		
		
		
		
	}

}

