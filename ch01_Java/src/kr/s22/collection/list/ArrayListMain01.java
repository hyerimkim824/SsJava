package kr.s22.collection.list;
import java.util.ArrayList;


class A{
	
	@Override
	public String toString() {
		return "A클래스";
	}
	
}

class B{
	
}


public class ArrayListMain01 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//이렇게 넣을 수는 있지만 데이터를 다시 표시할 때 자료형이 같아야한다.
		//하나의 type을 선택해야 한다.
		
		list.add(new A());//A->Object
		list.add(new B());//B->Object
		list.add("홍길동");//String->Object
		list.add(new Integer(10)); //예날 방식 즉, new를 사용하지 않고 대입만 할 수 있도록
		list.add(10); //int->Integer->object
		
		//ArrayList에 저장된 요소의 목록
		System.out.println(list);
		

	}

}
