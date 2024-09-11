package kr.s47.jdbc.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopAdminMain {
	private BufferedReader br;
	private ShopDAO dao;
	//생성자
	public ShopAdminMain() {
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in));
			dao = new ShopDAO();
			//메뉴 호출
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	//메뉴
	public void callMenu()throws IOException{
		while(true) {
			System.out.print("1.상품등록,2.상품목록,3.회원목록,4.구매목록,5.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {//상품등록
					System.out.print("상품명:");
					String item_name = br.readLine();
					System.out.print("가격:");
					int price = Integer.parseInt(br.readLine());
					dao.insertItem(item_name, price);
				}else if(no == 2) {//상품목록
					dao.selectItems();
				}else if(no == 3) {//회원목록
					dao.selectCustomers();
					
				}else if(no == 4) {//구매목록
					dao.selectOrders();
					
				}else if(no == 5) {//종료
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
		new ShopAdminMain();
	}
}




