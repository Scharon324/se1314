//Write a program which, for amounts 2000p and 2500, calculates the bank interest at 5% per year, and then 
//displays the interest and total sum to be paid after a year in message window.


import javax.swing.JOptionPane;
public class Ex_oop2_9
{
    public static void main(String [] arg)
    {
        int a = 2000;
        int b = 2500;
        
        double interest = 0.05;
        
        double c = a* interest;
        double d = a-c;
        
        double e = b* interest;
        double f = b-e;
        
        JOptionPane.showMessageDialog(null, "Your bank total are " + d + " Your 5% interests with a bank are "+ c);
        JOptionPane.showMessageDialog(null, "You have antoher bank account that holds total of "+ f + " The bank withdrawn interest of 5% you have total of "+ e);
  
    }
}
