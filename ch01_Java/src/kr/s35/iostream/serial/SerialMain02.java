package kr.s35.iostream.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class SerialMain02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			
			fis = new FileInputStream("UserInfo.ser");
			ois = new ObjectInputStream(fis);
			
			//역직렬화 작업
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			System.out.println(list); //직렬화 하기 직전의 정보와 똑같다.
			
			//객체 직렬화는 여러 군데 사용한다.
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			if(ois!=null)try {ois.close();}catch(IOException e) {}
			if(fis!=null)try {ois.close();}catch(IOException e) {}
		}
	}
	
}
