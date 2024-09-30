package backend2tasks;

public class FibonacciSeriesGenerator {

	public static void main(String[] args) {
		int limit = 10;
		int num1 = 0;
		int num2 = 1;
		// Print the Fibonacci series
		 System.out.println("Fibonacci Series up to " + limit + " numbers:");

		for (int i =1; i<= limit; i++) {
			System.out.println(num1 + " ");
			// Calculate the next Fibonacci number
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
		
		
	}

}
