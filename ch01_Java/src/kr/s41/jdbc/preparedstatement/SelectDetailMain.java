package kr.s41.jdbc.preparedstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class SelectDetailMain {
	public static void main(String[] args) {
		//test3의 상세 정보
		BufferedReader br = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("번호 : ");
			           //String ->int
			int num = Integer.parseInt(br.readLine());
			
			System.out.println("----------------------");
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM test3 WHERE num =?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4단계 : SQL문을 실행해서 결과행들을 ResultSet에 담아서 반환
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//행(레코드)가 존재하는 경우
				System.out.println("번호 : "+rs.getInt("num"));
				System.out.println("제목 : "+rs.getString("title"));
				System.out.println("작성자:"+rs.getString("name"));
				System.out.println("내용: "+rs.getString("memo"));
				
				//DB에 입력하지 않는 데이터는 null 반환하기 때문에
				//null를 비어있게 처리
				
				String email = rs.getString("email");
				if(email == null)email ="";
				
				System.out.println("이메일: "+email);
				System.out.println("작성일 : "+rs.getDate("reg_date"));
			}else {
				//행(레코드)이 없는 경우
				System.out.println("검색한 데이터가 없습니다.");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//JDBC 수행 5단계 : 자원정리
			DBUtil.executeClose(rs, pstmt,conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
		
	}

}
