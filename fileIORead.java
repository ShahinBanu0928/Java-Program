import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileIORead {
    public static void main(String[] args) {
        try{
            File answer = new File("shahin.txt");
            Scanner read = new Scanner(answer);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error");
        }
    }
}
    

