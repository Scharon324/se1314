// If something is made by programmers it is called USED DEFINE
// If it is made by java programmers it is called BUILT IN or LIBRARY CLASS. 

import java.util.*;// Import commands is always at the top of Java program. 
//( *; )- It means all imports, importing all java BUILT IN utilities. 
//(This command means that java is importing an utility to the program).

public class Lesson_2 {

static Scanner sc; // If something starts in CAPITAL letter it is usually called
// a class. (Built in Java program).

public static void main(String [] args){
sc = new Scanner(System.in);
System.out.println("Please Enter your username");
String name = sc.nextLine();// This command allows to bring the blinking line on top,
// provides to input commentary for user (persons).
        
System.out.println(("Your name is ") + name);    


}
}
