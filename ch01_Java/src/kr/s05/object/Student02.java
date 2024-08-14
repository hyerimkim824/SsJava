package kr.s05.object;

public class Student02 {
	
	//멤버 필드
	String name;
	int age;
	String hobby;
	String job;
	
	public static void main(String[] args) {
		
		Student02 student = new Student02();
		student.name = "홍길동";
		student.age = 20;
		student.hobby = "축구";
		student.job = "경찰";
		
		//객체의 멤버 변수에 저장된 값 출력
		
		System.out.println(student.name+", "+student.age+", "
				+student.hobby+", "+student.job);
		
		Student02 student2 = new Student02();
		
		student2.name = "박문수";
		student2.age = 19;
		student2.hobby = "야구";
		student2.job = "가수";
		
		System.out.println(student2.name+", "+student2.age+", "
				+student2.hobby+", "+student2.job);
		
		
		
		
	}

}
