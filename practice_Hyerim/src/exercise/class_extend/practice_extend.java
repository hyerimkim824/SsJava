package exercise.class_extend;


class Student{	
	String name;
	int score;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getScore() {
		return score;
	}
	
	void setScore(int score) {
		this.score = score;
	}
}


class UniversityStudent extends Student{
	
	String major;
	
	public String getMajor() {
		return major;
		
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
}

class HighStudent extends Student{
	
	int classNumber;
	
	public int getClassNumber() {
		return classNumber;
	}
	
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
}

//상속 test
public class practice_extend {
	
	public static void main(String[] args) {
		UniversityStudent kim = new UniversityStudent();
		kim.name ="김둘리";
		kim.setScore(83); //score을 set 한다.
		kim.major = "컴퓨터 공학";
		System.out.println(kim.getName()+"의 점수 : "+kim.score);
		
		
		HighStudent park = new HighStudent();
		park.name = "박또치";
		park.setScore(100);
		park.classNumber = 6;
		System.out.println(park.getName()+"의 점수 : "+park.score);
	}
	

}
