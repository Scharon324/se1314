//Write a program in which user can enter two integers. if both numbers are zero,
//it prints message "Two zeros". If one number is zero, prints "first/second number is zero"
import java.util.*;
public class oop3_8
{
   static Scanner sc;
   public static void main(String [] args)
   {
       int number1 = 0;
       int number2 = 0;
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter one Integers ");
       number1 = Integer.parseInt(sc.nextLine());
       
       System.out.println("Please Enter Second Integer");
       number2 = Integer.parseInt(sc.nextLine());
       
       
       if (( number1 == 0) && (number2 == 0)){
           System.out.println("Two Zeros");
        }else{
            if (number1 == 0){
            System.out.println(" First number is zero");
        }
            if (number2 == 0){
            System.out.println("Second number is zero ");
        }
    }
}
}

      
       



