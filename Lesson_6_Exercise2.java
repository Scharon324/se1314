//Complete the following
        //add user input
        // input if you are male or female.

import java.util.Scanner;
import java.util.*;

public class Lesson_6_Exercise2 {
static Scanner sc;
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        System.out.println("please enter your gender");
        String gender = sc.nextLine();
        if ( gender.equals("male")){
            System.out.println("You are male");
        }else{
            if ( gender.equals("female")){
                System.out.println("You are a female");
            }else{
                System.out.println("Hello Whatever");
    }
        
    }
    
    }
}
