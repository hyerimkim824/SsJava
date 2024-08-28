package kr.s30.iostream.file;
import java.io.File;

public class FileMain03 {
	public static void main(String[] args) {
		//상대경로 지정
		String now_path = "sample.txt";//원래 파일명
		String new_path = "example.txt";
		
		File f1= new File(now_path);
		
		System.out.println("========파일명 변경========");
		File f2 = new File(new_path);
		
		//파일명 변경
		System.out.println(f1.renameTo(f2));
		
	}

}
