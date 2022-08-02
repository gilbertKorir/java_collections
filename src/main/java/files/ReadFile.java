package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("jaredfile.txt");
            Scanner scanner = new Scanner(myfile);
            while(scanner.hasNextLine()){
                String nm = scanner.nextLine();
                System.out.println(nm);

            }
        } catch (FileNotFoundException e) {
            System.out.println("error occurred");
            e.printStackTrace();
        }


    }
}
