package kr.s21.exception;

public class ExceptionMain06 {
	
	//throw 인위적 예외 발생	
	public void methodA(String[] n)throws Exception{
		if(n.length>0) {// 입력한 값이 존재
			
			for(String s : n) {
				System.out.println(s);
			}
			
		}else {
			//입력한 값이 없음
			//System.out.println("입력한 값이 없음");
			//예외를 인위적으로 발생시킴
			throw new Exception("입력한 데이터가 없습니다.");
		}
		
	}
	public static void main(String[] args) {
		ExceptionMain06 em = new ExceptionMain06();
		
		try {
			em.methodA(args);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
