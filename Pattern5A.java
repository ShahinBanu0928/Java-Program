public class Pattern5A {
    public static void main(String[] args) {
// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE
        char letter ='A';
        for(int i=0;i< 5;i++){
            for(char j=0;j< 5;j++){
                System.out.print(letter);
            }
            System.out.println("");
            letter++;
        }
    }
    
}
