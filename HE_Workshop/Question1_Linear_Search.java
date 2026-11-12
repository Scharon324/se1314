/*
Qs 1. You have been given an array called 
int values[] = {5, 16, 10, 17, 8, 25}; 
Write a JAVA programme to accept a ‘search key’ from a user and do ‘linear search’ using  
 ‘Buffer Reader’.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1_Linear_Search {
    public static void main(String[] args) {
        int values[] = {5, 16, 10, 17, 8, 25};
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the search key: ");
            String input = reader.readLine();
            int searchKey = Integer.parseInt(input);
            
            boolean found = false;
            for (int value : values) {
                if (value == searchKey) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.println("Search key " + searchKey + " found in the array.");
            } else {
                System.out.println("Search key " + searchKey + " not found in the array.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}