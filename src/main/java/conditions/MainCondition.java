package conditions;

import java.util.Scanner;

public class MainCondition {
    public static void main(String[] args) {

        System.out.println("Enter a day number:");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.close();
        switch(day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day like that");
        }
    }
}
