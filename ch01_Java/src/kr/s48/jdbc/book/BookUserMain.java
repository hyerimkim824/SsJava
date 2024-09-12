package kr.s48.jdbc.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.s47.jdbc.shop.ShopDAO;
import kr.s47.jdbc.shop.ShopUserMain;

public class BookUserMain {
	
	private BufferedReader br;
	private BookDAO dao;

	//수행해야 할 작업
	//메뉴 : 회원가입, 회원정보, 도서대출, MY대출 목록, 대출도서 반납,종료
	
	//생성자
	public BookUserMain() {

		try {
			
			br = new BufferedReader(
					new InputStreamReader(System.in));
			dao = new BookDAO();
			//메뉴 호출
			callMenu();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	public void callMenu()throws IOException{
		while(true) {
			System.out.print("1.회원가입,2.회원정보,3.도서대출,4.MY대출 목록,5.대출도서 반납,6.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {//회원가입
					System.out.print("아이디:");
					String me_id = br.readLine();
					System.out.print("이름:");
					String me_name = br.readLine();
					System.out.print("전화번호:");
					String me_phone = br.readLine();
			
					dao.insertMember(me_id, me_name, me_phone);
					
				}else if(no == 2) {//회원정보
					//사용자가 id입력하면 본인의 회원 정보를 볼 수 있도록
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					dao.selectDetailMember(me_id);
					
				}else if(no == 3) {//책 대출
					//책 내역 확인.
					dao.selectBooks();
					System.out.println("--------------------------");
					System.out.println("대출할 도서 번호 : ");
					int bk_num = Integer.parseInt(br.readLine());
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					dao.insertReservation(me_id,bk_num);
					dao.insertReservationBook(bk_num);}
					
				else if(no == 4) {//책 대출 내역
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					dao.selectReservationById(me_id);
					
				}else if(no == 5) {//책 반납
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					dao.selectReservationById(me_id);
					System.out.print("반납할 책 번호 : ");
					int bk_num = Integer.parseInt(br.readLine());
					dao.deleteReservationBook(bk_num);
					dao.deleteReservation(bk_num);
					
			
				}else if(no == 6) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("[숫자만 입력 가능]");
			}
		}
	}

	public static void main(String[] args) {
		new BookUserMain();
	}
	
	
}
