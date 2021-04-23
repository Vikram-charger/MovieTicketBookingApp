package com.vikram.cinema;

import java.util.Scanner;

public class Banner {
	static Scanner input = new Scanner(System.in);

	/**
	 * This method displays the welcome banner.
	 */
	public static void display() {
		System.out.println("================================");
		System.out.println("Welcome to BlackDragoon Cinemas:");
		System.out.println("================================");
		System.out.println("Movie Show categories available for you :D");
		showCategory(); // calling show category method.
	}

	/**
	 * This method displays the show category.
	 */
	public static void showCategory() {
		String[] categories = { "1. Gold (Rs.100)", "2. Platinum (Rs.150)", "3. Silver (Rs. 75)" };
		for (String i : categories) {
			System.out.println(i); // printing the categories.
		}
	}

	/**
	 * This method gets the user choice.
	 * 
	 * @return choice.
	 */
	public static int getUserChoice() {
		System.out.println("Pick your show :)");
		int choice = input.nextInt(); // getting user choices.
		return choice;
	}
}
