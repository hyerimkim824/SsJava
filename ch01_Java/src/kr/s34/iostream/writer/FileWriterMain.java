package kr.s34.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("fileWriter.txt");
			
			String message = "안녕하세요 FileWriter 테스트";
			fw.write(message);
			fw.flush();
			
			System.out.println("파일을 생성하고 내용을 기술");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
}




