package kr.s07.object.statictest;

public class StaticCount {
	
	//인스턴스 변수 : 객체가 생성될 때 객체에 포함되는 변수
	int c;
	//static(클래스)변수
	static int count;
	//생성자
	public StaticCount() {
		c++;
		StaticCount.count++;
	}
	
	
	

}
