import java.util.*;
public class Validation
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("enter your name");
        String n = sc.nextLine();
        int x = 1;
        //int x = Integer.parseInt(sc.nextLine());
        while(x == 1){
        if(n.length() > 1){
            System.out.println("your name is" + n);
            x++;
        }else{
            System.out.println("must have 2 character or more ");
            n = sc.nextLine();
        }
    }
}
}
