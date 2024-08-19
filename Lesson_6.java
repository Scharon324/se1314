//
        // get age from user input
        // if age is greater than 17 print You are an adult
        // if age is <= 17 print you are a child
        import java.util.*;
public class Lesson_6 {
    static Scanner sc;
    public static void main(String [] args){
        sc = new Scanner(System.in);
        System.out.println("Please Enter your age: ");
        //int age = sc.nextInt(); //Not Recommended to use this has issues.
        int age = 17;
        age = Integer.parseInt(sc.nextLine());

        if(age <= 17){
            System.out.println("You are child " + age);


        }
        else
        System.out.println("You are adult " + age);



    }
    
}
