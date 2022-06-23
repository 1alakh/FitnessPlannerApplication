import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;

public class adminpage extends JFrame implements ActionListener
{
JLabel l1,l2,l3,li,lk;
JButton b1,b2,b3,b4;
Connection con;
public adminpage()
{
super("ADMIN PAGE");

setSize(1200,800);
setLayout(null);


b1=new JButton("Add User / Change User Details");
b1.addActionListener(this);

b2=new JButton("All User Details");
b2.addActionListener(this);
b3=new JButton("Display Exercise Planner");
b3.addActionListener(this);
b4=new JButton("Exercise Record");
b4.addActionListener(this);
l1= new JLabel(" WELCOME TO ADMIN PAGE");
l2= new JLabel("");
l3= new JLabel("  ");
ImageIcon i = new ImageIcon("p14.jpg"); 
li=new JLabel(i);
li.setBounds(0,0,1920,1200);
ImageIcon i2 = new ImageIcon("p12.jpg"); 
lk=new JLabel(i2);
lk.setBounds(0,0,1920,1200);
Font f = new Font("Times New Roman"  ,Font.BOLD, 28);
l1.setFont(f);
Font f23= new Font("Times New Roman" ,Font.BOLD, 22);
l2.setFont(f23);
l3.setFont(f23);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 17);


b1.setFont(f2);
b2.setFont(f2);
b3.setFont(f2);
b4.setFont(f2);

l1.setForeground(Color.blue);
l2.setForeground(Color.black);
l3.setForeground(Color.black);

l1.setBounds(880, 25,  500, 30);
l2.setBounds(920, 75,  100, 30);
l3.setBounds(880, 125,  200, 30);

b1.setBounds(200, 480,  350, 60);
b2.setBounds(680, 480,  200, 60);
b3.setBounds(1050, 480,  300, 60);
b4.setBounds(1500, 480,  200, 60);

add(l1);
add(l2);
add(l3);
add(b1);
add(b2);
add(b3);
add(b4);
add(li);
add(lk);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
admissionform obj = new admissionform();
}
if(e.getSource()==b2)
{
table obj = new table();
}
if(e.getSource()==b3)
{
explan obj = new explan();
}
if(e.getSource()==b4)
{
adminexr obj = new adminexr();
}
}


public static void main(String args[])
{
adminpage obj=new adminpage();
}
}
