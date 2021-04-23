package com.vikram.cinema;

import com.vikram.utils.AgeCalculator;
import com.vikram.utils.DateTimeValidator;
import com.vikram.utils.PasswordValidator;

import java.time.LocalDate;
import java.util.Scanner;

public class Booking {
	static Scanner input = new Scanner(System.in);
	public static String name = "K.Vikram"; // Name of the user.
	public static String dob = "2000-03-13"; // Date of Birth.

	public static void main(String[] args) {
		long mobNo = 9003716350L;
		String password = "BangBa$3";
		int passwordLength = PasswordValidator.passWordLengthIdentifier(password); // getting the password length
		isValid(mobNo, password, passwordLength);
		Banner.display(); // display the banner.
		int choice = Banner.getUserChoice();
		bookTicket(choice);
	}

	/**
	 * This method books ticket and prints the ticket.
	 * 
	 * @param choice
	 */
	public static void bookTicket(int choice) {
		// TODO Auto-generated method stub
		if (choice == 1) {
			System.out.println("Thank you for selecting Gold Pack");
			int ticketCount = getNoOfTickets();
			String showDate = getDate();
			String showTime = getTime();
			LocalDate date = LocalDate.parse(showDate);
			int calculatedPrice = calculatePrice(ticketCount, choice);
			if (isSeniorCitizen(dob)) {
				int price = calculatedPrice / 2;
				if (DateTimeValidator.checkDate(date)) {
					printTicket(ticketCount, date, showTime, price);
				}
			}
			printTicket(ticketCount, date, showTime, calculatedPrice);

		}
		if (choice == 2) {
			System.out.println("Thank you for selecting Gold Pack");
			int ticketCount = getNoOfTickets();
			String showDate = getDate();
			String showTime = getTime();
			LocalDate date = LocalDate.parse(showDate);
			int calculatedPrice = calculatePrice(ticketCount, choice);
			if (isSeniorCitizen(dob)) {
				int price = calculatedPrice / 2;
				if (DateTimeValidator.checkDate(date)) {
					printTicket(ticketCount, date, showTime, price);
				}
			}
			printTicket(ticketCount, date, showTime, calculatedPrice);
		}
		if (choice == 3) {
			System.out.println("Thank you for selecting Gold Pack");
			int ticketCount = getNoOfTickets();
			String showDate = getDate();
			String showTime = getTime();
			LocalDate date = LocalDate.parse(showDate);
			int calculatedPrice = calculatePrice(ticketCount, choice);
			if (isSeniorCitizen(dob)) {
				int price = calculatedPrice / 2;
				if (DateTimeValidator.checkDate(date)) {
					printTicket(ticketCount, date, showTime, price);
				}
			}
			printTicket(ticketCount, date, showTime, calculatedPrice);
		}
	}

	/**
	 * This method checks the user is a senior citizen or not.
	 * 
	 * @param dob
	 * @return true or false.
	 */
	public static boolean isSeniorCitizen(String dob) { // checks the user is senior citizen or not.
		int age = AgeCalculator.calculateAge(dob);
		if (AgeCalculator.isSenior(age)) {
			return true;
		}
		return false;
	}

	/**
	 * This method calculates price with the GST.
	 * 
	 * @param ticketCount
	 * @param choice
	 * @return price
	 */
	public static int calculatePrice(int ticketCount, int choice) {
		// TODO Auto-generated method stub
		int price = 0;
		if (choice == 1) // if user choice is 1 we calculate the price by multiplying 10 with kilometer
							// to travel
			price = 100 * ticketCount;

		if (choice == 2) // if user choice is 2 we calculate the price by multiplying 15 with kilometer
							// to travel
			price = 150 * ticketCount;

		if (choice == 3) // if user choice is 3 we calculate the price by multiplying 20 with kilometer
							// to travel
			price = 75 * ticketCount;
		return price += (price * 7) / 100; // calculating overall price with GST 7%.

	}

	/**
	 * This method prints ticket with all the fields filled.
	 * 
	 * @param ticketCount
	 * @param date
	 * @param showTime
	 * @param price
	 */
	public static void printTicket(int ticketCount, LocalDate date, String showTime, int price) { // printing the
																									// ticket.
		// TODO Auto-generated method stub
		System.out.println("********************************");
		System.out.println("Name: " + name);
		System.out.println("Show Time : " + showTime);
		System.out.println("Show Date : " + date);
		System.out.println("Tickets Booked :" + ticketCount);
		System.out.println("Price : " + price);
		System.out.println("********************************");
	}

	/**
	 * This method gets the booking time from the user.
	 * 
	 * @return show time
	 */
	public static String getTime() {
		System.out.print("Time (HH:MM) :");
		String showTime = input.next();
		return showTime;
	}

	/**
	 * This method gets the booking date from the user.
	 * 
	 * @return show date.
	 */
	public static String getDate() {
		System.out.print("Date (yyyy-mm-hh) :");
		String showDate = input.next();
		return showDate;
	}

	/**
	 * This method gets the no of tickets.
	 * 
	 * @return no of tickets.
	 */
	public static int getNoOfTickets() {
		System.out.print("No of Tickets :");
		int noOfTickets = input.nextInt();
		return noOfTickets;
	}

	/**
	 * This method validates the login credentials.
	 * 
	 * @param mobNo
	 * @param password
	 * @param passwordLength
	 * @return message.
	 */
	public static String isValid(long mobNo, String password, int passwordLength) {
		if (PasswordValidator.validateLength(password, mobNo, passwordLength)) { // validates the credentials.
			return "LOGGING IN";
		}
		return "Failed to login, check again!";
	}

}
