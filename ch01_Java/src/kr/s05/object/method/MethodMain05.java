package kr.s05.object.method;

public class MethodMain05 {
	
	//멤버 변수
	String name; //null
	int korean;
	int english;
	int math;
	
	//멤버 메서드
	//총점
	public int makeSum() {
		return korean +english+math;
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
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain05 me = new MethodMain05();
		me.name = "홍길동";
		me.korean = 98;
		me.english = 96;
		me.math = 97;
		
		System.out.println("이름 : "+me.name);
		System.out.println("국어 : "+me.korean);
		System.out.println("영어 : "+me.english);
		System.out.println("수학 : "+me.math);
		System.out.println();
		System.out.println("총점 : "+me.makeSum());
		System.out.println("평균 : "+me.makeAverage());
		System.out.println("등급 : "+me.makeGrade());


	}
	

}
