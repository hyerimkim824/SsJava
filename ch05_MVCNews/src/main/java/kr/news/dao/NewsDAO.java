package kr.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import kr.news.vo.NewsVO;
import kr.util.DBUtil;

public class NewsDAO {
	
	//싱글턴 패턴
	private static NewsDAO instance = new NewsDAO();
	
	public static NewsDAO getInstance() {
		return instance;
	}
	private NewsDAO() {}
	
	//뉴스 등록
	public void registerNews(NewsVO vo)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			
			//커넥션 풀로부터 커넥션 할당
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO dailynews (num,title,writer,passwd,email,article,reg_date)"
					+ " VALUES (dailynews_seq.nextval,?,?,?,?,?,SYSDATE)";
			
			//PreparedStatement 객체 생성
			pstmt= conn.prepareStatement(sql);
			//?에 바인딩
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getPasswd());
			pstmt.setString(4 ,vo.getEmail());
			pstmt.setString(5, vo.getArticle());
			
			//SQL문 실행
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//뉴스 총 개수
	public int getCount()throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		String sql = null;

		try {

			//커넥션풀로부터 커넥션을 할당
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT COUNT(*) FROM dailynews";
			//PreparedStatment 객체 생성
			pstmt = conn.prepareStatement(sql);
			//SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}

		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}


		return count;
	}

	//뉴스 목록
	//글 목록
	public List<NewsVO> getList(int startRow, int endRow)
			throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<NewsVO> list = null;
		String sql = null;

		try {
			//커넥션풀로부터 커넥션을 할당
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM (SELECT a.*, rownum rnum FROM (SELECT * FROM dailynews JOIN smember "
					+ "USING(num) ORDER BY num DESC)a) WHERE rnum >=? AND rnum <=?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, startRow);//시작 행번호
			pstmt.setInt(2, endRow);//시작 행번호
			//SQL문 실행
			rs = pstmt.executeQuery();
			list = new ArrayList<NewsVO>();
			while(rs.next()) {
				NewsVO vo = new NewsVO();
				vo.setNum(rs.getLong("num"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setReg_date(rs.getDate("reg_date"));
				//자바빈을 ArrayList에 저장
				list.add(vo);
			}
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}		
		return list;
	}
	//뉴스 상세

	public NewsVO getNews(long num)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		NewsVO vo = null;
		String sql = null;

		try {
			//커넥션풀로부터 커넥션을 할당
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql =  "SELECT * FROM dailynews JOIN smember USING(num) "
					+ "WHERE num=?";
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setLong(1, num);
			//SQL문 실행
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new NewsVO();
				vo.setNum(rs.getLong("num"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setArticle(rs.getString("article"));
				vo.setReg_date(rs.getDate("reg_date"));
				
			}
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return vo;
		
	}
public void update(NewsVO vo)throws Exception{
		
		Connection conn=null;
		PreparedStatement pstmt =null;
		String sql = null;
		
		try {
			
			//커넥션풀로부터 커넥션을 반호나
			conn=DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE dailynews SET title=?, article=? WHERE num=?";
			//PreparedStatemenbt 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,vo.getTitle());
			pstmt.setString(2, vo.getArticle());
			pstmt.setLong(3,vo.getNum());
			//SQL문 실행
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
		
	}

//뉴스 삭제
public void delete(long num)throws Exception{
    Connection conn = null;
    PreparedStatement pstmt = null;
    String sql = null;
    try {
        //커넥션풀로부터 커넥션 할당
        conn = DBUtil.getConnection();
        //SQL문 작성
        sql = "DELETE FROM dailynews WHERE num=?";
        //PreparedStatement 객체 생성
        pstmt = conn.prepareStatement(sql);
        //?에 데이터 바인딩
        pstmt.setLong(1, num);
        //SQL문 실행
        pstmt.executeUpdate();

    }catch(Exception e) {
        throw new Exception(e);
    }finally {
        DBUtil.executeClose(null, pstmt, conn);
    }
}
}


