import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {
    public static void main(String[] args) {
        abc o = new abc();
    }
}

class abc extends JFrame implements ActionListener {

    JLabel l1, l2, choice, res, l3;
    JTextField t1, t2,t3;
    JButton btn;

    abc() {
        setLayout(new FlowLayout());
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        choice = new JLabel("1. ADD\n 2. SUBTRACT\n 3.MULTIPLY\n 4.DIVIDE\n");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        l3 = new JLabel("Result will be displayed here");
        btn = new JButton("Get Result");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(choice);
        add(t3);
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
        setSize(300, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        switch (Integer.parseInt(t3.getText())) {
            case 1:
                l3.setText("" + a + b);
                break;
            case 2:
                l3.setText("" + (a - b));
                break;
            case 3:
                l3.setText("" + a * b);
                break;
            case 4:
                l3.setText("" + a / b);
                break;
        }
    }
}