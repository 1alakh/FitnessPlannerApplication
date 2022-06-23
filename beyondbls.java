import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;

public class beyondbls extends JFrame implements ActionListener

{
JLabel li;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
JButton b1,b2,b3;
ButtonGroup bg;


public beyondbls()
{
super(" BEYOND BIGGER LEANER STRONGER");

setSize(1200,800);
setLayout(null);

l1=new JLabel("BEYOND BIGGER LEANER STRONGER");
l2=new JLabel("WEEK 1 - WEEK 4 :		Normal Week");
l3=new JLabel("WEEK 5:		Power Week");
l4=new JLabel("WEEK 6:		Deadload/Rest Week");
l5=new JLabel("a) 2 Warm up sets");
l6=new JLabel("b) 2 POWER sets,90% of 1RM, Rest=3-5 mins");
l7=new JLabel("c) 6 Myofibrillar set, 80%of1RM, Rest= 2-3 min");
l8=new JLabel("d) 2 Sarcoplasmic set, 70% of 1RM, Rest= 1-2 mins");
l9=new JLabel("a) 2 Warm up sets");
l10=new JLabel("b) 2 POWER sets, 90% of 1RM, Rest=3-5 mins");
l11=new JLabel("c) ONE 1RM set, 100%of1RM, Rest= 2-3 min");
l12=new JLabel("d) 6 Myofibrillar sets , 80%of1RM, Rest= 2-3 min");
l13=new JLabel("e) 2 Sarcoplasmic sets , 70% of 1RM, Rest= 1-2 mins");
l14=new JLabel("a) 9 SETS PER WORKOUT");
l15=new JLabel("b) 40% OF 1RM");
l16=new JLabel("c) DONE FOR PUMP WITH 1 MIN REST");



l1.setBounds(600, 1, 800, 100);
l2.setBounds(10, 100, 400, 50);
l3.setBounds(800, 100, 400, 50);
l4.setBounds(1400, 100, 400, 50);
l5.setBounds(10, 180, 300, 70);
l6.setBounds(10, 240, 800, 70);
l7.setBounds(10, 300, 800, 70);
l8.setBounds(10, 360, 800, 70);
l9.setBounds(800, 180, 300, 70);
l10.setBounds(800, 240, 800, 70);
l11.setBounds(800, 300, 800, 70);
l12.setBounds(800, 360, 800, 70);
l13.setBounds(800, 420, 800, 70);
l14.setBounds(1400, 180, 800, 70);
l15.setBounds(1400, 240, 800, 70);
l16.setBounds(1400, 300, 800, 70);







Font f0 = new Font("Times New Roman" ,Font.BOLD, 25);
Font f1 = new Font("Times New Roman" ,Font.BOLD, 22);
Font f2 = new Font("Times New Roman" ,Font.ITALIC, 45);

l1.setFont(f2);
l1.setForeground(Color.black);



l2.setFont(f0);
l2.setForeground(Color.blue);
l3.setFont(f0);
l3.setForeground(Color.blue);
l4.setFont(f0);
l4.setForeground(Color.blue);

l5.setFont(f1);
l5.setForeground(Color.black);
l6.setFont(f1);
l6.setForeground(Color.black);
l7.setFont(f1);
l7.setForeground(Color.black);
l8.setFont(f1);
l8.setForeground(Color.black);
l9.setFont(f1);
l9.setForeground(Color.black);
l10.setFont(f1);
l10.setForeground(Color.black);
l11.setFont(f1);
l11.setForeground(Color.black);
l12.setFont(f1);
l12.setForeground(Color.black);
l13.setFont(f1);
l13.setForeground(Color.black);
l14.setFont(f1);
l14.setForeground(Color.black);
l15.setFont(f1);
l15.setForeground(Color.black);
l16.setFont(f1);
l16.setForeground(Color.black);

ImageIcon i = new ImageIcon("p10.jpg"); 

li=new JLabel(i);
li.setBounds(0,0,1920,990);


b3=new JButton("Normal week");
b1=new JButton("Power week");
b2=new JButton("Deadload week");

b1.setBounds(1050, 600, 400, 50);
b3.setBounds(450, 600, 400, 50);
b2.setBounds(1350, 600, 400, 50);
Font f21 = new Font("Times New Roman" ,Font.BOLD, 45);
b3.setFont(f21);
b3.setForeground(Color.red);

b1.setFont(f21);
b1.setForeground(Color.red);
b2.setFont(f21);
b2.setForeground(Color.red);

bg=new ButtonGroup();
add(b1);
//add(b2);
add(b3);
b3.addActionListener(this);
b1.addActionListener(this);
//b2.addActionListener(this);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l14);
add(l15);
add(l16);

add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b3)
{
sessfive obj = new sessfive();
}
if(e.getSource()==b1)
{
power obj = new power();
}
}

public static void main(String args[])
{
beyondbls obj=new beyondbls();
}


}