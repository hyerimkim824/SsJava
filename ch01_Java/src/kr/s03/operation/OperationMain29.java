package kr.s03.operation;

public class OperationMain29 {
	public static void main(String[] args) {
		
		int su =0;
		String str ="Hello World";
		
		//선 처리, 후 비교
		//먼저 실행되기 때문에 while문이 몇바퀴 도는지 충분히 고려해야 한다.
		
		do {
			System.out.println(str);
			
		}while(su++<5); //;이 꼭 필요하다
		
		System.out.println("------------");
		
		int su2 =0;
		
		//선 비교, 후 처리
		while(su2++ <5) {
			System.out.println(str);
			
		}
		
	}

}
