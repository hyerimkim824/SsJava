package kr.board.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardReplyVO;
import kr.controller.Action;
import kr.util.StringUtil;

public class WriteReplyAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Map<String, String> mapAjax = new HashMap<String,String>();
		
		HttpSession session = request.getSession();
		Long user_num = (Long)session.getAttribute("user_num");
		
		if(user_num ==null) {
			mapAjax.put("result", "logout");
		}else {
			//전송된 데이터 인코딩 처리
			request.setCharacterEncoding("utf-8");
			//자바빈(VO) 생성
			BoardReplyVO reply = new BoardReplyVO();
			reply.setMem_num(user_num);
			reply.setRe_content(request.getParameter("re_content"));
			reply.setRe_ip(request.getRemoteAddr());
			reply.setBoard_num(Long.parseLong(request.getParameter("board_num")));
			
			BoardDAO dao = BoardDAO.getInstance();
			dao.insertReplyBoard(reply);
			
			mapAjax.put("result", "success");
			
			 
		}
		
		//JSON 데이터로 변환
		
		
		return StringUtil.parseJSON(request, mapAjax);
		
		
	}

}
