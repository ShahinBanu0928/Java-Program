package backendtasks;

public class TemperatureConverter {

	public static void main(String[] args) {
		//Celsius temperature
		double celsius = 20.0;
		//covert celsius to fahrenheit
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println(celsius + "°C is equivalent to " + fahrenheit +"°F");
		if(celsius <0) {
			System.out.println("It's below freezing point.");
		}
		else if (celsius >=0 && celsius<20) {
			System.out.println("It is Cold");
		}
		else if (celsius >20 && celsius<=30) {
			System.out.println("It is Warm");
		}
		else {
			System.out.println("It is Hot");
		}
		//covert Fahrenheit to Celsius
		double fahrenheit1 = 35.0;
		double celsius1 = ( fahrenheit1 -32 )*5/9 ;
		System.out.println(fahrenheit1 + "°F is equivalent to " + celsius1 +"°C");
		
		if(fahrenheit  <0) {
			System.out.println("It's below freezing point.");
		}
		else if (fahrenheit1 >=0 && fahrenheit1 <20) {
			System.out.println("It is Cold");
		}
		else if (fahrenheit1 >20 && fahrenheit1 <=30) {
			System.out.println("It is Warm");
		}
		else {
			System.out.println("It is Hot");
		}
		
	}

}
