public class Pattern6A {
    public static void main(String[] args) {
// EEEEE
// DDDDD
// CCCCC
// BBBBB
// AAAAA
        char letter ='E';
        for(int i=0;i< 5;i++){
            for(char j=0;j< 5;j++){
                System.out.print(letter);
            }
            System.out.println("");
            letter--;
        }
    }
}
