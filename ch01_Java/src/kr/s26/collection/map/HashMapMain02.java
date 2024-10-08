package kr.s26.collection.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {
				"Berlin","Paris","Seoul","New York" ,"London"};
		
		HashMap<Integer, String> map = 
				new HashMap<Integer,String>();
		//반복문을 이용해서 요소 저장
		for(int i=0; i<msg.length;i++) {
			//key, value
			map.put(i, msg[i]);
			
		}
		
		System.out.println(map);
		System.out.println("----------------------------");
		
		//반복문을 이용해서 key와 value의 쌍으로 정보 구하기
		//Set<Integer> s = map.keySet();
		//Iterator<Integer> keys = s.iterator();
		//s라는 변수를 주는 것 보다는 아래처럼 선언하는 것이 Iterator<Integer> keys = map.keySet().iterator(); 
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key+", "+map.get(key));
		}
		
	
	
	
	}

}
