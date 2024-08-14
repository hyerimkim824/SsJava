package kr.s04.array;

public class ArrayMain09 {
	public static void main(String[] args) {
		//전달된 데이터는 모두 문자열로 인식하기 때문에
		//+ 연산을 하지 못 하고 문자열 연결을 수행함.
		System.out.println(args[0] + args[1]);
		System.out.println("---------------");
		//String -> int 변환
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("합계 : " + (num + num2));
	}
}





