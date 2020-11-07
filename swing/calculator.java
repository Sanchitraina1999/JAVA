import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator{
    public static void main(String[] args) {
        abc o = new abc();
    }
}

class abc extends JFrame{

    JLabel l1,l2,choice;
    JTextField t1,t2;
    abc(){
        setLayout(new FlowLayout());
        l1= new JLabel("Number 1");
        l2= new JLabel("Number 2");
        t1= new JTextField(20);
        t2= new JTextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
    }

    publi
}