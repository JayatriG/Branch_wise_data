package BWD;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class student extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String branch=req.getParameter("branch");
		
		req.setAttribute("branch", branch);
		studentservice ss=new studentservice();
		//pw.println(ss.check(branch));
		List<studentpro> student_list = (ss.check(branch));
		req.setAttribute("stud", student_list);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/show.jsp");
		dispatcher.forward(req, resp);
	}
	

}
