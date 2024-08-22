package kr.s16.object.poly;

//부모 크래스

class People{
	//Onject의 toString 재정의
	@Override
	public String toString() {
		return "People 클래스";
		
	}
}


//자식 클래스
class Student extends People{
	@Override
	public String toString() {
		return "Student 클래스";
	}
}
public class PolyMain06 {
	public static void main(String[] args) {
		People p = new People();
		
		//컴파일시 오류는 없지만 실행시에 오류 발생
		//Student ch = (Student)p;
		
		
		//instanceof 연산자는 사용하는 대상객체가 지정한 자료형을 사용할 수 있으면
		//true 반환
		//객체            참조자료형
		if(p instanceof Student) {
			Student ch2 = (Student)p;
			System.out.println(ch2);
			System.out.println("~~~~~~~~~~");
			
		}else {
			System.out.println(p);
			System.out.println("++++++++++++++++++");
		}
	
	}
	
	

}
