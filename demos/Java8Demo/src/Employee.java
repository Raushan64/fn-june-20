import java.util.Date;

public class Employee {
	
	String firstName;
	String lastName;
	Date joinDate;
	
	public Employee(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	}
	public String toString() {
	return firstName + " " + lastName;
	}
	// getters and setters
}
