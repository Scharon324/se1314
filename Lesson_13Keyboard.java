//Print out all array with loop not with printing every name out
import java.util.*;
public class Lesson_13Keyboard
{
    static Scanner sc;
   public static void main(String [] args)
{
    sc = new Scanner (System.in);
    
    String [] name = new String[10];
    
    
    int x = 0;
    int b = 1;
    System.out.println("Print out 10 names");
    while(x < 10){
        name[0]= sc.nextLine();
        x++;
    }
    System.out.println("Your Print out names are");
    int a = 0;
    int c = 1;
while( x < 10){
        System.out.println(b+ " " +name[0] );
        a++;
        c++;
}
    
    
}
}
