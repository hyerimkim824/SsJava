package kr.s40.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;

public class UpdateMain {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql ="UPDATE test2 SET name=?,age=? WHERE id=?";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, "박문수");
			pstmt.setInt(2, 30);
			pstmt.setString(3,"wave");
			//JDBC 수행 4단계 : SQL문 실행
			 
			int count = pstmt.executeUpdate();
			System.out.println(count+"개 행의 정보를 수정햇습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt,conn);
			
		}
	}

}
