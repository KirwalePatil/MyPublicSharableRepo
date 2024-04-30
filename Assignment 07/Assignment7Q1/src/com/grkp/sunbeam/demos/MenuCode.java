package com.grkp.sunbeam.demos;

import java.util.Scanner;

public final class MenuCode {
	public static int menu(Scanner sc) {
		System.out.printf(
				"0. EXIT\n1. Accept a cricket team details\n2. Display total runs scored by team\n3. Display total wickets taken by team"
						+ "4. Display sum of matches played by players of team\n5. Display matches played by individual player\nChoose a option amongst above:\t");
		return sc.nextInt();
	}
}
