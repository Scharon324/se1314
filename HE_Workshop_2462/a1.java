import java.util.*;

public class a1
{
    static Scanner sc; // s
   public static void main(String [] arg)
   {
       sc = new Scanner(System.in);
       boolean correct = false; // boolean means true or false. Boolean is a tipe of veriable. Correct is a variable name correct can mean only 2 things true or false
       
       try{ // 
           int x = Integer.parseInt(sc.nextLine()); // sc.nextline allows the user to enter the value. wich can be string or a number. Integer.parse.int means it will convert that value into integer.
       correct = true;
    }catch (Exception e){
        System.out.println("error try again");
    }
    
    System.out.println (correct);
       
       
    }
}
