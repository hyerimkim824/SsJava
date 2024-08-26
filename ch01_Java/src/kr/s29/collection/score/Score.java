package kr.s29.collection.score;

public class Score {
	
	private String name;
	private int korean;
	private int english;
	private int math;


	//총점
	public int makeSum() {
		return korean+english+math;
	}
	//평균
	public double makeAverage() {

		return makeSum()/3.0;
	}

	//등급
	public String makeGrade() {
		String grade; //변수 선언
		switch((int)makeAverage()/10) {
		case 10:
			grade ="A"; break;
		case 9:
			grade ="A"; break;
		case 8:
			grade ="B"; break;
		case 7:
			grade ="C"; break;
		case 6:
			grade ="D"; break;
		default :
			grade ="F";
		}
		return grade;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
}
