package kr.s35.iostream.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class CustomerMain02 {
	
	public static void main(String[] args) {
		System.out.println("=====객체 역직렬화====");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("object.ser");
			ois = new ObjectInputStream(fis);
			//역직렬화 수행
			Customer m = (Customer)ois.readObject();
			System.out.println(m);
			
			
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
