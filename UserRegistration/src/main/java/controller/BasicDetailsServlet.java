package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProcessUser;

/**
 * Servlet implementation class BasicDetailsServlet
 */
@WebServlet("/BasicDetailsServlet")
public class BasicDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		ProcessUser user = new ProcessUser(firstName, lastName);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(user.printBasicDetails());
//		writer.close();
		
		request.setAttribute("userBasicDetails", user);
		getServletContext().getRequestDispatcher("/BasicResult.jsp").forward(request, response);
	}

}
