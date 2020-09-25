package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.EligibilityCheck;
//import utility.EligibiltyCheck;

@WebServlet(urlPatterns= {"/eligiblemain"})
public class Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EligibilityCheck obj=new EligibilityCheck();
		String points=request.getParameter("points");
		boolean spaceEligible=obj.checkQuizAnswer(points);
	    if(!spaceEligible)
	    {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
