package kr.s46.jdbc.car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

//DAO : Data Access Object
//      데이터베이스의 데니터를 전문적으로 호출하고 제어하는 객체

public class CarDAO {
	//자동차정보등록
	public void insertCar(String name, String color, String maker, int price) {
		
		Connection conn =null;
		PreparedStatement pstmt =null;
		String sql = null;
		try {
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO car (num,name, color,maker,price,reg_date) VALUES (car_seq.nextval,"
					+ "?,?,?,?, SYSDATE)";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, color);
			pstmt.setString(3, maker);
			pstmt.setInt(4, price);
			
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count+"개 행을 삽입했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원 정리
			DBUtil.executeClose(null,pstmt, conn);
			
		}
	}
	//목록보기
	
	public void selectCar() {
		
		//번호,이름,제조사,등록일
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			
			//SQL문 작성
			sql = "SELECT * FROM car ORDER BY num DESC";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			System.out.println("-----------------------------------");
			System.out.println("번호 \t 이름 \t 제조사 \t 등록일");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getString("maker"));
				System.out.print("\t");
				System.out.println(rs.getDate("reg_date"));
		
				}
			
			System.out.println("-----------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC수행 5단계 : 자원정리
			
			DBUtil.executeClose(rs,pstmt, conn);
		
		}
		
		
		
	}
	//상세정보
	public int selectDetailCar(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		int count = 0; //행이 있는지 없는지
		
		try {
			
			
			//JDBC수행 1,2 단계
			
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM car WHERE num=?";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC수행 4단계 
			rs = pstmt.executeQuery();
			
			//번호, 이름,색상,제조사,가격,등록일
			if(rs.next()) {
				System.out.println("번호 : "+rs.getInt("num"));
				System.out.println("이름 : "+rs.getString("name"));
				System.out.println("색상 : "+rs.getString("color"));
				System.out.println("제조사 : "+rs.getString("maker"));
				System.out.println("가격 : "+rs.getInt("price"));
				System.out.println("등록일 : "+ rs.getDate("reg_date"));
				
				count = 1; //레코드가 존재할 때 1저장

				
			}else {
				System.out.println("검색된 정보가 없습니다.");
				count = 0;
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(rs,pstmt, conn);
			
		}
		return count;
	}
		

	
	//정보수정
	
	public void updateCar(int num, String name, String color, String maker, int price) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		try {
			
						
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE car SET name =?,"
					+ " color =?, maker =?,price=? WHERE num=?";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, color);
			pstmt.setString(3, maker);
			pstmt.setInt(4, price);
			
			pstmt.setInt(5, num);
					
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 수정했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			
			DBUtil.executeClose(null, pstmt,conn);
		}
	
	}
	//정보삭제
	public void deleteCar(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC수행 1,2 단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM car WHERE num =?";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 삭제했습니다.");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null,pstmt, conn);
		}

		
	}

}
