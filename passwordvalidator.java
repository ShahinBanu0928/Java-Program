package backend2tasks;

public class passwordvalidator {

	public static void main(String[] args) {
		String password ="Yas0928@";
		//validate the password
		validatePassword(password);
	}
	public static void validatePassword(String password) {
		//check the length
		if(password.length()<8) {
			System.out.println("Password must be at least 8 characters long.");
		}
		//check upperCase,lowercase, digit, and special character
		if(!password.matches(".*[a-z].*")) {
			System.out.println("Password must contain at least one lowercase letter.");
		}
		if(!password.matches(".*[A-Z].*")) {
			System.out.println("Password must contain at least one uppercase letter.");
		}
		if (!password.matches(".*[0-9].*")) {
			System.out.println("Password must contain at least one digit.");
		}
		if(!password.matches(".*[!@#$%^&*].*")){
			System.out.println("Password must contain at least one special character.");
		}
		else {
			System.out.println("Password is valid.");
		}
	
	}
}


