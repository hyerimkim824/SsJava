package exercise;
import java.util.Arrays;

public class excerciseRandom {
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
		int[] lotto = new int[6]; //int형 array 생성

		
		for(int i=0;i<=lotto.length-1;i++) {
			lotto[i] = (int)(Math.random()*45)+1;//1번) 난수1~45
			
			for(int j =0;j<=i;j++) {
				
				System.out.println(j);
				
				if(i==0) {
					break;
				}
				while(true) {
					
					if(lotto[j]==lotto[i]) {
						
						//System.out.println(lotto[j]);
						
						lotto[i] =(int)(Math.random()*45)+1;//1번) 난수1~45
						
					}else {
						break;
					}
				}
				

				
			}
			
			System.out.println(i);
			System.out.println(lotto[i]);
			
		}
		
		
		
	}

}
