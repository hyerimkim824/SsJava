package kr.s19.enumtest;


enum Item2{
	
	//숫자를 사용하기 위해서는 enum을 잘 쓰지 않는다.
	
	// 생성자를 표시
	ADD(5), DEL(11), SEARCH(2), CANCEL(22); 
	//위에 지정한 상수 값들을 저장하기 위한 공간
	
	private final int var;
	
	//생성자
	Item2(int var) {
		this.var = var;
	}
	
	public int getVar() {
		return var;
	}
	
	
	
}

public class EnumMain05 {
	public static void main(String[] args) {

		System.out.println(Item2.ADD.getVar());
		System.out.println(Item2.DEL.getVar());
		System.out.println(Item2.SEARCH.getVar());
		System.out.println(Item2.CANCEL.getVar());

	}

}
