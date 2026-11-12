import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
public class Teacher_Information_Management_System
{
    static String [] names = new String [10];
    static String [] midNames = new String [10];
    static String [] Email = new String [10];
    static String [] DOB = new String [10];
    static int numberOfTeachers = 0;
    static String [] SearchForaTeachers;
    static Scanner sc = new Scanner(System.in);
    static int x = -1;
    static int a = 0;
    static int b = 0;
    static FileWriter fw;
    static BufferedWriter bw;
    static PrintWriter pw;
    public static void main(String [] args){
        while(x != 7){
            menu();
            x = Integer.parseInt(sc.nextLine());
            if(x !=(1) && (x !=(2)) && (x != (3)) && x !=(4) && (x != 5 && x != 6 && x != 7 && x !=(-1))) { 
                System.out.format("+-----------------+------+---+-----+%n");
                System.out.format("| ERROR Please Enter 1-4 |   | 1-4 |%n");
                System.out.format("+-----------------+------+---+-----+%n");
                JOptionPane.showMessageDialog(null, "Wrong Number Tiped Please Enter Numbers as shown in 'MENU LIST'");
                System.out.println('\f');
            }
            if (x == 1){
                addingTeachers();
            }  
            if (x == 2){
                SearchForaTeachers();
            }
            if (x == 3){
                PrintEntries();
            }
            if (x == 4){
                SaveData();
            }
            if (x == 5){
                LoadData();
            }
            if (x == 6){
                SortData();
            }
        }
        System.out.println("Application Terminated!");
    }
    // Menu GUI
    public static void menu(){
        System.out.println("---- Menu -----");
        // LEVEL 1 50%
        System.out.println("||1. Add new Teachers to the database"); // Completed !!! Might not for DOB????
        System.out.println("||2. Search for a Teacher"); // Completed!!!
        System.out.println("||3. Print all entries on a screen"); // Completed!!!
        System.out.println("||4. Save Data"); //Complete!!!
        System.out.println("||5. Load Data"); // Complete!!!
        System.out.println("||6. Sort Data"); 
        System.out.println("||7. Quit"); // COMPLETED!!!
        System.out.println("----##-----##-----##-----##----##----");
        // LEVEL 2 100%
        // Update Data
        // Sort Student
    }
    // Adding a user option
    public static void addingTeachers(){
        numberOfTeachers++;
        System.out.println('\f');
        System.out.println("Please add a Teachers Name ");
        names[numberOfTeachers] = sc.nextLine();
        x=-1;
        System.out.println("Please add a Middle Name ");
        midNames[numberOfTeachers] = sc.nextLine();
        x=-1;
        System.out.println("Please add Teachers Email ");
        Email[numberOfTeachers] = sc.nextLine();
        x=-1;
        System.out.println("Please add Date of Birth ");
        DOB[numberOfTeachers] = sc.nextLine();
        x=-1; 
        System.out.println("Data has been stored successfully!");
    }
    //Search function for the Searching for an array
    public static void SearchForaTeachers(){
        System.out.println("Please enter Teachers Name To begin the search: ");
        String search = sc.nextLine();
        boolean haa = false;
        while(b < (10)){
            if(search.equals (names[b])) {
                System.out.println('\f');
                System.out.println("Teacher Found:");
                System.out.println("+---------+----+--------------+----+");
                System.out.println(names[b] + " || "+midNames[b]+ " || " +Email[b]+ " || " +DOB[b]);
                System.out.println("+---------+----+--------------+----+");
                System.out.println("------------------------------------");
                haa = true;
            }
            b++;
        }
        if(haa==(false)){
            System.out.println();
        }
        b=0;
        haa = false;
    }
    //Prints information to the screen and removes the not NULL
    public static void PrintEntries(){
        System.out.println("Records Result: ");

        for (x=1;x<10;x++){
            if (names[x] != null){ // Removes not NULL on a screen
                System.out.println(names[x] + " || "+midNames[x]+ " || " +Email[x]+ " || " +DOB[x]);
            }

        }
    }
    // Saves a data as a Text File Format into the designated location
    public static void SaveData(){
        try {
            for(int x=0;x<names.length;x++){
                if(names[x]!= null){//takes away not null on the screen   
                    //the FileWriter is what opens/creates a file, if it does not exist 
                    fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\filename.txt",true);
                    //the true=append & false=overwrite (false is always default)
                    bw = new BufferedWriter(fw);
                    pw = new PrintWriter(bw);

                    System.out.println("Find has been saved as (filename.txt) ");
                    pw.println(names[x] + " || "+midNames[x]+ " || " +Email[x]+ " || " +DOB[x]);
                    pw.flush();//this is what flushes the buffer
                    pw.close();//this is what closes the file and then flushes the buffer
                }
            }
        } catch (IOException e) {
            e.printStackTrace();   
        }
    }
    // Loads data from a file in a designatedd location
    public static void LoadData(){
        System.out.println("Loading.....");
        System.out.println("Result of your Saved DATA:");
        BufferedReader br = null;
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\filename.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            System.out.println("NO DATA HAS BEEN FOUND.");
        }
    }

    public static void SortData(){
        /*
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < names.length -1;  j++ )
            {
                if ( names[ j ] < names[j+1] )   // change to > for ascending sort
                {
                    temp = SearchForaTeachers[ j ];                //swap elements
                    SearchForaTeachers[ j ] = names[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred 
                    
                }
                */
            }
        }