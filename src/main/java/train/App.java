package train;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Enter your Name ===");
        String name1 = scan.next();
        scan.close();

        // calling the User class
        User user = new User();
        user.setName(name1);
        String nm = user.getName();
        System.out.println("=== Your name is:" + nm);

        System.out.println("================================");
        ArrayList<String> list = new ArrayList<>();
        list.add("lared");
        list.add("rered");
        list.add("pored");

        System.out.println(list);


    }
}
