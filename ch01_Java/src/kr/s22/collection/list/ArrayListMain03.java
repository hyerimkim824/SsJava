package kr.s22.collection.list;
import java.util.ArrayList;



public class ArrayListMain03 {
	public static void main(String[] args) {
		
		//제네릭 표현 : 객체를 생성할 때 객체에 저장할 수 잇는 요소의 타입을 지정
		ArrayList<String> list = new ArrayList<String>();
		
		//ArrayList<t> list2 = new ArrayList<t>();
		
		//제네릭 표현을 사용해서 String 데이터를 ArrayList에 저장하겠다고 명시했기 때문에
		//내부적으로 Object로 변환되는게 아니라 지정  String 타입으로 저장
		
		list.add("강호동"); 
		list.add("유재석"); //String->Object
		//list.add(10000); //int->Integer->Object
		list.add("홍길동"); //String->Object
		
		//반복문을 이용해서 요소 출력
		for(int i =0;i<list.size();i++) {
			String name = list.get(i);
			System.out.println(name); //컴파일 할 때는 에러가 나지 않느다.
		}
		System.out.println("-------------------");
		
		//확자 for문 -> 코드가 절약이 된다.
		for(String name : list) {
			System.out.println(name);
		}
		
	}

}
