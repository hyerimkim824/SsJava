package kr.s43.jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement; //sql문장을 한개만 처리
import java.sql.SQLException;

import kr.util.DBUtil;

public class TransactionMain {
	
	public static void main(String[] args) {
		Connection conn =null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		String sql = null;
		try {
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//트랜잭션을 수동 처리하기 위해 auto commit 해제
			//자바에서 트랜잭션 처리는 기본이 auto commit으로 설정되어 있음. 
			//auto commit은 SQL문이 하나일 때는 사용 가능하지만  SQL문이
			//여러개 있을 경우 수동으로 변경해서 트랜잭션 처리해야 함 
			
			//한문장이라도 틀릴 수 있기 때문에 auto commmit을 해제
			conn.setAutoCommit(false);
			
			sql = "INSERT INTO test1 VALUES ('한국',10)";
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.executeUpdate();
			
			sql = "INSERT INTO test1 VALUES ('영국',20)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			
			//테스트용으로 오류가 있는 SQL문 작성
			sql = "INSERT INTO test1 VALUES ('중국',30"; 
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();
			
			//정상적으로 작업이 완료되면 commit
			//즉, 모든 문장이 완벽하게 끝아야지 commit을 한다.

			conn.commit();
			System.out.println("작업 완료!");			

			
		}catch(Exception e) {
			e.printStackTrace();
			//예외가 발생했을 경우 rollback
			try {
				conn.rollback();
				
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt3,null);
			DBUtil.executeClose(null, pstmt2,null);
			DBUtil.executeClose(null, pstmt1,conn);
			
			
		}
	}

}
