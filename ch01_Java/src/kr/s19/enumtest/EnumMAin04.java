package kr.s19.enumtest;

enum Item{ //Item : 열거 타입
	ADD,DEL,SEARCH,CANCEL //문자열 상수!!
	
}

public class EnumMAin04 {
	public static void main(String[] args) {
		
		//values() 메서드는 열거 타입의 모든 열거 객체들을 배열로 만들어서 반환
		
		Item[] items = Item.values();
		System.out.println("item.length : "+items.length);
		
		//저장되어 있는 정수값(순서값)을 확인할 수 있음
		
		for(Item n : items) {
			System.out.println(n+" : "+n.ordinal());
		}
		System.out.println("--------------------");
		
		//개별출력
		System.out.println(Item.ADD +", "+Item.ADD.ordinal());
		System.out.println(Item.DEL +", "+Item.DEL.ordinal());
		System.out.println(Item.SEARCH +", "+Item.SEARCH.ordinal());
		System.out.println(Item.CANCEL +", "+Item.CANCEL.ordinal());
		
		
		
		
	}

}
