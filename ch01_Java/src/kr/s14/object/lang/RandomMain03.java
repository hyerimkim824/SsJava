package kr.s14.object.lang;

import java.util.Arrays;

public class RandomMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 길이가 6인 int형 배열을 생성하고 1~45 숫자 범위로
		 * 난수를 구함.
		 * 중복되지 않은 6개의 숫자를 생성해서 배열에 저장하고
		 * 출력하시오.
		 * 난수 생성:Math.random() 또는 Random 클래스의
		 * nextInt() 메서드 사용
		 */
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;//1번) 난수1~45
			
			//중복된 숫자가 있는지 검증
			for(int j=0;j<i;j++) {
				//1번에서 만들진 숫자를 0~i전까지 루프 돌면서 대조
				if(lotto[i] == lotto[j]) {
					i--;//중복되면 1번에서 만든 숫자를 불허
					    //i를 하나 줄어들게 함으로써 루프 돌때 새 숫자로
					    //덮어씌운다.
					break;
				}
			}			
		}
		
		Arrays.sort(lotto);//오름차순 정렬
		
		//배열의 요소 출력
		for(int num : lotto) {
			System.out.print(num + "\t");
		}
		
	}
}



