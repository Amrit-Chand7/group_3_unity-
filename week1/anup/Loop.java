// Write a Java program that takes a number from the user and prints all numbers from 1 to that number,
// but skips printing multiples of 4 using an if condition inside a for loop.

import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 0; i<=n; i++){
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
