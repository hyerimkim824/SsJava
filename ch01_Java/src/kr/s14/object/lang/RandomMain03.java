package kr.s14.object.lang;
import java.util.Arrays;


public class RandomMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 길이가 6인 int형 배열을 생성하고 1~45 숫자 범위로 난수를 구함
		 * 중복되지 않은 6개의 숫자를 생성해서 배열에 저장하고 출력하시오.
		 * 난수 생성 : Math.random() 또는 Random 클래스의 nextInt()매서드사용
		 * 
		 */


		int[] lotto = new int[6];


		for(int i=0;i<=lotto.length-1;i++) {

			double ran = Math.random();
			int k = (int)(ran*45);//1~45 범위의 난수 발생
			//System.out.println(num);
			System.out.println(k);
			
			for(int j=0;i<j;j++) {
				if(lotto[i]==lotto[j]) {
					i--; //i 증가시키는 것을 못하게 한다.
					//i를 하나 줄어들게 함으로써 루프 돌때 새 숫자로 덮어 씌운다.
					break;
				}
			}
			
			Arrays.sort(lotto);
		

			//for(int num:lotto){
				//System.out.print(num +'\t');
			//}
	}
		

	}
}