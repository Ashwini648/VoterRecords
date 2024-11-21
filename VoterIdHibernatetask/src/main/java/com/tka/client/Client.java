package com.tka.client;

import java.util.Scanner;
import com.tka.controller.Controller;

public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controller controller = new Controller();

		boolean running = true;

		while (running) {
			System.out.println("=== Person Management System ===");
			System.out.println("1. Save Person");
			System.out.println("2. Get Person by Aadhar ID");
			System.out.println("3. Update Person");
			System.out.println("4. Delete Person by Aadhar ID");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// Save Person
				controller.savePerson();
				break;

			case 2:
				// Get Person by Aadhar ID
				controller.getPersonById();
				break;

			case 3:
				// Update Person
				controller.updatePerson();
				break;

			case 4:
				// Delete Person by Aadhar ID
				controller.deletePerson();
				break;

			case 5:
				// Exit
				System.out.println("Exiting system...");
				running = false;
				break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}