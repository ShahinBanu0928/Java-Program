public class StudentGradingSystem {
    public static void main(String[] args) {
        int marks = 62;
        char grade;
        if (marks >= 90){ //above 90 marks
            grade ='A';
        }
        else if (marks >=80){ // range of 80 to 90
            grade = 'B';
        }
        else if (marks >=70){ // range of 70 to 79
            grade = 'C';
        }
        else if (marks >=60){ // range of 60 to 69
            grade = 'D';
        }
        else if (marks >= 50){
            grade = 'E';
        }
        else {
            grade = 'F'; //Fail
        }
        System.out.println("Grade = " + grade);
    }
    
}
