package kr.s14.object.lang;
import java.util.Random;


public class RandomMain01 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String[] gift = {"스마크폰","TV","냉장고","꽝"};

		// 0      1     2     3

		//난수 발생-정해져있지 않음 0.0 ~ 1.0 미만의 난수를 double형으로 반환

		double ran = Math.random();

		System.out.println("발생한 난수 : " + ran);

		int index = (int)(ran*4);//0~3 범위의 난수 발생

		System.out.println("정수로 변환된 난수 : " + index);

		System.out.println("오늘의 선물 : " + gift[index]);



		System.out.println("---------------------");



		String[] luck = {"귀인을 만남","해외여행 출발","로또 당첨","피곤한 하루"};

		//    0           1          2         3

		Random r1 = new Random();

		index = r1.nextInt(4);//0부터 인자로 전달된 값의 전 범위까지 난수 발생 0~3

		System.out.println("발생한 난수 : " + index);

		System.out.println("오늘의 운세 : " + luck[index]);

	}

}