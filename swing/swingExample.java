import javax.swing.*;
import java.awt.*;

public class swingExample {
    public static void main(String[] args) {
        Abc ob = new Abc();

    }
}

class Abc extends JFrame {
    public Abc() {
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Name");
        JTextField jt = new JTextField(20);
        JButton b1 = new JButton("Submit");
        add(l1);
        add(jt);
        add(b1);
        setVisible(true);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}