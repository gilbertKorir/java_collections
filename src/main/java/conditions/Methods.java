package conditions;

import java.util.Scanner;

public class Methods {
    static void myName(String name, int age){
        System.out.println(" You are " + name + " Aged "+ age + " years");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String nm = scanner.nextLine();
        System.out.println("Also enter your born day");
        int bDay = scanner.nextInt();
        System.out.println("Also enter the year you are in or the one you want");
        int ag = scanner.nextInt();
        scanner.close();
        myName(nm,ag);
    }
}
