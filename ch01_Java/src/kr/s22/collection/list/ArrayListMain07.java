package kr.s22.collection.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ArrayListMain07 {
	
	/*
	 * [실습]
	 * 로또 프로그램 제작
	 * 1~45까지 중복되지 않는 6개의 숫자를 구해서 ArrayList에 저장하고 출력하시오.
	 * (오름 차순으로 정렬하시오)
	 * 난수 생성 : math.random() 또는 Random 클래스의 nextInt() 메서드 사용
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i =0; i<=5;i++) {
			
			int random_num = (int)(Math.random()*45)+1;//1번) 난수1~45;
			
			boolean f = lotto.contains(random_num);//중복 체크
			if(f==false) {
			lotto.add(random_num);
			}else {
				i--;
			}
			
			}
		
		//오름차순 정렬
		Collections.sort(lotto);
		System.out.println(lotto);
		
	}

}
