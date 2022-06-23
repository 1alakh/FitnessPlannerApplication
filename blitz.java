import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;

public class blitz extends JFrame implements ActionListener

{
JLabel li;
JButton b1,b2,b3;
ButtonGroup bg;


public blitz()
{
super("BIGGER LEANER STRONGER");

setSize(1200,800);
setLayout(null);

ImageIcon i = new ImageIcon("p12.jpg"); 

li=new JLabel(i);
li.setBounds(0,0,1920,990);


b3=new JButton("5 workout sessions per week");
b1=new JButton("3 workout sessions per week");
b2=new JButton("4 workout sessions per week");

b1.setBounds(650, 600, 600, 50);
b2.setBounds(650, 400,600, 50);
b3.setBounds(650, 200, 600, 50);
Font f1 = new Font("Times New Roman" ,Font.BOLD, 20);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 25);
b3.setFont(f2);
b3.setForeground(Color.blue);

b1.setFont(f2);
b1.setForeground(Color.blue);
b2.setFont(f2);
b2.setForeground(Color.blue);

bg=new ButtonGroup();
add(b1);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(b2);
add(b3);
add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b3)
{
sesfive obj = new sesfive();

}
if(e.getSource()==b2)
{
sesfour obj = new sesfour();

}
if(e.getSource()==b1)
{
sesthree obj = new sesthree();

}
}

public static void main(String args[])
{
blitz obj=new blitz();
}


}