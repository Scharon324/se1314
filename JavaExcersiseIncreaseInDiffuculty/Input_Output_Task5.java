/* The user enters an amount of money as a whole number. The program should calculate and display 
how many 20,10 and 5 notes and 2 and 1 coins are needed to make up this amount. For example 37 would
give 1*20, 1*10, 1*5 and 1*2 
BONUS Input If and Else if there is no 20 there is no 20 and so forth*/

import java.util.*;

public class Input_Output_Task5
{
     static Scanner sc;
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an amount of money: ");
        int amount = scanner.nextInt();
        
        // Calculate the number of each denomination
        int num20s = amount / 20;
        amount %= 20;
        
        int num10s = amount / 10;
        amount %= 10;
        
        int num5s = amount / 5;
        amount %= 5;
        
        int num2s = amount / 2;
        amount %= 2;
        
        int num1s = amount;
        
        // Display the result
        System.out.println("Number of notes and coins:");
        
        if (num20s > 0) {
            System.out.println(num20s + " * 20");
        }
        if (num10s > 0) {
            System.out.println(num10s + " * 10");
        }
        if (num5s > 0) {
            System.out.println(num5s + " * 5");
        }
        if (num2s > 0) {
            System.out.println(num2s + " * 2");
        }
        if (num1s > 0) {
            System.out.println(num1s + " * 1");
        }
        
        scanner.close();
    }
}