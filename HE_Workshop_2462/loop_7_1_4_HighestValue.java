// Write a code fragment that reads 10 integer values from the user and prints the highest value entered
import java.util.Scanner;

public class loop_7_1_4_HighestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 integers:");
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
        }
        
        System.out.println("The highest value entered is: " + max);
        
        scanner.close();
    }
}