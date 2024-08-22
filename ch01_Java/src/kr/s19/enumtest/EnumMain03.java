package kr.s19.enumtest;

enum Gender3{
	
	//method를 넣어 주기 위해서는 ;이 필요하다.
	MALE,FEMALE;
	

	@Override
	public String toString() {
		switch(this){
		case MALE:
			return "남자";
		default :
			return "여자";
		}
		
	}
	
}

public class EnumMain03 {
	public static void main(String[] args) {
		
		System.out.println(Gender3.MALE);
		System.out.println(Gender3.FEMALE);
		
		System.out.println("-------------------------");
		
		
		System.out.println(Gender3.MALE.toString());
		System.out.println(Gender3.FEMALE.toString());
		
	}
}
