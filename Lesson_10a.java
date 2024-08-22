import java.util.*;
public class Lesson_10a {

// Some math exercises.
    public static void main(String[] args) {
        
        int x = 5;
        int y = 5;
        int z = 7;

        while(x < 10){
            System.out.println(z);
            y = y * x + z;
            z = z + z;
            x++;


        }

    }

}
