public class largestfour {
    public static void main(String[] args) {
        int a = 75;
        int b = 900;
        int c = 200;
        int d = 250;
        int largest;
        if(a>=b && a>=c && a>=d){
            largest = a;
        }
        else if (b>=a && b>=c && b>=d){
            largest = b;
        }
        else if (c>=a && c>=b && c>=d){
            largest = c;
        }
        else{
            largest = d;
        }
        System.out.println(largest);
    }
    
}
