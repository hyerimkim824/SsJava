package kr.s34.iostream.writer;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieMain {
	/*
	 * [실습]
	 * Movie
	 * 멤버변수 : 영화제목(name),제작연도(create_year),
	 *          감독(director),배우(actor),장르(genre),
	 *          상영시간(time)
	 * 멤버메서드 : get/set 메서드         
	 * 
	 * MovieMain
	 * 메뉴 : 1.영화정보입력,2.영화정보출력,3.파일생성,
	 *       4.파일읽기,5.종료
	 * 메서드명 : 메뉴 callMenu(),영화정보입력 inputMovie(),
	 *          영화정보출력 printMovie(),
	 *          파일 생성 writeFile(), 파일 읽기 readFile()
	 * 종료시 조건 체크
	 * 입력한 영화정보가 있습니다. 파일을 생성하기겠습니까?y,n          
	 */
	private ArrayList<Movie> list;
	private BufferedReader br;
	
	public MovieMain() {
		list = new ArrayList<Movie>();
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	//메뉴 호출
	public void callMenu()throws IOException{
		while(true) {
			System.out.print(
			 "1.영화정보입력,2.영화정보출력,3.파일생성,4.파일읽기,5.종료>");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					inputMovie();
				}else if(num == 2) {
					printMovie();
				}else if(num == 3) {
					createFile();
				}else if(num == 4) {
					readFile();
				}else if(num == 5) {
					if(list.size()>0) {
						System.out.print(
						"입력한 영화정보가 있습니다. 파일을 생성하시겠습니까?y/n:");
						String choice = br.readLine();
						if(choice.equals("y")) {
							createFile();
							System.out.println("영화정보관리를 종료합니다.");
							break;
						}else if(choice.equals("n")) {
							System.out.println("영화정보관리를 종료합니다.");
							break;
						}else {
							System.out.println("잘못 입력했습니다.");
						}
					}else {
						System.out.println("영화정보관리를 종료합니다.");
						break;
					}
				}else {
					System.out.println("[잘못 입력했습니다.]");
				}
			}catch(NumberFormatException e) {
				System.out.println("[숫자만 입력하세요]");
			}
		}
	}
	//영화정보 입력
	public void inputMovie()throws IOException{
		Movie m = new Movie();
		System.out.print("영화제목:");
		m.setName(br.readLine());
		System.out.print("제작연도:");
		m.setCreate_year(br.readLine());
		System.out.print("감독:");
		m.setDirector(br.readLine());
		System.out.print("배우:");
		m.setActor(br.readLine());
		System.out.print("장르:");
		m.setGenre(br.readLine());
		System.out.print("상영시간:");
		m.setTime(Integer.parseInt(br.readLine()));
		
		list.add(m);
		System.out.println("영화정보 1건을 등록했습니다.");
	}
	//영화정보 출력
	public void printMovie() {
		if(list.size()>0) {
			System.out.println("--------------------------------------");
			System.out.println("영화제목\t제작연도\t감독\t배우\t장르\t상영시간");
			System.out.println("--------------------------------------");
			for(Movie m : list) {
				System.out.print(m.getName() + "\t");
				System.out.print(m.getCreate_year() + "\t");
				System.out.print(m.getDirector() + "\t");
				System.out.print(m.getActor() + "\t");
				System.out.print(m.getGenre() + "\t");
				System.out.print(m.getTime() + "\n");
			}
		}else {
			System.out.println("출력할 영화정보가 없습니다.");
		}
	}
	//파일 생성
	public void createFile() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("movie.txt");
			
			fw.write("--------------------------------------\n");
			fw.write("영화제목\t제작연도\t감독\t배우\t장르\t상영시간\n");
			fw.write("--------------------------------------\n");
			
			for(Movie m : list) {
				fw.write(m.getName() + "\t");
				fw.write(m.getCreate_year() + "\t");
				fw.write(m.getDirector() + "\t");
				fw.write(m.getActor() + "\t");
				fw.write(m.getGenre() + "\t");
				fw.write(m.getTime() + "\n");
			}
			fw.flush();
			System.out.println(
					"파일에 영화정보를 저장했습니다.");
		}catch(IOException e) {
			System.out.println("파일에 영화정보 저장 오류 발생");
		}finally {
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
	//파일 읽기
	public void readFile() {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("movie.txt");
			while((readChar = fr.read())!=-1) {
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			System.out.println(
					"생성된 파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}finally {
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
	}	
	public static void main(String[] args) {
		new MovieMain();
	}
}



