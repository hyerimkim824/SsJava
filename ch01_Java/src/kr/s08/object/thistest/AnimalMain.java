package kr.s08.object.thistest;
import kr.s08.object.thistest.*;


/*
 * [실습]
 * Animal
 * 멤버 변수 : private - 이름(name),나이(age),비행여부(fly(boolean type))
 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
 * 멤버 메서드 : public - set/get 메서드
 * 
 * AnimalMain
 * 1)인자가 없는 생성자를 이용해서 객체 생성
 * 2)이름,나이,비행여부 지정
 * 3)이름,나이,비행여부 출력(비행여부 true/false ->가능 불가능)
 * 
 * 4)인자가 있는 생성자를 이용해서 객체 생성
 * 5)이름, 나이, 비행여부 출력(비행여부 true/false ->가능 불가능)
 * 
 * 
 */




public class AnimalMain {
	
	public static void main(String[] args) {
		
		//인자 없는 생성자
		Animal a1 = new Animal(); //인자가 없는 생성자는 꼭 Animal class에서 선언이 되어야 한다.
		                          //그렇지 않으면 인자가 있는 생성자로 호출이 되기 떄문에 문제가 생긴다.
		a1.setName("돌고래");
		a1.setAge(10);
		a1.setFly(false);
		System.out.println("이름 : "+ a1.getName());
		System.out.println("나이 : "+a1.getAge());
		System.out.println("비행여부 : "+(a1.isFly() ? "가능":"불가능"));
		
		
		/*if (a1.isFly()==true) {
			System.out.println("비행여부 : 가능");
		}else {System.out.println("비행여부 : 불가능");}
		
		System.out.println("----------------");*/

		//인자 있는 생성자
		
		Animal a2 = new Animal("두루미",5,true);
		
		System.out.println("이름 : "+ a2.getName());
		System.out.println("나이 : "+a2.getAge());

		
		
		if (a2.isFly()==true) {
			System.out.println("비행여부 : 가능");
		}else {System.out.println("비행여부 : 불가능");}
		
		
		
		
		
	}

}
