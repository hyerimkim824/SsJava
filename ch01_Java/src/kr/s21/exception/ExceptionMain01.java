package kr.s21.exception;

public class ExceptionMain01 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		//String[] array2 = {"메롱","바보"};
		
		//테스트용으로 인덱스3이 호출되도록 코드를 작성
		//실행시 인덱스 3이 없기 때문에 예외가 발생해서 강제로 종료
		for(int i=0; i<array.length;i++) {
			System.out.println("array["+i+"] : "+array[i]);
		}
		System.out.println("프로그램 끝!");

	}

}
