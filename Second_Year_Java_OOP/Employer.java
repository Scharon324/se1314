public class Employer
{
    // initiate the command for the private integers and strings
    private String name;
    private String address;
    private int salary;
    // Nr 1 employer (1)
    public Employer(String a, String b, int c){
        name = a;
        address = b;
        salary = c;

    }
    //(e1.getSalary());
    public void setSalary(int c){
        salary = c;
    }
    //(e1.getSalary());
    public int getSalary(){
        return salary;
    }
    //(e1.getName());
    public void setName(String a){
        name = a;
    } 
    //(e1.getName());
    public String getName(){
        return name;
    }
    //(e1.getAddress());
    public void setAddress(String c){
        address = c;
    }
    //(e1.getAddress());
    public String getAddress(){
        return address;
    }
    
}
