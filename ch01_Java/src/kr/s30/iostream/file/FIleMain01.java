package kr.s30.iostream.file;
import java.io.File;

public class FIleMain01 {
	
	public static void main(String[] args) {
		String path = "C:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		//지정한 디렉토리의 하위디렉토리와 파일에 대한 정보를 File 배열에 반환
		File[] files = f.listFiles();
		for(int i =0; i<files.length;i++) {
			File f2 = files[i];
			if(f2.isDirectory()) {      //디렉토리명 or 파일명
				System.out.println("["+f2.getName()+"]");
			}else {
				System.out.println(f2.getName());
				System.out.println();
				
			}
		}
		
	}

}
