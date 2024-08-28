package kr.s32.iostream.output;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamMain01 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		try {
			
			//파일 생성
			//덮어쓰기 방식
			//fos = new FileOutputStream("fileout.txt");
                                     //파일명,이어쓰기 여부(true->이어쓰기)
			//파일같은 경우 영구적으로 보관할 수 있기 때문에 
			//이러한 방식의 코드는 데이터가 많은 경우 처리하기 힘들다.
			fos = new FileOutputStream("fileout.txt",true);
			
			
			String message = "Hello File!! 파일에 내용 기술!!";
			          //String->byte[]
			fos.write(message.getBytes());
			System.out.println("파일을 생성하고 내용을 기숤했습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fos!=null)try {fos.close();}catch(IOException e){}
		}
		
	}
}
