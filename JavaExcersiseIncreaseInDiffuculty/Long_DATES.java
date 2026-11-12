public class Long_DATES
{
    public static void main(String [] arg)
    {
        int day = 11;
        int month = 10*30;
        int year = 2015;
        int millenium = 2000;
        
        int yeartotal = year - millenium;
        int years = 365;

        System.out.println("From 2010 passed " + yeartotal + " Years");
        System.out.println("And " + month + " days passed ");
        System.out.println("totally passed " + ((10*years)+ day) + " days " );
    }
}
