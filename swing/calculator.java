import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {
    public static void main(String[] args) {
        abc o = new abc();
    }
}

class abc extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton btn1, btn2, btn3, btn4;

    abc() {
        setLayout(new FlowLayout());
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l3 = new JLabel("Result will be displayed here");

        btn1 = new JButton("ADD");
        btn2 = new JButton("SUBTRACT");
        btn3 = new JButton("MULTIPLY");
        btn4 = new JButton("DIVIDE");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(choice);
        add(t3);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(l3);

        btn.addActionListener(this);

        setVisible(true);
        setSize(300, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if (e.getSource() == btn1) {
            l3.setText("" + (a + b));
        } else if (e.getSource() == btn2) {
            l3.setText("" + (a - b));
        } else if (e.getSource() == btn3) {
            l3.setText("" + a * b);
        } else if (e.getSource() == btn4) {
            l3.setText("" + a / b);
        }
    }
}