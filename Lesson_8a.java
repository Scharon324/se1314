//
import java.util.*;
public class Lesson_8a{
    // if statement
    // Ask for the user to enter their age and favorite subject. 
    //If they are over 18 and they say "computing" then
    // respond with welcome otherwise tell them do maths
    static Scanner sc;
    public static void main(String [] args){
        //Age
        int age = 0;
        System.out.println("Please enter you age: ");
        Scanner sc = new Scanner(System.in);
        age = Integer.parseInt(sc.nextLine());
        //Subject
        System.out.println("Please Enter your Favorite Subject: ");
        String subject = (sc.nextLine());
        //If and Else Statement

        if((age <= 18) && subject.equals("Developer")){
            System.out.println("Welcome User");

        }else{

                System.out.println("Do The Math");

        }


    }
}