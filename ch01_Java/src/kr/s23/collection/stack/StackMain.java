package kr.s23.collection.stack;
import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//Stack : 후입선출 LIFO(Last-In First-Out)
		
		String[] array = {"진달래","백합","개나리","벚꽃","장미"};
		
		Stack<String> stk = new Stack<String>();
		for(int i =0;i<array.length;i++) {
			stk.push(array[i]);
			
		}
		System.out.println(stk);
		System.out.println("--------------------");
		//반복문을 이용한 요소의 출력
		
		while(!stk.isEmpty()) {//현재 stack이 비어있는지 검증
			System.out.println(stk.pop()+"\t"); //Stack에 저장된 객체를 꺼내옴
		}
		
		System.out.println("----------------");
		System.out.println(stk);
		
	}

}
