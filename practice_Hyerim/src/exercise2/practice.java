package exercise2;

class Student{
	
	int num =5; //과목수
	int korean = 1;
	int english = 2;
	int math = 3;
	int history = 4;
	int science = 5;
	
	
	

	//멤버 메서드
	//총점 구하기
	public int getTotal() {
		
		int total;
		if(num==3) {
			total = korean +english+math;}
		else {
			total = korean +english+math+history+science;}
		return total;
	}
	//평균 구하기
	public int getAverage() {
		return getTotal()/num; //num이 있기 때문에 간단하다!
	}
	
	
	
}

public class practice {
	
	
	public static void main(String[] args) {
		//3과목 성적 처리
		Student s1 = new Student(); //알아서 num값이 3
		
		System.out.println("합계 = "+s1.getTotal()); 
		System.out.println("평균 = " +s1.getAverage());
		System.out.println("-------------------------");
		
		
		
	}

}
