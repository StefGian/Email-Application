import java.util.Random;
import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity = 500;
	private String alternateMailAddress;
	private String email;
	
	//Constructor
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		//Call method asking for the department and returning it
		this.department = askDepartment();
		System.out.println("Department: " + this.department);
		//Call method that generates a random password
		this.password = generatePass();
		System.out.println("Your password is: " + this.password);
		//Create email syntax
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + ".company.com";
		System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String askDepartment() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose department: \n1 for Sales\n2 for Developement\n3 for Accounting\n0 for none\n Enter department code: ");
		int departmentInput = scanner.nextInt();
		if (departmentInput == 1) {
			return "sales";
		}
		else if (departmentInput == 2) {
			return "dev";
		}
		else if (departmentInput == 3) {
			return "acct";
		}
		else
			return "";
	}
	
	//Generate a random password
	private String generatePass () {
		Random random = new Random();
		int randomNum = random.nextInt(10000);
		String randomPassword = String.valueOf(randomNum);
		return randomPassword;
	}
	
	//Set the mailbox capacity
	public void setMailCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternative mail
	public void setAlternateMail(String mail) {
		this.alternateMailAddress = mail;
	}
	
	//Set the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateMailAddress;
	}
	
	public String getPassword() {
		return password;
	}
}
