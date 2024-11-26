package kr.news.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kr.controller.Action;
import kr.news.dao.NewsDAO;
import kr.news.vo.NewsVO;

public class DeleteAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
		
		request.setCharacterEncoding("utf-8");
		//전송된 데이터 반환
		
		long num = Long.parseLong(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		
		NewsDAO dao = NewsDAO.getInstance();
		NewsVO db_news = dao.getNews(num);
		boolean check = false;
		
		if(db_news!=null) {
			//비밀번호 일치 여부 체크
			check = db_news.isCheckedPassword(passwd);
		}
		if(check) {
			dao.delete(num);
		}
		request.setAttribute("check", check);
		
		//JSP 경로 바환
		return "delete.jsp";
	
	}
	

}
