package kr.s04.array;

public class ArrayMain06 {
	public static void main(String[] args) {
		
		String[] array = new String[3];
		
		//배열에 요소 저장
		array[0] = "Java";
		array[1] = "Oracle";
		array[2] ="HTML";
		//반복문을 이용한 요소의 출력
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------");
		//확장 for문을 이용한 요소의 출력
		for(String str : array) {
			System.out.println(str);
			
		}
				
		
	}

}
