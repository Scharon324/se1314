/* A man is paid at the hourly rate of 8 Pounds per hour for the first 40 hours and 1.5 times of the basic
pay per hour thereafter. Use if .. else and write a program to input the number of hours per week. Calculate
and print total pay and the overtime pay */
import java.util.Scanner;

public class Ex_oop3_6_PayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of hours worked per week: ");
        double hoursWorked = scanner.nextDouble();
        
        final double hourlyRate = 8.0;
        final int regularHours = 40;
        final double overtimeRate = 1.5 * hourlyRate;
        
        double totalPay;
        double overtimePay;
        
        if (hoursWorked <= regularHours) {
            totalPay = hoursWorked * hourlyRate;
            overtimePay = 0.0;
        } else {
            totalPay = (regularHours * hourlyRate) + ((hoursWorked - regularHours) * overtimeRate);
            overtimePay = (hoursWorked - regularHours) * overtimeRate;
        }
        
        System.out.printf("Total pay: %.2f Pounds%n", totalPay);
        System.out.printf("Overtime pay: %.2f Pounds%n", overtimePay);
        
        scanner.close();
    }
}