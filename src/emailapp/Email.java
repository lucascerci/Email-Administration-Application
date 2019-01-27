package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		
		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);

		
		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	// Constructor to receive the first name and the last name
	
		// Ask for the department 
		private String setDepartment() {
			System.out.print("New worker: "+ firstName + ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if (depChoice == 1) {
				return "sales";
			}else if(depChoice == 2) {
				return "dev";
			}else if(depChoice == 3) {
				return "acct";
			}else {
				return "";
			}
		}
		// Generate a random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPKRSTUWXYZ0123456789!!#@$";
			char[] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
		
		// Set the mailbox capacity
		public void setMailBoxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		//Set the alternate email
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		
		// Change the password
		public void changePassword(String password) {
			this.password = password;
		}
		
		public String showInfo() {
			return "DISPLAY NAME: " +firstName+ " " + lastName +
					"\nCOMPANY EMAIL: " + email +
					"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		}
		
	public String getFirstName() {
			return firstName;
		}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}

	
	
	
}
