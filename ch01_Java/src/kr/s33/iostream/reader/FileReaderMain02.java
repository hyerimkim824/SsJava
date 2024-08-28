package kr.s33.iostream.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain02 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String msg;
		try {
			fr = new FileReader("file.txt");
			br = new BufferedReader(fr);
			while((msg = br.readLine())!=null) {
				System.out.println(msg);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
	}
}




