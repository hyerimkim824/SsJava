package kr.s39.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	
	public static void main(String[] args) {
		
		String db_driver ="oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String db_id = "user001";//일반 계정
		String db_password ="1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			//JDBC 수행 2단계 : Connection 객체 생성(오라클 접속 인증)
			
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			
			//SQL문 작성
			sql ="INSERT INTO test1(id,age) VALUES ('s''t',50)";
			//보안을 위해서 이렇게 데이터를 직접 입력하는 것은 안좋다.
			
			//JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행 4단계 : SQL문 실행해서 하나의 행을 삽입
			//삽입 작업 후 삽입한 행의 개수를 반환
			
			//commit을 명시 안해도 자바에서 알아서 처리해준다.(1문장일때)
			int count = stmt.executeUpdate(sql);
			System.out.println(count +" 개의 행을 추가했습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//JDBC 수행 5단계 : 자원 정리
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
			
		}
		
		
		
	}

}
