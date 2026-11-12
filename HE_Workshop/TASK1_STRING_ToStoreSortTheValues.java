/*
 * TASK 1 :  Write a JAVA programme to store ‘STRING’ type of user
 * input in an array , sort the values in alphabetical order and 
 * display the result.
*/
import java.util.Arrays;
import java.util.Collections;
public class TASK1_STRING_ToStoreSortTheValues{

public static void main(String args[]) {
String[] companies = { "Google", "Apple", "Sony" };

// sorting java array in ascending order
System.out.println("Sorting String Array in Ascending order in Java");
System.out.println("Unsorted String Array in Java: " );
System.out.print("\n");
printNumbers(companies);
Arrays.sort(companies);
System.out.println("Sorted String Array in ascending order : ");
System.out.print("\n");
printNumbers(companies);

// sorting java array in descending order
System.out.println("Sorting Array in Descending order in Java");
System.out.println("Unsorted int Array in Java: ");
System.out.print("\n");
printNumbers(companies);
Arrays.sort(companies, Collections.reverseOrder());
System.out.println("Sorted int Array in descending order : ");
System.out.print("\n");
printNumbers(companies);

System.out.println("Sorting part of array in java:");
System.out.print("\n");
int[] numbers = { 1, 3, 2, 5, 4 };
Arrays.sort(numbers, 0, 3);
System.out.println("Sorted sub array in Java: ");
for (int num : numbers) {
System.out.println(num);
}

}

public static void printNumbers(String[] companies) {
for (String company : companies) {
System.out.println(company);
}
}

}