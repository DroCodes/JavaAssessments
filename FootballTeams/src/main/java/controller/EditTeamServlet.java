package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TeamList;

/**
 * Servlet implementation class EditTeamServlet
 */
@WebServlet("/editTeamServlet")
public class EditTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EditTeamServlet() {
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
		TeamListHelper helper = new TeamListHelper();
		String team = request.getParameter("name");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		TeamList teamToUpdate = helper.searchForTeamById(tempId);


		teamToUpdate.setTeamName(team);
		helper.updateTeam(teamToUpdate);
		getServletContext().getRequestDispatcher("/viewAllTeamsServlet").forward(request, response);
	}

}
