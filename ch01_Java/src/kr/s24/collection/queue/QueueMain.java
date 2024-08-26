package kr.s24.collection.queue;
import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		//Queue : 선입선출 FIFO(First-In First-Out) 자료 구조
		
		String[] array= {"서울","부산","대구","광주","인천"};
		
		LinkedList<String> st = new LinkedList<String>();
		//반복문을 이용해서 요소 저장
		
		for(int i=0;i<array.length;i++) {
			st.offer(array[i]);
		}
		//LinkedList에 저장된 요소의 목록
		System.out.println(st);
		System.out.println("-----------------------");
		
		//반복문을 이용한 요소의 출력
		while(st.peek() !=null) { //큐에 저장된 첫번째 요소 검색
			//큐에 저장된 요소를 반환하고 제거
		System.out.print(st.poll()+"\t");
		
		}
		System.out.println("\n---------------------");
		System.out.println(st);
	
	}
	
	

}
