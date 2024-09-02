// Ask the user to enter their first name, last name and age, print all three in
// one line.
import java.util.*;
public class Lesson2_Exercise1{
    static Scanner sc;
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name = sc.nextLine(); // This command allows to bring the blinking line on top, provides to input commentary for user (persons)
        System.out.println("Your name is " + name);
        
        System.out.println("Please enter your last name");
        String lastname = sc.nextLine();
        System.out.println("Your last name is " + lastname);
        
        System.out.println("Please enter your age");
        String yourage = sc.nextLine();
        
        System.out.println("\n"); // puts space in between the text
        System.out.println("Your Name is " + name);
        System.out.println("Your Last name is " + lastname);
        System.out.println("Your Age is " + yourage);




    }





}