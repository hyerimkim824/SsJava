package kr.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//메소드를 만들면서 반복적인 요소를 제거할 수 있도록 한다.
//반복적인 요소는 다 static으로 처리

public class DBUtil {


	private static final String DB_DRIVER ="oracle.jdbc.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	private static final String DB_ID = "user001";//일반 계정
	private static final String DB_PASSWORD ="1234";

	//Connection 객체를 생성해서 반환
	public static Connection getConnection() throws ClassNotFoundException ,SQLException{

		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(DB_DRIVER);
		//JDBC 수행 2단계 : Connection 객체 생성

		return DriverManager.getConnection(DB_URL, DB_ID, DB_PASSWORD);


	}

	//JDBC 수행 5단계
	//Statement-> preparedStatement로 바꿔서 쓴다.
	public static void executeClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {

		if(rs!=null)try {rs.close();}catch(SQLException e) {}
		if(pstmt!=null)try {pstmt.close();}catch(SQLException e) {}
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
	
	//중복 정의
	//CallableStatement : 프로시저를 위해서
	public static void executeClose( CallableStatement cstmt, Connection conn) {

		
		if(cstmt!=null)try {cstmt.close();}catch(SQLException e) {}
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
}


