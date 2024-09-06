package kr.s41.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.util.DBUtil;

public class SelectListMain {
	
	public static void main(String[] args) {
		//test3의 목록 작업
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			
			sql = "SELECT * FROM test3 ORDER BY num DESC";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			System.out.println("번호\t제목\t작성자\t등록일");
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("title"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.println(rs.getDate("reg_date"));
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(rs,pstmt, conn);

			
			
		}
	
		
	}

}
