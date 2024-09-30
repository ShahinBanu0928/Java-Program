public class gradeEvalutorInSwitchcase {
    
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("EXCELLENT");
                break;
            case 'B':
                System.out.println("VERY GOOD");
                break;
            case 'C':
                System.out.println("GOOD");
                break;
            case 'D':
                System.out.println("POOR");
                break;
            case 'E':
                System.out.println("VERY POOR");
                break;
            case 'F':
                System.out.println("FAIL");
                break;
            default:
                System.out.println("INVAILD GRADE");
                break;
        }

    }
}
