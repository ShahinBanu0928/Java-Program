import java.io.File;

public class fileIOdel {
    public static void main(String[] args) {
        File answer = new File("shahin1.txt");
        if(answer.delete()){
            System.out.println("Deleted");
        }
        else{
            System.out.println("failed");
        }
    }
}
