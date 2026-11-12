import java.util.*;

public class Binary_Search_sample_code
{

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        System.out.println("Performing Binary Search on Arrays" + newLine);    
        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 14;
        numbers[4] = 56;
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println("Array elements are " +numbers[i]);
        }
        System.out.println("4 is found at index : " + Arrays.binarySearch(numbers, 4));
        System.out.println("14 is found at index : " + Arrays.binarySearch(numbers, 14));

    }
}
