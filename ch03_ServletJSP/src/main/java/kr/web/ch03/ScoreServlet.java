package kr.web.ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/score")
public class ScoreServlet extends HttpServlet{
	
	/*[실습] 성적처리
	 * [출력 예시]
	 * 국어 : 00
	 * 영어 : 00
	 * 수학 : 00
	 * 총점 : 000
	 * 평균 :00
	 * 등급 : A
	 * 
	 * 
	 * */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{


		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		
		out.println("<head><title>성적 처리</title></head>");
		out.println("<body>");
		
		
		
		int korean = Integer.parseInt(request.getParameter("korean"));
		int english = Integer.parseInt(request.getParameter("english"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		out.println("국어 : "+korean);
		out.println("<br>");
		out.println("영어 : "+english);
		out.println("<br>");
		out.println("수학 : "+math);
		out.println("<br>");
		
		int sum = korean+english+math;
		out.println("총점 : "+sum);
		out.println("<br>");
		
		double avg = sum/(3.0);
		out.printf("평균 : %.2f",avg);
		out.println("<br>");
		
		int gradeNum = (int)avg/10;
		
		out.print("등급 : ");
		if(gradeNum ==10){
			out.println("A");
		}else if(gradeNum==9){
			out.println("A");
		}else if(gradeNum==8){
			out.println("B");
		}else if(gradeNum==7){
			out.println("C");
		}else if(gradeNum==6){
			out.println("D");
		}else{out.println("F");}
		

		out.println("</body>");
		
		out.println("</html>");
		out.close();
		

		
	}	

}
