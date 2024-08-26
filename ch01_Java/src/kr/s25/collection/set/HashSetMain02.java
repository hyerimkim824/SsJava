package kr.s25.collection.set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class HashSetMain02 {
	
	public static void main(String[] args) {
		
		//로또 프로그램 작성
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<6) {
			
			Integer ir = (int)(Math.random()*45)+1; //1~45 난수 발생
			
			//중복값을 허용하지 않음
			hs.add(ir);
			
		}
		System.out.println(hs);
		System.out.println("------------------------");
		
		//HashSet->Set->Collection
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		
		//오름차순으로 정렬
		Collections.sort(list);
		for(int num : list) {
			System.out.print(num +"\t");
		}
	}

}
