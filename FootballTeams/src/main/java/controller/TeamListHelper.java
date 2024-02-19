/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Feb 5, 2024
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.TeamList;

/**
 * 
 */
public class TeamListHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("FootballTeams");
	
	public void insertTeam(TeamList team) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(team);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<TeamList> showAllTeams(){
		EntityManager em = emfactory.createEntityManager();
		List<TeamList> allItems = em.createQuery("SELECT i FROM TeamList i").getResultList();
		return allItems;
	}
	
	public TeamList searchForTeamById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager(); em.getTransaction().begin();
		TeamList found = em.find(TeamList.class, idToEdit); em.close();
		
		return found; 
	}
	
	public void deleteTeam(TeamList toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<TeamList> typedQuery = em.createQuery("select li from TeamList li where li.teamName = :selectedTeam", TeamList.class);
		
		typedQuery.setParameter("selectedTeam", toDelete.getTeamName());
		
		typedQuery.setMaxResults(1);
		TeamList result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public TeamList searchForTeamByName(String teamName) { // TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager(); em.getTransaction().begin();
		TypedQuery<TeamList> typedQuery = em.createQuery("select li from TeamList li where li.teamName = :selectedTeam", TeamList.class);
		
		typedQuery.setParameter("selectedTeam", teamName);
		
		typedQuery.setMaxResults(1);
		TeamList result = typedQuery.getSingleResult();
		
		em.close();
		
		return result; 
		}
	
	public void updateTeam(TeamList toEdit) {
		EntityManager em = emfactory.createEntityManager(); 
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit(); 
		em.close();
	}
}
