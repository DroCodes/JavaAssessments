

import java.util.List;
import java.util.Scanner;

import controller.TeamListHelper;
import model.TeamList;

public class StartProgram {

		static Scanner in = new Scanner(System.in);
		static TeamListHelper tlh = new TeamListHelper();

		private static void addATeam() {
			System.out.print("Enter the teams city: ");
			String city = in.nextLine();
			
			System.out.print("Enter a team: ");
			String team = in.nextLine();
			
			System.out.print("Enter the number of players: ");
			String numOfPlayers = in.nextLine();
			
			System.out.print("Enter the number wins: ");
			String numOfWins = in.nextLine();
			
			System.out.print("Enter the number losses: ");
			String numOfLosses = in.nextLine();
			
			TeamList toAdd = new TeamList(city, team, numOfPlayers, numOfWins, numOfLosses);
			tlh.insertItem(toAdd);
		}

		private static void deleteATeam() {
			System.out.print("Enter a team to be deleted: ");
			String team = in.nextLine();
			
			TeamList findTeam = tlh.searchForTeamByName(team);
			
			tlh.deleteTeam(findTeam);
		}

		private static void editATeam() {
			// TODO Auto-generated method stub
			System.out.println("Enter team to edit");
			String searchTeam = in.nextLine();
			
			TeamList foundTeams;
			
			foundTeams = tlh.searchForTeamByName(searchTeam);

			if (foundTeams != null) {
				System.out.println("Found Results.");

				System.out.println("update team");
				String update = in.nextLine();
				
				foundTeams.setTeamName(update);

				tlh.updateTeam(foundTeams);

			} else {
				System.out.println("---- No results found");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean isDone = false;

			while (!isDone) {
				System.out.println("*  Select an action");
				System.out.println("*  1 -- Add a team");
				System.out.println("*  2 -- Edit a team");
				System.out.println("*  3 -- Delete a team");
				System.out.println("*  4 -- View the team list");
				System.out.println("*  5 -- Exit");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addATeam();
				} else if (selection == 2) {
					editATeam();
				} else if (selection == 3) {
					deleteATeam();
				} else if (selection == 4) {
					viewTeamList();
				} else {
//					lih.cleanUp();
					System.out.println("   Goodbye!   ");
					isDone = true;
				}

			}

		}

		private static void viewTeamList() {
			List<TeamList> allTeams = tlh.showAllTeams();
			
			for(TeamList singleTeam : allTeams){
				System.out.println(singleTeam.returnTeamDetails()); 
			}
		}
	}