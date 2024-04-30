package com.grkp.sunbeam.demos;

import java.util.Scanner;

abstract public class Player {
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", matchesPlayed=" + this.matchesPlayed
				+ "]";
	}

	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Player) {
			Player p = (Player) obj;
			return this.id == p.id && this.name == p.name && this.matchesPlayed == p.matchesPlayed && this.age == p.age;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void accept(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter name:");
		this.name = sc.nextLine();
		System.out.println("Enter age:");
		this.age = sc.nextInt();
		System.out.println("Enter ID:");
		this.id = sc.nextInt();
		System.out.println("Enter no of matches played:");
		this.matchesPlayed = sc.nextInt();
	}

	public void display() {
		System.out.printf("Id: %d\nName: %s\nAge: %d\nMatches played: %d\n", this.id, this.name, this.age,
				this.matchesPlayed);
	}
}
