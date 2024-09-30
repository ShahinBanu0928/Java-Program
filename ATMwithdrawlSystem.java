package backend2tasks;

public class ATMwithdrawlSystem {

	public static void main(String[] args) {
		//predefined Account details
		int correctPin = 1234; //predefined Correct PIN
		double accountBalance = 1000.0; // Initial Balance of account
		double withdrawalAmount = 500.0; //Predefined withdrawal amount
		int enteredPin = 1234; 
		System.out.println("WELCOME TO THE ATM!");
		System.out.println("PIN Validating....");
		if(enteredPin == correctPin) {
			System.out.println("PIN Validation Successful");
			System.out.println("Attempting to withdraw $"+withdrawalAmount);
			if(accountBalance>=withdrawalAmount) {
				accountBalance-=withdrawalAmount;
				System.out.println("Transaction Successful!Please Take your Cash");
				System.out.println("Remaining Balance $"+accountBalance);
				}
			else {
		    	System.out.println("In Sufficient Balance");
		    	}
		}
		else {
			System.out.println("INCORRECT PIN.Access denied");
		}

	}

}
