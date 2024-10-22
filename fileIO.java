import java.io.File;
import java.io.IOException;
public class fileIO {
    public static void main(String[] args) {
        try{
            File answer = new File ("shahin.txt");
            if (answer.createNewFile()){
            System.out.println("file created");
            }
            else{
                System.out.println("File Already Exists");
            }
            if(answer.exists()){
                System.out.println(answer.getName());
                System.out.println(answer.getAbsolutePath());
                System.out.println(answer.length());
                System.out.println(answer.canWrite());
                System.out.println(answer.canRead());
            }
            else{
                System.out.println("File Does not exist");
            }
        }
        catch(IOException e){
            System.out.println("Error");

        }
            
        
    }
    
}
