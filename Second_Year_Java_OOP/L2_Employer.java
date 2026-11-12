//Make a new class Employer
//name
//address
//salary

public class L2_Employer
{

    public static void main( String [] args ){
        // Read nr1 goes to employer (1)
        Employer e1 = new Employer("Name" , "Address" , 5);
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
        System.out.println(e1.getAddress());

        e1.setSalary(3000);
        System.out.println(e1.getSalary());

        e1.setName("Name");
        System.out.println(e1.getName());

        e1.setAddress("Address");
        System.out.println(e1.getAddress());
    }
}

