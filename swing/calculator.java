import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator{
    public static void main(String[] args) {
        abc o = new abc();
    }
}

class abc extends JFrame implements ActionListener{

    JLabel l1,l2,choice,res;
    JTextField t1,t2;
    abc(){
        setLayout(new FlowLayout());
        l1= new JLabel("Number 1");
        l2= new JLabel("Number 2");
        choice = new JLabel("1. ADD\n 2. SUBTRACT\n 3.MULTIPLY\n 4.DIVIDE\n");
        t1= new JTextField(20);
        t2= new JTextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);

        setVisible(true);
        setSize(400,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionListener){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        switch(choice.getText()){

        }
    }
}