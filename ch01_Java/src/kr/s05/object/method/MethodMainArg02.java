package kr.s05.object.method;

public class MethodMainArg02 {
	
	//인자 전달 방식 : 참조 호출(call by Referece)
	//객체의 주소를 인자로 전달하는 방식. 주소(reference)를 복사하여 전달
	public void increase(int[] n) {
		
		for(int i=0; i<n.length;i++) {
			n[i]++; //모든 데이터를 다 1씩 증가
		}
		
	}

	public static void main(String[] args) {
		
		//배열 생성
		//int[] ref1 = {100, 200, 300}; 이것도 가눙하다.
		int ref1[] = {100, 200, 300};
		
		System.out.println("=====데이터 변경 전 =====");
		for(int i=0; i<ref1.length;i++) {
			System.out.println("ref1["+i+"] :"+ref1[i]);
			
		}
		
		MethodMainArg02 me = new MethodMainArg02();
		//ref1 배열에 주소를 복사해서 메서드의 인자에 전달
		me.increase(ref1);
		
		System.out.println("=====데이터 변경 후 =====");
		for(int i=0; i<ref1.length;i++) {
			System.out.println("ref1["+i+"] :"+ref1[i]);
			
		}
		
		
	
	}
}
