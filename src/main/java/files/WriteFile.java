package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter mywriter = new FileWriter("jaredfile.txt");
            mywriter.write("Java programming always needs practices");
            mywriter.close();

            System.out.println("written successfully");

        }catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();

        }
    }
}
