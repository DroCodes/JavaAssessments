/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Feb 5, 2024
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="teams")
public class TeamList {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="CITY")
	private String city;
	@Column(name="TEAM")
	private String teamName;
	@Column(name="NUM_PLAYERS")
	private String numOfPlayers;
	@Column(name="WINS")
	private String numOfWins;
	@Column(name="LOSSES")
	private String numOfLosses;
	
	public TeamList() {
		super();
	}
	
	/**
	 * @param id
	 * @param city
	 * @param teamName
	 * @param numOfPlayers
	 * @param numOfWins
	 * @param numOfLosses
	 */
	public TeamList(String city, String teamName, String numOfPlayers, String numOfWins, String numOfLosses) {
		super();
		this.city = city;
		this.teamName = teamName;
		this.numOfPlayers = numOfPlayers;
		this.numOfWins = numOfWins;
		this.numOfLosses = numOfLosses;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getNumOfPlayers() {
		return numOfPlayers;
	}
	public void setNumOfPlayers(String numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	public String getNumOfWins() {
		return numOfWins;
	}
	public void setNumOfWins(String numOfWins) {
		this.numOfWins = numOfWins;
	}
	public String getNumOfLosses() {
		return numOfLosses;
	}
	public void setNumOfLosses(String numOfLosses) {
		this.numOfLosses = numOfLosses;
	}
	
	public String returnTeamDetails( ) {
		return this.city + " " + this.teamName + " " + this.numOfPlayers + " " + this.numOfWins + " " + this.numOfLosses;
	}
}
