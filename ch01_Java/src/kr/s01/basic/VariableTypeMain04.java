package kr.s01.basic;

public class VariableTypeMain04 {
	public static void main(String[] args) {
		System.out.println("=====명시적 형변환(강제 형변환)=====");
		//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수 잇으있음
		
		byte b1 = 127;
		byte b2 = 127;
		byte result1 =(byte)(b1+b2);//소괄호를 해서 결과를 만들어 끌어 내린다. 
		//int->byte 깅제 형변환
		
		System.out.println(result1);
	}

}
