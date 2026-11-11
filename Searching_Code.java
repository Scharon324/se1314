public class Searching_Code
{
    static int [] list = new int [10];
    public static void main(String [] args){
        // Searching
        //Two ways to search Linear/Sequential and Binary
        // Data structure and algorithms - table content
        // heap sort, quick sort, merge sort.
        //=======================================================
        // Put random numbers in Array
        int x = 0;
        while(x < list.length){
            list[x] = (int) (100 * Math.random());
            
            x++;
        
        }
        
        // SEARCHING FOR ITEM CODE
        int item = 50;
        boolean found = false;
        
        int i = 0;
        while(i < list.length){
            if(list [i] == item){
                found = true;
                break; // It will find and breaks the loops so it will stop
            }
            i++;
        }
        System.out.println(found);
    
    
    }
}
