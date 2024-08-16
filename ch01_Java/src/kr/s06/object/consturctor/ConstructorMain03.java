package kr.s06.object.consturctor;



class Student{
	
	int korean;
	int english;
	int math;
	int history;
	int science;
	int num; //과목수
	
	
	//생성자
	public Student(int k, int e, int m) {
		korean = k;
		english = e;
		math = m;
		num = 3;//과목수 지정
		}
	
	public Student(int k, int e, int m ,int h, int s) {
		korean = k;
		english = e;
		math = m;
		history = h;
		science = s;
		num = 5;//과목수 지정
	}
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

public class ConstructorMain03 {
	
	
	public static void main(String[] args) {
		//3과목 성적 처리
		Student s1 = new Student(90,97,95); //알아서 num값이 3
		
		System.out.println("합계 = "+s1.getTotal()); 
		System.out.println("평균 = " +s1.getAverage());
		System.out.println("-------------------------");
		
		//5과목 성적 처리
		Student s2 = new Student(88,82,84,87,90);//알아서 num값이 5

		System.out.println("합계 = "+s2.getTotal());
		System.out.println("평균 = " +s2.getAverage());
		System.out.println("-------------------------");
			
	}

}
