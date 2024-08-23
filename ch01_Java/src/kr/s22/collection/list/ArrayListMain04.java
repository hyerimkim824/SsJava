package kr.s22.collection.list;
import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("강호동");//0
		list.add("유재석");//1
		list.add("박미선");//2
		list.add("박명수");//3
		list.add("강호동");//4 //중복 되어도 상관없다.
		
		//반복문을 이용한 요소의 출력
		for(int i =0;i<list.size();i++) {
			String name = list.get(i);
			System.out.println(i +" : "+name);
		}
		System.out.println("------------------------");
		
		//요소의 삭제
		//list.remove(2); //인덱스
		list.remove("강호동"); //요소 //중복되어있을 때에는 앞에서부터 삭제
		
		for(int i =0;i<list.size();i++) {
			String name = list.get(i);
			System.out.println(i +" : "+name);
		}
		System.out.println("------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(40);
		list2.add(2);
		list2.add(3);
		list2.add(40);
		
		
		for(int i =0;i<list2.size();i++) {
			Integer num = list2.get(i);
			System.out.println(i +" : "+num);
		}
		System.out.println("------------------------");
		
		
		list2.remove(2);
		//list2.remove(40);
		
		//요소가 중복되어 있을 경우 앞에서부터 하나만 삭제됨
		
		                     //int->Integer
		list2.remove(Integer.valueOf(40));
		
		for(int i =0;i<list2.size();i++) {
			Integer num = list2.get(i);
			System.out.println(i +" : "+num);
		}
		System.out.println("------------------------");
		
		
		//요소의 변경
		list2.set(1,30);
		
		for(int i =0;i<list2.size();i++) {
			Integer num = list2.get(i);
			System.out.println(i +" : "+num);
		}
		System.out.println("------------------------");
		
		
	}

}
