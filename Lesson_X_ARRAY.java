public class Lesson_X_ARRAY {
    public static void main(String[] args) {
        int[][] listTwo = new int[10][10];
        
        // 2D array
        int x = 0;
        while (x < 10) {
            int y = 0;
            while (y < 10) {
                listTwo[x][y] = (int)(Math.random() * 100);
                y++;
            }
            x++;
        }
        
        x = 0;
        while (x < 10) {
            int y = 0;
            while (y < 10) {
                System.out.print(listTwo[x][y] + " ");
                y++;
            }
            System.out.println("");
            x++;
        }
    }
    
    // avoid global variables
}