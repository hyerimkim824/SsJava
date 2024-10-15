package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	/*
	 * [실습]
	 * 5 + 7 = 12
	 * 
	 * */
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
	//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");
		          //String -> int
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int plus = num1+num2;
		
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>구구단</title></head>");
		out.println("<body>");
		
		out.println("덧셈 프로그램<br>");
		out.println(num1+"+"+num2+"="+plus+"<br>");
	
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	
	}	

}
