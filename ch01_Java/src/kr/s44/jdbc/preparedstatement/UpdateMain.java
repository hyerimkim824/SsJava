package kr.s44.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;


public class UpdateMain {
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("번호:");
			int num = Integer.parseInt(br.readLine());
			
			System.out.print("이름:");
			String name = br.readLine();
			
			System.out.print("가격:");
			int price = Integer.parseInt(br.readLine());
			
			System.out.print("제고량:");
			int stock = Integer.parseInt(br.readLine());
			
			System.out.print("원산지:");
			String origin = br.readLine();
			
			
			System.out.println("---------------------------");
			
			//JDBC수행 1,2단계
			conn = DBUtil.getConnection();
			System.out.println("product 테이블 데이터를 수정합니다.");
			
			//SQL문 작성
			sql ="UPDATE product SET name=?,price=?,stock=?,origin=? WHERE num = ?";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생서
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.setInt(3, stock);
			pstmt.setString(4, origin);
			pstmt.setInt(5, num);

			//JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			System.out.println(count+"개 행의 정보를 수정했습니다.");
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt,conn);
			if(br!=null)try {br.close();}catch(IOException e) {};
			
		}
		
		
	}

}
