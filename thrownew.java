public class thrownew {
    static void check(int age) {
        if (age > 18) {
            throw new ArithmeticException("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }

    public static void main(String[] args) {
        check(20);
    }
}
    
