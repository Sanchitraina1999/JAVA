import javax.swing.*;
import java.awt.*;

public class addSwing{
    public static void main(String[] args) {
        abc o = new abc();

    }
}

class abc extends JFrame{
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(80,60);

    JLabel l1 = new JLabel("Number 1");
    JTextField jt1 = new JTextField();

    add(l1);
    add(jt1);

    JLabel l2 = new JLabel("Number 2");
    add(l2);

    JTextField jt2 = new JTextField();
    add(jt2);


}