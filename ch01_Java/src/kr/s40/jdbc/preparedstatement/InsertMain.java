package kr.s40.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class InsertMain {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문장 작성
			//prepared state를 제공하는 메소드를 이용해서 데이터 전달
			//물음표마다 id, name, age전달
			sql="INSERT INTO test2 (id,name,age,reg_date) VALUES(?,?,?,SYSDATE)";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 3단계 : PrepaaredStatement 객체 생성
			
			pstmt.setString(1, "star's"); //1번 ?에 데이터 전달
			pstmt.setString(2, "홍길동"); //2번 ?에 데이터 전달
			pstmt.setInt(3, 50);//3번 ?에 데이터 전달
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			System.out.println(count+"개 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null,pstmt,conn);
			
		}
		
	
}

}
