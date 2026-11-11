// print 0,1,3,4,6,7,9
import java.util.*;
public class Lesson_12Ex2
{
    public static void main(String [] args)
{
   int a = 0;
   boolean flag = true;
   while (a < 10){
       System.out.println(a);
       if(flag == true){
       a = a+1;
       flag = false;
    }else{
       a = a+2;
       flag = true;
    }
    }
}
        }
// Comparison operators:
        // > greater than
        // < smaller than
        // >= greater or equal to
        // <=
        // == equal to
        // != not equal to
        
        // Boolean/logical operators
        // && - AND
        // || - OR
        // ! - NOT
        
        // For True && True it needs to become true everithing else is false
        // For True || False it is still true untill false or false then only its false
        // For ! True it will just conver it to False (It will reverse it)
