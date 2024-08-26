package kr.s26.collection.map;
import java.util.HashMap;


public class HashMapMain01 {
	public static void main(String[] args) {
		/*
		 * Map 구조 : key와 value의 쌍으로 저장,
		 *  key는 set방식 처럼 저장된 순서가 유지 되지 않음
		 */
	
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("긴신", 95);
		map.put("지은탁", 100);
		map.put("저승사자", 85);
		map.put("써니", 93);
		map.put("유덕화", 70);
		//key가 중복되면 나중에 넣은 값만 반영
		map.put("지은탁", 0);
		map.put("강호동", null);
		
		//key,value에 null인정
		map.put(null, 50);
		map.put(null, 50);
		
		//HashMap에 저장된 요소의 목록
		System.out.println(map);
		System.out.println("------------------------");
		
		//key를 이용해서value 구하기
		
		Integer num = map.get("지은탁");
		System.out.println("지은탁의 성적은 "+num);
		
		Integer num2 = map.get("강호동");
		System.out.println("강호동의 성적은 "+num2);
	
	}
	

}
