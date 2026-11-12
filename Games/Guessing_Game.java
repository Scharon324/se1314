import java.util.*;

public class Guessing_Game
{
   public static void main(String [] args)
{
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("This is the guessing game!");
   System.out.println("Input the random number 1 to 10");
   
   int InputNumbers = keyboard.nextInt();
   int RandomNumber = new Random().nextInt(10) + 1;
   
   if( InputNumbers == RandomNumber){
       System.out.println("==================");
       System.out.println("You Win!!!");
       System.out.println("==================");
    }else{
        System.out.println("You Lose!");
        System.out.println("The random number was");
        System.out.println(RandomNumber + " ");
    }
    
    
    }
}
