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
 * Servlet implementation class AdditionalInfoServlet
 */
@WebServlet("/AdditionalInfoServlet")
public class AdditionalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionalInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("phoneNumber");
		String address = request.getParameter("phoneNumber");
		String city = request.getParameter("phoneNumber");
		String state = request.getParameter("phoneNumber");
		
		ProcessUser user = new ProcessUser(phoneNumber, email, address, city, state);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(user.printAdditionalDetails());
//		writer.close();
		
		request.setAttribute("userAdditionalDetails", user);
		getServletContext().getRequestDispatcher("/DetailedResult.jsp").forward(request, response);
	}
}









