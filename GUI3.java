// action listener // mouse listener
import javax.swing.*;

public class GUI3 extends JFrame {
    JTextField tf;
    JButton b;
    JTextArea ta;

    public static void main(String[] args) {
        new GUI3();
    }

    public GUI3() {  // Constructor
        setSize(50, 500);
        setLayout(null);

        tf = new JTextField();
        tf.setSize(80, 20);
        tf.setLocation(50, 50);  // Corrected from setLoacation to setLocation
        add(tf);

        b = new JButton("Submit");
        b.setSize(80, 20);
        b.setLocation(50, 100);  // Changed location to avoid overlap with tf
        add(b);

        ta = new JTextArea();
        ta.setBounds(50, 150, 300, 200);  // Added bounds for the JTextArea
        add(ta);

        setVisible(true);
    }
}