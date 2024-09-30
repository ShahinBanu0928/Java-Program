package backendtasks;

public class GradeCalculator {

	public static void main(String[] args) {
		int physics = 19;
		int chemistry = 70;
		int maths = 75;
		int computerScience=98;
		int totalMarks = 400;
		//below 25 fail
		if(physics<25 || chemistry<25 || maths<25 || computerScience<25) {
			System.out.println("Result: Fail (One or more subjects below 25 marks)");
		}
		else {
			int obtainedMarks = physics + chemistry + maths + computerScience;
			double percentange = (obtainedMarks/(double) totalMarks)*100;
			char grade;
			if (percentange>=90) {
				grade = 'A';
			}
			else if (percentange>=80) {
				grade = 'B';
			}
			if (percentange>=70) {
				grade = 'C';
			}
			if (percentange>=60) {
				grade = 'D';
			}
			else {
				grade ='F';
			}
			System.out.println("Total Marks = " + obtainedMarks);
			System.out.println("Percentage = " + percentange);
			System.out.println("Grade = "+ grade);
			}
		}
	}
