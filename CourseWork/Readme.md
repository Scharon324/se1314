Coursework for Java.

### Teacher Information Management System

This Java program is an interactive application designed to manage information about teachers. It allows users to perform various operations such as adding new teachers, searching for a teacher by name, printing all entries, saving data to a file, loading data from a file, and sorting the data. 

Key components:

    Data Storage: The program uses arrays to store information about teachers:

    names: Stores first names.
    midNames: Stores middle names.
    Email: Stores email addresses.
    DOB: Stores dates of birth.

    User Interface: The main menu (menu()) provides options for the user to choose from, such as adding a teacher, searching for a teacher, printing all entries, saving data, loading data, sorting data, and quitting.

    Functions:

    addingTeachers(): Adds a new teacher's information to the arrays.
    SearchForaTeachers(): Searches for a teacher by name and displays their details if found.
    PrintEntries(): Prints all stored entries on the screen.
    SaveData(): Saves the current data to a text file (filename.txt).
    LoadData(): Loads data from the text file into the arrays.
    SortData(): Sorts the data. The method is currently incomplete and needs to be implemented.

    Main Loop: The program runs in a loop, displaying the menu and waiting for user input until the user chooses to quit (option 7).

    File Handling: The program uses FileWriter, BufferedWriter, and PrintWriter to write data to a file and BufferedReader to read data from a file.

    Error Checking: There is basic error checking in the menu choice, ensuring that only valid options are accepted.

This program provides a simple console-based interface for managing teacher information, making it useful for small-scale applications or as a learning tool for understanding basic Java concepts like arrays, user input/output, and file operations.