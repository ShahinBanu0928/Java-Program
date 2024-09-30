public class alphabetcheck {
    public static void main(String[] args) {
        char alphabet = '2';
        if ((alphabet >= 'A' && alphabet<='Z') || (alphabet >= 'a' && alphabet <= 'z')){
            System.out.println(alphabet + " is an Alphabet");
        }
        else{
            System.out.println(alphabet + " is not an Alphabet");
        }
    }
    
}
