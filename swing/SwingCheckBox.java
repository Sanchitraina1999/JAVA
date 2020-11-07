public import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCheckBox
{
public static void main(String args[])
{
Abc obj=new Abc();
}
}

class Abc extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b;
JCheckBox c1,c2,c3;

public Abc()
{
setLayout(new FlowLayout());

l1=new JLabel("Name:");
t1=new JTextField(25); 

l2=new JLabel("College:");
t2=new JTextField(25);

l3=new JLabel("Facilities:");

c1=new JCheckBox("Hostel");
c2=new JCheckBox("Mess");
c3=new JCheckBox("Gym");

b=new JButton("Submit");

l4=new JLabel();

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(c1);
add(c2);
add(c3);
add(b);
add(l4);

b.addActionListener(this);

setVisible(true);
setSize(350,400);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public void actionPerformed(ActionEvent ae)
{
String name=t1.getText();
String college=t2.getText();
String message="Welcome "+name+" @"+college+"; You opted for ";

if(c1.isSelected())
{ 
message=message+c1.getText()+" ";
}
if(c2.isSelected())
{ 
message=message+c2.getText()+" ";
}
if(c3.isSelected())
{ 
message=message+c3.getText();
}

l4.setText(message);    
}

}