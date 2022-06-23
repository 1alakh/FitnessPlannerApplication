import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;

public class dayy4 extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,liz;
JLabel l6,l7,l8,l9,l10;
JButton b1;

public dayy4()
{
super("DAY 4");

setSize(1200,800);
setLayout(null);

 
ImageIcon i5 = new ImageIcon("pd5.jpg"); 
 



ImageIcon iz = new ImageIcon("p10.jpg"); 

liz=new JLabel(iz);
liz.setBounds(0,0,1920,990);

b1=new JButton("NEXT");

l4=new JLabel(i5);
//l5=new JLabel(i5);
l6=new JLabel("FOR WARM UP USE THIS TECNIQUE:");
l7=new JLabel("1st W.SET: WEIGHT= 1/2 OF 85% 1RM , REPS = 12");
l8=new JLabel("2nd W.SET: WEIGHT= 1/2 OF 85% 1RM , REPS = 10");
l9=new JLabel("3rd W.SET: WEIGHT= 3/4 OF 85% 1RM , REPS = 4");
l10=new JLabel("4th W.SET: WEIGHT= 9/10 OF 85% 1RM , REPS = 1");

l4.setBounds(500,1, 800, 950);

//l5.setBounds(510,580, 900, 300);
l6.setBounds(50,650, 400,50);
l7.setBounds(50,700, 400,50);
l8.setBounds(50,750, 400,50);
l9.setBounds(50,800, 400,50);
l10.setBounds(50,850, 400,50);
b1.setBounds(1410,400,150,50);
b1.addActionListener(this);

Font f1 = new Font("Times New Roman" ,Font.BOLD, 17);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 20);
l6.setFont(f2);
l6.setForeground(Color.blue);
l7.setFont(f1);
l7.setForeground(Color.blue);

l8.setFont(f1);
l8.setForeground(Color.blue);
l9.setFont(f1);
l9.setForeground(Color.blue);
l10.setFont(f1);
l10.setForeground(Color.blue);


add(l4);

add(b1);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(liz);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
dayy5 obj = new dayy5();
}
}


public static void main(String args[])
{
dayy4 obj=new dayy4();
}


}