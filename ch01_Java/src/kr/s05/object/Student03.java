package kr.s05.object;

public class Student03 {
	
	//멤버 필드
	String name; //String또한 문자열에 대한 class다.
	int korean;
	int english;
	int math;
	int sum;
	double average;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student03 student = new Student03();
		
		student.name = "홍길동";
		student.korean = 98;
		student.english = 95;
		student.math = 97;
		student.sum = student.korean+student.english+student.math;
		student.average = student.sum/3.0;
		
		System.out.println("이름 : "+student.name);
		System.out.println("국어 : "+student.korean);
		System.out.println("수학 : "+student.math);
		System.out.println("영어 : "+student.english);
		System.out.println("총점 : "+student.sum);
		System.out.printf("평균 : %.2f",student.average);

	}
	
}
