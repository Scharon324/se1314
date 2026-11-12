import java.util.*;
public class Selection_1
{
    static Scanner sc;
    public static void main(String [] args)
    {
        int number;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number ");
        number = Integer.parseInt(sc.nextLine());
        
        if( number == 0){
            System.out.println("The Number is Equal to " + 0);
        }else{
         if( number != 0){
            System.out.println("Number is non-0");
           }
if( number <= 0) {
    System.out.println("The Number is Less than or equal to Zero");
}
           
           
}
}
}

// Comparison operators:
        // > greater than
        // < smaller than
        // >= greater or equal to
        // <= less or equal
        // == equal to
        // != not equal to
        
        // Boolean/logical operators
        // && - AND
        // || - OR
        // ! - NOT
        
        // For True && True it needs to become true everithing else is false
        // For True || False it is still true untill false or false then only its false
        // For ! True it will just conver it to False (It will reverse it)