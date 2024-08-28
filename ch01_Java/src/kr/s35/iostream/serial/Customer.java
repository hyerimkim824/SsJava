package kr.s35.iostream.serial;

import java.io.Serializable;

/*
 * Serializable 인터페이스를 구현하면 해당 클래스는 객체 직렬화 대상이 되어
 * 언제든지 객체 직렬화를 수행할 수 있음.
 * Serializable 
 */

public class Customer  {
	
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
