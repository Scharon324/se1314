import java.util.*;

public class Input_output_Taks1_2_3
{
    static Scanner sc;
    public static void main(String [] arg)
{
    sc = new Scanner(System.in);
    
    int a = 23;
    int b = 34;
    int c = 32;
    int d = a+b+c;
    
    double e = d/3.0;
   
    System.out.println("Hello");
    
    System.out.println("Please Enter Your name");
    String name = sc.nextLine();
    System.out.println("Your name is "+ name);
    
    System.out.println("The Sum of the numbers are " + a + " "+ b + " "+ c);
    System.out.println("The Sum Of Three Number are "+ d);
    
    System.out.println("The Average Of Three Numbers Are "+ e);
    
    }
}
