package kr.news.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.controller.Action;
import kr.news.dao.NewsDAO;
import kr.news.vo.NewsVO;

public class DetailAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 글 번호 반환
		long num = Long.parseLong(request.getParameter("num"));
		
		NewsDAO dao = NewsDAO.getInstance();
		NewsVO vo = dao.getNews(num);
		
		request.setAttribute("NewsVO", vo);
		
		//JSP 경로 반환
			
		return "detail.jsp";
	}

}
