/*
 * Make: Bedroom, price, Garden and type.
 */
public class L2
{
    public static void main(String [] args){
        House h1 = new House();

        h1.bedroom = 2;
        h1.price = 10000.00;
        h1.garden = 1;
        h1.type = "Huge house";

        System.out.println("This house has " + h1.bedroom);
        System.out.println("This house has " + h1.price);
        System.out.println("This house has " + h1.garden);
        System.out.println("This house has " + h1.type);

       
    
    }
}
