package com.grkp.sunbeam.demos;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	private int runs;
	private int wickets;

	public Cricketer() {
		// TODO Auto-generated constructor stub
	}

	public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets) {
		super(id, name, age, matchesPlayed);
		// TODO Auto-generated constructor stub
		this.runs = runs;
		this.wickets = wickets;
	}

	@Override
	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "[" + super.toString() + ", runs=" + this.runs + ", wickets=" + this.wickets + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (super.equals(obj)) {
			if (obj instanceof Cricketer) {
				Cricketer other = (Cricketer) obj;
				return runs == other.runs && wickets == other.wickets;
			}
		}
		return false;
	}

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
		System.out.println("Enter runs:");
		this.runs = sc.nextInt();
		System.out.println("Enter wickets:");
		this.wickets = sc.nextInt();
	}
}
