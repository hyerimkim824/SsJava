package kr.s44.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class InsertMain {
	
	public static void main(String[] args) {
		
		
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("상품명 : ");
			String name = br.readLine();
			System.out.print("가격 : ");
			int price = Integer.parseInt(br.readLine());
			System.out.print("재고수 : ");
			int stock = Integer.parseInt(br.readLine());
			System.out.print("원산지 : ");
			String origin = br.readLine();
			
			//JDBC 수행 1,2단계
			
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			
			sql = "INSERT INTO product (num,name,price,stock,"
					+ "origin,reg_date) VALUES (product_seq.nextval,?,?,?,?,SYSDATE)";
			//JDBC 수행 3단계
			
			//JDBC 수행 3단계 : PreparedStatement(sql);
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setString(1,name);
			pstmt.setInt(2, price);
			pstmt.setInt(3, stock);
			pstmt.setString(4, origin);
			
	
			//JDBC 수행 4단계
			
			int count = pstmt.executeUpdate();
			System.out.println(count +"개의 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt,conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
			
		}
	}

}
