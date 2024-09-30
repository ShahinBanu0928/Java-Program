package backend2tasks;

public class VowelsConsonantchecker {

	public static void main(String[] args) {
		String input = "Welcome";
		input = input.toUpperCase();
		int vowelCount = 0;
		int consonantCount =0;
		for(int i=0; i<input.length();i++){
			char ch = input.charAt(i);
			if (ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
				vowelCount++;
				
			}
			else if (ch>='A'&&ch<='Z') {
				consonantCount++;
				}
			}
	
		System.out.println("Number of Vowels = " + vowelCount);
		System.out.println("Number of Consonants = "+ consonantCount);
		
		
	}
}

