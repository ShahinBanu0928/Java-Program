package backendtasks;

public class primenumberchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2; // Predefined number to check
        int count = 0;  // To count the number of divisors
        
        if (number > 1) {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++; // Count the number of divisors
                }
            }
        }
        
        // Check if the number is prime (only has 2 divisors: 1 and itself)
        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}