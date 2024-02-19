package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TeamList;

/**
 * Servlet implementation class AddTeamServlet
 */
@WebServlet("/addTeamServlet")
public class AddTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddTeamServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String city = request.getParameter("city");
		String team = request.getParameter("team"); 
		String numPlayers = request.getParameter("num-players"); 
		String numWins = request.getParameter("num-wins"); 
		String numLosses = request.getParameter("num-losses");
		
		TeamList li = new TeamList(city, team, numPlayers, numWins, numLosses);
		TeamListHelper helper = new TeamListHelper();
		
		helper.insertTeam(li);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}
}
