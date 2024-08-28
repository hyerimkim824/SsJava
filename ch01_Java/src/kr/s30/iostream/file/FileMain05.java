package kr.s30.iostream.file;

import java.io.File;
public class FileMain05 {

	public static void main(String[] args) {
		
		String path = "C:\\javaWork\\javaSample";
		
		File f1 = new File(path);
		
		System.out.println("=======디렉토리 생성=========");
		
		System.out.println(f1.mkdir());
		
		
		  System.out.println("=======디렉토리 삭제=========");
		//디렉토리가 없거나 디렉토리의 안에 파일이 있으면 삭제 불가능
		if(f1.delete()) {
			System.out.println(f1.getName()+"디렉토리 삭제");
			
		}else {
			System.out.println("디렉토리를 삭제 할 수 없습니다.");
		
		}
	}
}
