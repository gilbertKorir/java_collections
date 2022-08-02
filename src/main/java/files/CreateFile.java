package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            File myFile = new File("C:\\Users\\User\\Music\\jared\\jared2.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            }
            else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
