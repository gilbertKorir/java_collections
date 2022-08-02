package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("C:\\Users\\User\\Music\\jared\\jared2.txt");
            if(myfile.delete()){
                System.out.println("Deleted the file: " + myfile.getName());
            }else{
                System.out.println("the file to be deleted does not exist!");
            }
        }finally {
            System.out.println("Deleted successfully");
        }
    }
}
