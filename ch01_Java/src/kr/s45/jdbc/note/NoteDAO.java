package kr.s45.jdbc.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class NoteDAO {

	/*
	 * DAO : Data Access Object
	 * 		 데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체
	 */

	public void insertInfo(String name, String passwd, String subject,
			String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {

			//JDBC 수행 1,2 단계

			conn = DBUtil.getConnection();

			//SQL문 작성
			sql = "INSERT INTO note (num,name,passwd,subject,"
					+ "content,email,reg_date) VALUES (note_seq.nextval, ?,?,?,?,?, SYSDATE)";


			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3,subject);
			pstmt.setString(4,content);
			pstmt.setString(5,email);

			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 삽입했습니다.");


		}catch(Exception e) {
			e.printStackTrace();
		}finally {


			//JDBC 수행 5단계 : 자원정리

			DBUtil.executeClose(null,pstmt, conn);
		}
	}
	//목록 보기
	public void selectInfo() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			
			//SQL문 작성
			sql = "SELECT * FROM note ORDER BY num DESC";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			System.out.println("--------------------------");
			System.out.println("글번호 \t 이름 \t 작성일 \t 제목");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getDate("reg_date"));
				System.out.print("\t");
				System.out.println(rs.getString("subject"));						
			}
		
			System.out.println("--------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC수행 5단계 : 자원정리
		}



	}
	//상세글보기
	public int selectdetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		int count = 0; //행이 있는지 없는지
		
		try {
			
			
			//JDBC수행 1,2 단계
			
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM note WHERE num=?";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC수행 4단계 
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("글번호 : "+rs.getInt("num"));
				System.out.println("이름 : "+rs.getString("name"));
				System.out.println("비밀번호 : "+rs.getString("passwd"));
				System.out.println("제목 : "+rs.getString("subject"));
				System.out.println("내용 : "+rs.getString("content"));
				
				String email = rs.getString("Email");
				if(email ==null) email =""; //null을 인정하기 때문에
				
				System.out.println("이메일 :" + email);
				System.out.println("작성일 : "+ rs.getDate("reg_date"));
				
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

	//글 수정
	public void updateInfo(int num, String name, String passwd, 
			String subject, String content, String email) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		try {
			
						
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE note SET name =?,"
					+ " passwd =?, subject =?,content=?,email =? WHERE num=?";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			
			pstmt.setInt(6, num);
					
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
	//글삭제
	public void deleteInfo(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC수행 1,2 단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM note WHERE num =?";
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
