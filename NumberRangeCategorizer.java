package backend2tasks;

public class NumberRangeCategorizer {

	public static void main(String[] args) {
		int range = 82;
		if (range>=0 && range<=30) {
			System.out.println("The Number is Smallest");
		}
		else if (range>30 && range<=70) {
			System.out.println("The number is Medium");
		}
		else if (range>70 && range<=100) {
			System.out.println("The number is Large");
		}
		else {
			System.out.println("The Number is Out of Range");
		}
	}

}
