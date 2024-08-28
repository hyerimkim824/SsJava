package kr.s32.iostream.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain02 {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			//자원정리
			if(bos!=null)try {bos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
		
	}

}
