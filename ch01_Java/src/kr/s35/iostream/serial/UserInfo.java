package kr.s35.iostream.serial;

import java.io.Serializable;

public class UserInfo implements Serializable {
	private String name;
	private int age;
	private String address;
	
	//생성자
	public UserInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "이름 : "+name+"나이:"+age+"주소:"+address;
	}

}
