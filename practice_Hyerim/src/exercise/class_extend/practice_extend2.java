package exercise.class_extend;


class Man{
	int age ;
	int test;
}

class Woman{
	int age;
}

class Student1 extends Man{
	int age;
	
}
public class practice_extend2 {
	
	public static void main(String[] args) {
		
		Student1 s = new Student1();
		s.age = 3;
		s.test = 6;
		System.out.println(s.age);
		System.out.println(s.test);
		
	}
	

	

}
