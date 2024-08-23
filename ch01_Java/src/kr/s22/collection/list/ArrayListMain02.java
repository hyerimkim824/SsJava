package kr.s22.collection.list;
import java.util.ArrayList;


public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("홍길동"); //String -> Object
		list.add("박문수"); //String -> Object
		list.add("장영실"); //String -> Object
		list.add("김유신"); //String -> Object
		
		//반복문을 이용한 요소의 출력
		for(int i =0; i<list.size();i++) {
			String name = (String)list.get(i); //암시적 형변환이 되지 않는다ㅏ. ->down casting
			System.out.println(name);
		}
		
				}

}
