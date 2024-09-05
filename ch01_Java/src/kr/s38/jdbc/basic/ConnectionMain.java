package kr.s38.jdbc.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
	
	public static void main(String[] args) {
		
		String db_driver ="oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String db_id = "user001";//일반 계정
		String db_password ="1234";
		
		try {
			Class.forName(db_driver);//특수한 클래스여서 생성자를 통해서 드라이버에 올라가는 것이 아니라 다른 방식으로 올린다.
			//즉 driver는 일반 class와 다르다.
			//java<->오라클
			//Connetion 객체 생성
			Connection conn = DriverManager.getConnection(db_url,db_id,db_password);
			System.out.println("Connection 객체가 생성되었습니다.");
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
