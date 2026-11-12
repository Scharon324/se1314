import java.util.*;
public class Quiz_Oracle_S1
{
    public static void main(String [] args)
{
    Scanner sc = new Scanner (System.in);
    //Question 1
    System.out.println("==================================================================================================");
    System.out.println("1. Oracle Database Software provides which of the following functionality? (Choose two)\n Mark for Review(1) Points \n (Choose all correct Answeres)");
    System.out.println(); // Makes Space in Between the Command
    System.out.println("a "+"Graphical User Interface" );
    System.out.println("b "+"Internet Browser");
    System.out.println("c "+"Server");
    System.out.println("d "+"Operating System");
    System.out.println(); // Makes Space in Between the Command
    
    String answere1, answere2, answere3, answere4, answere5, answere6a, answere6b, answere7, answere8, answere9, answere10, answere11, answere12, overallResult, next;
    String Next, Back;
    int c = 0;
    int e = 0;
    answere1 = sc.nextLine(); // Makes Space in Between the Command
    answere2 = sc.nextLine(); // Makes Space in Between the Command
    if(answere1.equals ("a")){
        System.out.println("First question is Correct");
        c++; // Adds 1 number to the result that its correct
    }else{
        System.out.println("First question is Incorrect");
        e--; // Takes away the number
    }
    if(answere2.equals("c")){
        System.out.println("Second question is Correct");
        c++; // Adds 1 number to the result that its correct
    }else{
        System.out.println("First question is Incorrect");
        e--; // Takes away the number
    }
   
    

    // Question 2
    System.out.println();
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    next = sc.nextLine();
    System.out.print ('\f'); // Clears the screen after giving new command or question
    if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("2. The first step in system development is to document the requirements. Why? \n Mark for Review \n(1) Points");
    System.out.println(); // Makes Space in Between the Command
    System.out.println("a "+"Wrong. A blueprint for the database design is not needed. We can just start coding straight away." );
    System.out.println("b "+"!!It clarifies what a business wants to accomplish, and provides measures for deciding if the system delivers all that is required.");
    System.out.println("c "+"It allows application development to be conducted without having to consider database design.");
    System.out.println("d "+"It keeps businesses honest.");
    System.out.println(); // Makes Space in Between the Command
    }
    answere3 = sc.nextLine();
    if(answere3.equals ("b")){
        System.out.println("B question is Correct");
        c++; // Adds 1 number to the result that its correct
    }else{
        System.out.println("Incorrect");
        e--; // Takes away the number
    }   
    
    
    // Question 3
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    next = sc.nextLine();
    System.out.println('\f');
    if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
        System.out.println("3. The main subject areas taught by the Oracle Academy are: Mark for Review \n (1) Points");
        System.out.println();
        System.out.println("a"+" Computer Repairs");
        System.out.println("b"+" Database performance tuning.");
        System.out.println("c"+" Data Modeling, SQL and PL/SQL");
        System.out.println("d"+" Systems programming and computer architecture");
    }
        answere4 = sc.nextLine();
        if(answere4.equals ("b")){
            System.out.println("Correct");
            c++;
        }else{
            System.out.println("Incorrect");
            c--;
        }
    
    //Question 4
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    next = sc.nextLine();
    System.out.println('\f');
    if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("4. Consider your school library. It will have a database with transaction details of which student borrows which books.");
    System.out.println("Is details of the total number of books out on loan in one given month Data or Information? Mark for Review");
    System.out.println("(1) Points");
    System.out.println("a"+" Data");
    System.out.println("b"+" Information (*)");
    System.out.println("c"+" Both");
    System.out.println("d"+" Neither");
    System.out.println();
}
answere5 = sc.nextLine();
if(answere5.equals ("b")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}

