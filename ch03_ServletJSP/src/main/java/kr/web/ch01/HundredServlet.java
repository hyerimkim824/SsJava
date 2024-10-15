package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hundred")
public class HundredServlet extends HttpServlet{
	/*
	 * [실습] 1부터 100까지의 합 출력(반복문 활용)
	 * [출력예시]
	 * <body>
	 * 
	 * 
	 * 1부터 100까지의 합은 5050
	 * </body>
	 * 
	 * 
	 * */
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		
		int num =0;
		for(int i =0; i<=100; i++) {
			num+=i;
		}
		
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
        out.println("<html>");
        out.println("<head><title>1부터 100까지의 합 출력</title></head>");
        out.println("<body>");
        out.println("1부터 100까지의 합은 : " + num);
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

		
		
	
	
}
