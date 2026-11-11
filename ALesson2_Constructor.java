import javax.swing.*;

public class ALesson2_Constructor extends JFrame
{
    //Buttons 
    JButton b1 = new JButton("Press this Button");
    JButton b2 = new JButton("HELLO");
    JTextField b3 = new JTextField ("Type here");
    JComboBox b4 = new JComboBox ();
    JCheckBox b5 = new JCheckBox();
    //Constructor
    public ALesson2_Constructor(){
        setSize(500,500); //  The Size of the Window
        setLayout(null);
        //Buttons below
        //Button1
        b1.setSize(200,40);
        b1.setLocation(10,55);
        add(b1);
        //Button 2
        b2.setSize(200,40);
        b2.setLocation(5,10);
        add(b2);
        //Button 3
        b3.setSize(80,40);
        b3.setLocation(300,75);
        add(b3);
        //Button 4
        b4.setSize(80,40);
        b4.setLocation(320,105);
        add(b4);
        //Button 5
        b5.setSize(500,40);
        b5.setLocation(360,205);
        add(b5);
       
        setVisible(true);// Makes window visible

    }
    public static void main(String [] args){
        new ALesson2_Constructor();
        // new is added when calling a constructor
        
        
    }
}
