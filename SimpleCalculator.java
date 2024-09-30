package backend2tasks;

public class SimpleCalculator {

	public static void main(String[] args) {
		double num1 = 90.5;
		double num2 = 20.3;
		char operation = '/';
		double result;
		switch(operation){
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if(num2!=0) {
					result = num1/num2;
					}
				else {
					System.out.println("Error: Divison by zero is not allowed");
					return;
				}
				break;
				default:
					System.out.println("INVALID OPERTAION");
					return;
					}
		System.out.println("Result of: " + num1 + " "+  operation +  " " +num2 + " = "  + result);
		}
}
