package kr.s25.collection.set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain01 {
	public static void main(String[] args) {
		//HashSet : 중복값 불허
		
		String[] str = {"Java","JSP","Java","Oracle"};
		
		HashSet<String> hs = new HashSet<String>();
		
		//반복문을 이용한 요소 저장
		for(String n :str) {
			hs.add(n);//중복 불허 //Java가 탈락된다.
			
		}
		//HashSet에 저장된 요소의 목록
		System.out.println(hs);
		System.out.println("-------------------");
		//Iterator 객체를 이용해서 요소의 출력
		Iterator<String> ir = hs.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("---------------------");
		//확장 for문을 이용한 출력
		for(String s:hs) {
			System.out.println(s);
		}
		
	}

}
