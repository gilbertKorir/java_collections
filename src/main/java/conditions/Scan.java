package conditions;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //while loop
        boolean open = true;

        while(open) {
            System.out.println("Welcome our dear customer, how can we help you?");
            System.out.println("Which service scanning, photo, ecitizen, other or Exit?");

            String service = scanner.next(); // stops after a white space
            scanner.nextLine(); // stops after a new line \n

            if(service.equalsIgnoreCase("scanning"))
                System.out.println("Proceed to counter number 2");
            else if (service.equalsIgnoreCase("photo"))
                System.out.println("Proceed to counter number 4");
            else if (service.equalsIgnoreCase("ecitizen"))
                System.out.println("Proceed to counter number 5");
            else if (service.equalsIgnoreCase("other"))
                System.out.println("See the Customer care");
            else if (service.equalsIgnoreCase("Exit"))
                open = false;
            else
            System.out.println("Currently we do not have your request or maybe re-enter the service");
        }
    }
}
