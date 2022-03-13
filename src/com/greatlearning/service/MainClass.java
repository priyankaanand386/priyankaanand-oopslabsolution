package com.greatlearning.service;
import java.util.Scanner;

import com.greatlearning.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee employee;
		CredentialService credentialService = new CredentialService();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String employeeFirstName;
		String employeeLastName;
		String generatedPassword;
		String generatedEmail;
		System.out.println("Please Enter your department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		choice = sc.nextInt();
		String skipLine = sc.nextLine();
		System.out.println("Enter First Name");
		employeeFirstName = sc.nextLine();
		System.out.println("Enter Last name");
		employeeLastName = sc.nextLine();
		employee = new Employee(employeeFirstName,employeeLastName);
		generatedPassword = credentialService.generatePassword();
		switch(choice) {
			case 1:
				generatedEmail = credentialService.generateEmailAddress(employee, "tech");
				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;
			case 2:
				generatedEmail = credentialService.generateEmailAddress(employee, "admin");
				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;
			case 3:
				generatedEmail = credentialService.generateEmailAddress(employee, "hr");
				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;
			case 4:
				generatedEmail = credentialService.generateEmailAddress(employee, "legal");
				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;
			default:
				System.out.println("Invalid Department");
		}
		

	}

}
