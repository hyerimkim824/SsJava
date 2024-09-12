
package kr.s48.jdbc.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class BookDAO {
	
	//도서 등록
	
	public void insertBook(
			String bk_name,String bk_category) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO sbook (bk_num,bk_name,"
				+ "bk_category) VALUES (sbook_seq.nextval,?,?)";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, bk_name);
			pstmt.setString(2,bk_category);
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 도서를 등록했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//관리자, 사용자 도서 목록
	
	public void selectBooks() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();

			//SQL문 작성
			sql = "SELECT bk_num, bk_name, bk_category,bk_regdate, "
					+ "(SELECT get_book(bk_num) FROM dual) res_num"
					+ " FROM sbook ORDER BY bk_num DESC";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			System.out.println("----------------------------");
			if(rs.next()) {
				System.out.println("번호\t책이름\t카테고리\t등록일\t대출현황");
				do {
					System.out.print(rs.getInt("bk_num"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_name"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_category"));
					System.out.print("\t");
					System.out.print(rs.getDate("bk_regdate"));
					System.out.print("\t");
					System.out.println(rs.getInt("res_num"));
				}while(rs.next());
			}else {
				System.out.println("등록된 상품이 없습니다.");
			}
			System.out.println("----------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	
	//관리자 대출 목록 : 모든 회원에 대한 대출 도서 정보
	public void selectReservation() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql ="SELECT re_num,me_id,re_regdate,bk_name,bk_category "
					+ "FROM reservation JOIN sbook USING(bk_num) ORDER BY re_num DESC";
		
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("번호\t대출자ID\t책이름\t카테고리\t대출일");
				
				do {
					
					System.out.print(rs.getInt("re_num"));
					System.out.print("\t");
					System.out.print(rs.getString("me_id"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_name"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_category"));
					System.out.print("\t");
					System.out.println(rs.getDate("re_regdate"));
					
				}while(rs.next());
				
			}else{
				System.out.println("등록된 책정보가 없습니다.");
			}
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	
	//사용자 회원 등록
		public void insertMember(String me_id,
				String me_name,String me_phone) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				//JDBC 수행 1,2단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "INSERT INTO member (me_id,me_name,"
					+ "me_phone) VALUES (?,?,?)";
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
				//?에 데이터 바인딩
				pstmt.setString(1, me_id);
				pstmt.setString(2, me_name);
				pstmt.setString(3, me_phone);
		
				//JDBC 수행 4단계
				int count = pstmt.executeUpdate();
				System.out.println(
						count + "개의 회원 정보를 저장했습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//JDBC 수행 5단계 : 자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
		}
	
	//관리자 회원 목록
		
		public void selectMembers(){
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			
			try {
				
				//JDBC 수행 1,2 단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "SELECT * FROM member ORDER BY me_regdate DESC";
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
				
				//JDBC수행 4단계
				rs = pstmt.executeQuery();
				
				System.out.println("-----------------------------");
				
				if(rs.next()){
					System.out.println("아이디\t이름\t가입일\t전화번호");
					
					do{
						
						System.out.print(rs.getString("me_id"));
						System.out.print("\t");
						System.out.print(rs.getString("me_name"));
						System.out.print("\t");
						System.out.print(rs.getDate("me_regdate"));
						System.out.print("\t");
						System.out.println(rs.getString("me_phone"));
						
						
					}while(rs.next());
					
				}else {
					System.out.println("등록한 회원정보가 없습니다.");
				}
			System.out.println("-----------------------------");

			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//5단계 자원 정리
				DBUtil.executeClose(null, pstmt, conn);
				
			}
					
		}
		
		
		
		
	
	//사용자 회원 상세
		
		public void selectDetailMember(String me_id) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			try {
				
				//JDBC 수행 1,2단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "SELECT * FROM member WHERE me_id =?";
				
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
			
				//?에 데이터 바인딩
				pstmt.setString(1, me_id);
				
				//JDBC 수행 4단계
				
				rs = pstmt.executeQuery();
				System.out.println("---------------------------------------");
				
				if(rs.next()) {
					
					System.out.println("아이디 : "+rs.getString("me_id"));
					System.out.println("이름 : "+rs.getString("me_name"));
					System.out.println("전화번호 : "+rs.getString("me_phone"));
					System.out.println("가입일 : "+rs.getDate("me_regdate"));
		
					
				}else {
					System.out.println("검색된 회원정보가 없습니다.");
				}

				System.out.println("---------------------------------------");
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//JDBC 수행 5단계 : 자원정리
				DBUtil.executeClose(rs, pstmt, conn);
			}
			
		}
	
	//사용자 도서 대출
		
		public void insertReservation( String me_id, int bk_num) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				//JDBC 수행 1단계,2단계
				
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql ="INSERT INTO  reservation(re_num,re_status, me_id, bk_num,re_modifydate) "
						+ "VALUES (reservation_seq.nextval,(SELECT get_book(?) FROM re_book WHERE ROWNUM =1),?,?,SYSDATE)";
				
				//JDBC 수행 3단계
				
				pstmt = conn.prepareStatement(sql);
				
				//?에 데이터 바인딩
				pstmt.setInt(1,bk_num);
				pstmt.setString(2, me_id);
				pstmt.setInt(3, bk_num);
				
				//JDBC 수행 4단계
				int count = pstmt.executeUpdate();
				System.out.println(count+"개의 책을 대출했습니다.");
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
				//JDBC수행 5단계 : 자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
			

			
		}
		
		
	
	//사용자 대출 내역

		public void selectReservationById(String me_id) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			try {
				//JDBC 수행 1,2 단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "SELECT bk_num,re_status, re_regdate, bk_name, bk_category FROM reservation JOIN sbook "
						+ "USING(bk_num) WHERE me_id = ? ORDER BY re_num DESC";
				
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
				//?에데이터 바인딩
				pstmt.setString(1, me_id);
				
				rs  = pstmt.executeQuery();
				
				System.out.println("-----------------------------");
				System.out.println(me_id+"님의 대출내역");
				System.out.println("-----------------------------");
				
				if(rs.next()) {
					
					System.out.println("번호\t대출현황\t책이름\t책 카테고리\t대출일");
					do {
						System.out.print(rs.getInt("bk_num"));
						System.out.print("\t");
						System.out.print(rs.getInt("re_status"));
						System.out.print("\t");
						System.out.print(rs.getString("bk_name"));
						System.out.print("\t");
						System.out.print(rs.getString("bk_category"));
						System.out.print("\t");
						System.out.println(rs.getDate("re_regdate"));
						
					}while(rs.next());
					
					
				}else {
					System.out.println("등록된 책정보가 없습니다.");
				}
				//JDBC수행 4단계
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				
				//JDBC 수행 5단계 : 자원정리
				DBUtil.executeClose(rs, pstmt, conn);
			}
			}
		
		
	
	//대출하면->re_book list목록으로
		
		public void insertReservationBook(
				int bk_num) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				//JDBC 수행 1,2단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "INSERT INTO re_book (bk_num) VALUES (?)";
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
				//?에 데이터 바인딩
				pstmt.setInt(1, bk_num);
		
				//JDBC 수행 4단계
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 도서를 대출목록에 등록했습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//JDBC 수행 5단계 : 자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
		}
		
		//반닙하면->re_book list목록에서 지워진다.
		
		
		public void deleteReservation(
				int bk_num) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				//JDBC 수행 1,2단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "DELETE FROM reservation WHERE bk_num =? AND ROWNUM = 1";
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
				//?에 데이터 바인딩
				pstmt.setInt(1, bk_num);
		
				//JDBC 수행 4단계
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 도서를 반납했습니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//JDBC 수행 5단계 : 자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
		}
		
		public void deleteReservationBook(
				int bk_num) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				//JDBC 수행 1,2단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "DELETE FROM re_book WHERE bk_num =? AND ROWNUM = 1";
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);
				//?에 데이터 바인딩
				pstmt.setInt(1, bk_num);
		
				//JDBC 수행 4단계
				int count = pstmt.executeUpdate();
				//System.out.println(count + "개의 도서를 대출목록에서 제거했습니다..");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//JDBC 수행 5단계 : 자원정리
				DBUtil.executeClose(null, pstmt, conn);
			}
		}
		
		
	

}
