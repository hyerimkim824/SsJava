package kr.s13.object.supertest;


class Mother{
	public String getLunch() {
		return "밥";
	}
}

class Daughter extends Mother{
	
	@Override
	public String getLunch() {
		return "빵";
	}
	
	public String getRice() {
		return super.getLunch();
	}
}

public class SuperMain01 {
	public static void main(String[] args) {
		
		Daughter d = new Daughter();
		System.out.println("딸은 오늘은 왠지"+d.getRice()+"이 벅고싶어졌습니다.");
		
	}

}
