package kr.s39.jdbc.statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
	
	public static void main(String[] args) {
		
		String db_driver ="oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String db_id = "user001";//일반 계정
		String db_password ="1234";
		
		//테이블을 만들거기 때문에 반드시 try~catch~finally 구조 필요하다.
		
		Connection conn = null;
		Statement stmt = null;
		String sql = "";
		
		try {
			
			//JDBC 수행 1단계 : 드라이버 로드(메모리에 로드)
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체 생성(오라클 접속을 위한 인증)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			System.out.println("test1 테이블을 생성합니다.");
			
			/*
			 * 테이블을 생성하는 SQL문
			 * 접속한 계정에 테이블명이 중복되면 에러가 발생하기 때문에
			 * 동일 계정에서는 한 번만 수행
			 */
			
			sql ="create table test1 (id varchar2(10),age number)";//; 넣으면 안된다.
			
			//JDBC 스헹 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행 4단계 : SQL문을 실행해서 DB에 테이블을 생성
			
			stmt.executeUpdate(sql);
			
			System.out.println("테이블이 정상적으로 생성되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			
			//JDBC 수행 5단계 : 자원 정리
			if(stmt != null)try {stmt.close();}catch(SQLException e){}
			if(conn !=null)try {conn.close();}catch(SQLException e){}
				
			}
			
		}
		
	}


