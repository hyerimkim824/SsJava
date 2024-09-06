package kr.s40.jdbc.preparedstatement;

import java.sql.*;

import kr.util.DBUtil;


public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계 : 
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM test2 WHERE id=?";//?->메소드에 데이터 전달
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,"dragon");//1번 ?에 데이터 저장
			
			//JDBC 수행 4단계 : 
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt ,conn);
		}

	}

}
