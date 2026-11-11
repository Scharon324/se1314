// to print the odd numbers from 1 to 99
public class Loop_7_1_2
{
    public static void main(String [] args)
{
    int a = 0;
    
    while ( a <= 99){
        a = a +1;
        if ( a % 2 == 1 ){
            System.out.print(" " + a);
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