package collections;

import java.util.Scanner;

public class Threads {
    static  void adminPassword(int p){
        int p1 = 121212;
        if(p != p1){
            throw new ArithmeticException("You are not an Admin");
        }else{
            System.out.println("Sucessfully logged in");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Admin password");
        int pass = scanner.nextInt();
        adminPassword(pass);
    }
}
