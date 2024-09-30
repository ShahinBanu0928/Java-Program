public class StudentsPassFail {
    public static void main(String[] args) {
        int english = 83;
        int tamil = 92;
        int maths = 55;
        int science = 61;
        int socialScience = 22;
        
        if (english >= 35 &&
        tamil >=35 && 
        maths >= 35 &&
        science >= 35 &&
        socialScience >= 35) {
            System.out.println(" Student is Passed");
        }
        else{
            System.err.println("Student is Failed");
        }
    }
}
