import java.util.*;

public class Lesson_8b {
// Ask for four numbers to be entered and display the largest one and the smallest one.
static Scanner sc;    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter 4 numbers
        System.out.println("Enter the first number: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the third number: ");
        int num3 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the fourth number: ");
        int num4 = Integer.parseInt(sc.nextLine());

        int largest = num1;
        int smallest = num1;
        
        // Checking the second number
        if (num2 > largest) largest = num2;
        if (num2 < smallest) smallest = num2;

        // Checking the third number
        if (num3 > largest) largest = num3;
        if (num3 < smallest) smallest = num3;

        // Checking the fourth number
        if (num4 > largest) largest = num4;
        if (num4 < smallest) smallest = num4;

        // Outputting the largest and smallest numbers
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        

    }
}
