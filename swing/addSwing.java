import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addSwing {
    public static void main(String[] args) {
        abc o = new abc();
    }
}

class abc extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField jt1, jt2;
    JButton b;

    abc() {
        setLayout(new FlowLayout());

        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        jt1 = new JTextField(20);
        jt2 = new JTextField(20);
        l3 = new JLabel("Result is: ");
        b = new JButton("Add");

        add(l1);
        add(jt1);
        add(l2);
        add(jt2);

        add(b);

        b.addActionListener(this);

        add(l3);

        setVisible(true);
        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int res = a + b;

        l3.setText(l3.getText() + res);
    }

}