package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class DetailAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 글 번호 반환
		long num = Long.parseLong(request.getParameter("num"));
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO boardVO = dao.getBoard(num);
		
		request.setAttribute("VO", boardVO);
		
		//JSP 경로 반환
			
		return "detail.jsp";
	}

}
