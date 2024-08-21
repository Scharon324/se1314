import java.util.*;

public class Lesson_8b {
// Ask for four numbers to be entered and display the largest one and the smallest one.
static Scanner sc;    
public static void main(String [] args){

//Numbers as double strings
double firstNumber, secondNumber, thirdNumber, fourthNumber;

//First number to print out.
Scanner sc = new Scanner(System.in);
System.out.println("Please enter your first number: ");
firstNumber = Integer.parseInt(sc.nextLine());

//Second Number

System.out.println("Pleas enter you're second number: ");
secondNumber = Integer.parseInt(sc.nextLine());

//Third Number

System.out.println("Please enter your third number: ");
thirdNumber = Integer.parseInt(sc.nextLine());

//Fourth Number

System.out.println("Please Enter your fourth number: ");
fourthNumber = Integer.parseInt(sc.nextLine());

if((firstNumber > secondNumber) && (firstNumber > thirdNumber) && (firstNumber > fourthNumber)){
    System.out.println("you're largest number is: " + firstNumber);


}


    }
    
}
