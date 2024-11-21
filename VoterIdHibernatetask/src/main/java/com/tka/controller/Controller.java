package com.tka.controller;

import java.util.Scanner;
import com.tka.entity.Person;
import com.tka.service.Service;

public class Controller {

	private final Service service = new Service();
	private final Scanner scanner = new Scanner(System.in);

	public void savePerson() {
		System.out.print("Enter Aadhar ID: ");
		int aadharId = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Voter ID: ");
		String voterId = scanner.nextLine();

		System.out.print("Enter Constituency: ");
		String constituency = scanner.nextLine();

		System.out.print("Enter Address Pincode: ");
		int pincode = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Address City Name: ");
		String cityName = scanner.nextLine();

		System.out.println("Person saved successfully!");
	}

	public void getPersonById() {
		System.out.print("Enter Aadhar ID to fetch: ");
		long getId = scanner.nextLong();

		Person fetchedPerson = service.getPersonById(getId);

		if (fetchedPerson != null) {
			System.out.println("Person Details: " + fetchedPerson);
		} else {
			System.out.println("No person found with Aadhar ID: " + getId);
		}
	}

	public void updatePerson() {
		System.out.print("Enter Aadhar ID to update: ");
		int updateId = scanner.nextInt();
		scanner.nextLine();

		Person existingPerson = service.getPersonById(updateId);

		if (existingPerson != null) {
			System.out.print("Enter new Name: ");
			String newName = scanner.nextLine();
			existingPerson.setName(newName);

			System.out.print("Enter new Voter Constituency: ");
			String newConstituency = scanner.nextLine();
			existingPerson.getVoter().setConstituency(newConstituency);

			service.updatePerson(existingPerson);
			System.out.println("Person updated successfully!");
		} else {
			System.out.println("No person found with Aadhar ID: " + updateId);
		}
	}

	public void deletePerson() {
		System.out.print("Enter Aadhar ID to delete: ");
		long deleteId = scanner.nextLong();
		service.deletePerson(deleteId);
		System.out.println("Person deleted successfully (if existed)!");
	}

	public void closeController() {
		service.closeService();
		scanner.close();
	}
}
