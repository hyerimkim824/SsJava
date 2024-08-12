package kr.s04.array;

public class ArrayMain01 {
	public static void main(String[] args) {
		
		char[] ch; //배열이 생성 된 것은 아님, just 배열 선언
		ch = new char[4]; //배열 생성, 데이터 방의 개수가 4
		ch[0]='J';
		ch[1] ='a';
		ch[2]='v';
		ch[3]='a';
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//반복문을 이용한 배열의 요소 출력
		for(int i=0;i<4;i++) {
			System.out.println("ch+["+i+"]:"+ch[i]);
		}
		//반복문을 이용한 배열의 요소 출력
		
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch+["+i+"]:"+ch[i]);
			
		//배열의 선언 및 생성
		int[] it = new int[6];
		
		//배열의 선언, 생성(명시적 배열 생성), 초기화
		char[] ch2= new char[] {'J','a','v','a'}; //데이터를 초기화 하는 것을 같이 넣으려면 char[4] 이렇게 지정하면 안된다.
			
		//배열의 선언, 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'자','바'};
		//메모리 공간에는 명시적이던 암시적이던 같다.
		}
		
	}
}
