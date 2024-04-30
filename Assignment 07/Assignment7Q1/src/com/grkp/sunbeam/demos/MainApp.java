package com.grkp.sunbeam.demos;

import static com.grkp.sunbeam.demos.MenuCode.menu;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int choice, counter;
		Scanner sc = new Scanner(System.in);
		Player[] cricketTeam = new Player[11];
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (cricketTeam[10] != null) {
					System.out.print("A team of 11 players already exists, do you want to recreate a team (y/n) ?:\t");
					if (sc.next().equalsIgnoreCase("y"))
						for (int i = 0; i < cricketTeam.length; i++)
							cricketTeam[i].accept(sc);
				} else
					for (int i = 0; i < cricketTeam.length; i++) {
						cricketTeam[i] = new Cricketer();
						cricketTeam[i].accept(sc);
					}
				break;
			case 2:
				if (cricketTeam[10] != null) {
					counter = 0;
					for (Player player : cricketTeam) {
						if (player instanceof Cricketer) {
							Cricketer c = (Cricketer) player;
							counter += c.getRuns();
						}
					}
					System.out.println("Runs scored: " + counter);
				} else
					System.out.println("Team is empty, add players...!");
				break;
			case 3:
				if (cricketTeam[10] != null) {
					counter = 0;
					for (Player player : cricketTeam) {
						if (player instanceof Cricketer) {
							Cricketer c = (Cricketer) player;
							counter += c.getMatchesPlayed();
						}
					}
					System.out.println("Wickets taken: " + counter);
				} else
					System.out.println("Team is empty, add players...!");
				break;
			case 4:
				if (cricketTeam[10] != null) {
					counter = 0;
					for (Player player : cricketTeam)
						counter += player.getMatchesPlayed();
					System.out.println("Total matches played by collective team members: " + counter);
				} else
					System.out.println("Team is empty, add players...!");
				break;
			case 5:
				if (cricketTeam[10] != null)
					if (cricketTeam[10] != null) {
						for (Player player : cricketTeam)
							System.out.println(
									"Name: " + player.getName() + "\nMatches played: " + player.getMatchesPlayed());
					} else
						System.out.println("Team is empty, add players...!");
				break;
			default:
				System.out.println("Invalid selection...!");
				break;
			}
		}
		System.out.println("Cricbuzz app is been terminated...!");
	}

}
