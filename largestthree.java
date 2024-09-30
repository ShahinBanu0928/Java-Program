public class largestthree {
    public static void main(String[] args) {
        int a = 75;
        int b = 100;
        int c = 200;
        int largest;

        if (a >= b  && a >= c){
            largest = a;
        }
        else if (b >= a && b >= c){
            largest = b;
        }
        else {
            largest = c;
        }
        System.out.println(largest);
    }
    
}
