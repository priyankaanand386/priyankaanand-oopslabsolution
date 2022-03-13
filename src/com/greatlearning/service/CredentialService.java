package com.greatlearning.service;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	public String generatePassword() {
		Random random = new Random();
		
		String alphaUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphaLowerCase = "abcdefghijklmnopqrstuvwxyz";
		String numeric = "0123456789";
		String special = "!@#$%^";
		String allChars = alphaUpperCase + alphaLowerCase + numeric + special;
		
		String password = "";
				password += alphaUpperCase.charAt(random.nextInt(alphaUpperCase.length()));
				password += alphaLowerCase.charAt(random.nextInt(alphaLowerCase.length()));
				password += numeric.charAt(random.nextInt(numeric.length()));
				password += special.charAt(random.nextInt(special.length()));
				for(int i = 0; i < 4; i++) {
					password += allChars.charAt(random.nextInt(allChars.length()));
				}
		
		
		return password;
	} 
	public String generateEmailAddress(Employee employee, String department) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String employeeEmail = (firstName+lastName).toLowerCase();
		
		return employeeEmail+"@"+department+".abc.com";
	} 
	public void showCredentials(Employee employee, String email, String password) {
		System.out.println(
				"Dear " +employee.getFirstName()+ " your generated credentials are as follows\n" + 
				"Email --> " + email + "\n" +
				"Password --> " + password
		);
	} 
}
