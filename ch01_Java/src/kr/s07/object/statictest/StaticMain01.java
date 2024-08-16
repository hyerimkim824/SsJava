package kr.s07.object.statictest;

public class StaticMain01 {

	public static void main(String[] args) {

	 StaticCount sc1 = new StaticCount();
	 //count는 static 공간에 올라가기 때문에 class를 직접 호출해야 한다.
	 System.out.println("c : "+sc1.c+", count :"+sc1.count);
	 
	 StaticCount sc2 = new StaticCount();
	 System.out.println("c : "+sc2.c+", count :"+sc2.count);
	 
	 StaticCount sc3 = new StaticCount();
	 System.out.println("c : "+sc3.c+", count :"+sc3.count);


	}
	



}
