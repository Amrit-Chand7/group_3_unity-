// Write a Java program that simulates an ATM PIN verification system.
// The program should have a correct PIN stored (for example, 1234) and allow the user up to three attempts to enter the correct PIN.
// If the user enters the correct PIN, print "Access Granted" and stop the program.
// If the user enters the wrong PIN, print "Incorrect PIN, try again".
// After three incorrect attempts, print "Account locked".

import java.util.Scanner;

public class Pin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int correctPIN = 1234;
        int attempts = 3;
        for (int i = 1; i <= attempts; i++){
            System.out.println("Enter your PIN:");
            int enterPIN = sc.nextInt();
            if (enterPIN == correctPIN){
                System.out.println("Access Granted.");
                break;
            }else {
                if (i < attempts){
                    System.out.println("Incorrect PIN, try again");
                }else {
                    System.out.println("Account locked");
                }
            }
        }
    }
}
