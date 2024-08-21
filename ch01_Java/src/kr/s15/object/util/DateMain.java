package kr.s15.object.util;
import java.util.Date;
import java.text.DateFormat; // 지정되어있는 포맷을 사용하고 싶다.
import java.text.SimpleDateFormat; //내가 포맷을 지정해서 사용하고 싶을때

public class DateMain {
	public static void main(String[] args) {
		Date now = new Date();
		
		//Date안의 class에서 toString을 재정의해서 참조변수주소가 아닌 날짜가 나온다.
		System.out.println(now);
		System.out.println(now.toString());
		System.out.println("------------------------");
		
		//deprecated 되어 사용하지 않음
		System.out.println(now.toLocaleString());//
		System.out.println("------------------------");
		
		DateFormat df = DateFormat.getInstance(); //객체를 생성해서 반환한다.
		//지금까지 객체생성할때는 new 생성자
		String today = df.format(now);
		System.out.println(today);
		System.out.println("-----------------------");
		
		df = DateFormat.getDateTimeInstance();
		today = df.format(now);
		System.out.println(today);
		
		System.out.println("-----------------------");
		df = DateFormat.getDateInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("-----------------------");
		
		df = DateFormat.getTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("------------------------");
		
		SimpleDateFormat sf = //SipleDateFormat을 사용하고 싶으면 new로 생성해야 한다.
				new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh:mm:ss");//4자리로 하고 한글도 사용해도 된다.
		today = sf.format(now); 
		System.out.println(today);
		
		
		
		
		
	}

}
