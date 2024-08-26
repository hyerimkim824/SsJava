package kr.s26.collection.map;
import java.util.Hashtable;
import java.util.Enumeration;


public class HashtableMain {
	public static void main(String[] args) {
		
		//value가 integer와 string 등이 섞여 있다면
		
		Hashtable<String, Object> h = 
				new Hashtable<String, Object>();
		
		h.put("name", "홍길동"); //String ->Object
		h.put("age",27); //Integer ->Object
		h.put("tel", "010-1234-5678");//String -> Object
		h.put("hobby","축구"); //String -> Object
		//key를 중복하면 마지막 값만 인정
		h.put("age", 0);
		//key,value에 null 불인정
		//h.put("adress", null); //vlaue : null인정X -> 에러가 난다.
		//h.put(null, "서울"); //key : null인정X -> 에러가 난다.
		
		
		//저장된 요소의 목록
		System.out.println(h);
		System.out.println("-----------------------");
		String name = (String)h.get("name");
		Integer age = (Integer)h.get("age");
		
		System.out.println(name +", "+age); 
		System.out.println("-------------------------");
		
		//반복문을 이용한 요소의 출력
		
		Enumeration<String> en = h.keys(); //key만 Enumeration에 담긴다.
		
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key+", "+h.get(key)); //입력한 순서대로 나오지는 않는다.
		}
		
		
		
	}

}
