public class Pattern4A {
    public static void main(String[] args) {
// ABCDE
// FGHIJ
// KLMNO
// PQRST
// UVWXY
        char letter ='A';
        for(int i=0;i< 5;i++){
            for(char j=0;j< 5;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println("");
        }
    }
    
}