// Question 5

    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");

    next = sc.nextLine();
    System.out.println('\f');
      if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("Data modelling is performed for the following reasons: (Choose Two) \n Mark for Review \n (1) Points");
    System.out.println("(Choose all correct answers)");
    System.out.println("a"+" The ERD’s becomes a blueprint for designing the actual system. (*)");
    System.out.println("b"+" It helps discussions and reviews. (*)");
    System.out.println("c"+" We do not need datamodels, we can just start coding right away.");
    System.out.println("d"+" We just draw the ERD’s to please the users, once they are finished we never look at them again. They serve no purpose in the real world.");
    System.out.println();
}
answere6a = sc.nextLine();
answere6b = sc.nextLine();
if(answere6a.equals ("a")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}
if(answere6b.equals ("b")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}
    
    
    //Question 6
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
  
    next = sc.nextLine();
    System.out.println('\f');
    
    if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
        System.out.println("Entity and Attribute names are always interchangable, so you need not worry about choosing the right type. \n True or False? \n Mark for Review \n(1) Points");
        System.out.println();
        System.out.println("a"+" True");
        System.out.println("b"+" False");
        System.out.println();
    }
    answere7 = sc.nextLine();
    if (answere7.equals ("True")){
        System.out.println("Correct");
        c++;
    }else{
        System.out.println("incorrct");
        c--;
    }
    
    //Question 7
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    next = sc.nextLine();
    System.out.println('\f');
if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("7. All of the following would be instances of the entity ANIMAL SPECIES except which? \n Mark for Review(1) Points");
    System.out.println();
    System.out.println("a"+" Dog");
    System.out.println("b"+" Bird");
    System.out.println("c"+" Elephant");
    System.out.println("d"+" Leaf");
    System.out.println();
}
answere8 = sc.nextLine();
if(answere8.equals ("d")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}

    //Question 8
    
    
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    
    next = sc.nextLine();
    System.out.println('\f');
if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("8. The entity/relationship model is created before the physical database design model? \n True or False? \n Mark for Review(1) Points");
    System.out.println();
    System.out.println("a"+" True");
    System.out.println("b"+" False");
    System.out.println();
}
answere9 = sc.nextLine();
if(answere9.equals ("a")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}
    
    //Question 9
    
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    next = sc.nextLine();
    System.out.println('\f');
if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("9. In a physical data model, a relationship is represented as a? \n Mark for Review (1) Points");
    System.out.println();
    System.out.println("a"+" Column");
    System.out.println("b"+" Row");
    System.out.println("c"+" Instance");
    System.out.println("d"+" Foreign Key");
    System.out.println();
}
answere10 = sc.nextLine();
if(answere10.equals ("d")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}
    
    //Question 10
    
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    next = sc.nextLine();
    System.out.println('\f');
if(next.equals ("Yes") || next.equals("yes") || next.equals("Y") || next.equals("y")){
    System.out.println("10. Volatile entities have special requirements and need special attention when you are doing data modelling. \n True or False? \n Mark for Review (1) Points");
    System.out.println();
    System.out.println("a"+" True");
    System.out.println("b"+" False");
    System.out.println();
}
answere11 = sc.nextLine();
if(answere11.equals ("a")){
    System.out.println("Correct");
    c++;
}else{
    System.out.println("Incorrect");
    c--;
}
    
    //Question 11
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    System.out.println("Proceed to the next question? Yes? No?");
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    
    
    
    
    
    
    























    
    
    System.out.println("==================================================================================================");
    System.out.println("==================================================================================================");
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    System.out.println();
    System.out.println("Do you wish to see overall result?");
    System.out.println("Yes?"); 
    System.out.println("No?");
    overallResult = sc.nextLine();
    
    if(overallResult.equals ("Yes") || overallResult.equals ("Y") || overallResult.equals ("yes") || overallResult.equals ("y") || overallResult.equals ("YES")){
        System.out.println("Your result are \n");
        System.out.println("Total of Correct Answeres "+ c + " Out of 50"); // Prints out overall results of points you got
        System.out.println();
        System.out.println("Total Answeres Lost " + e + " Out of 50");
    }else{
        System.out.println("Thank you for taking the exam your result will not be shown");
        System.out.println();
        System.out.println("Thank you for taking part of the test Exam");
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
        
    
    
    }
}
