package backendtasks;

public class Reversenumber {

	public static void main(String[] args) {
		int number = 861;
		int reversed = 0;
		while(number!=0) {
			int digit = number%10; //print the last digit
			reversed = reversed*10 + digit; // Add it to reversed number
			number/=10; // remove the last digit from original number
			}
		System.out.println("Reversed number = " + reversed);
	}

}
