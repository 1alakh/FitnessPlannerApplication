import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import java.io.*;
public class client extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,la,lb,lc,ld,li;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;

public  client ()
{
}
    public client(String regno, String gender, String dob)
    {
        super("FITNESS PLANNER");
        setSize(1400,600);
        setLayout(null);

        b1=new JButton("MAINTENANCE PHASE");
        b2=new JButton("GAINING PHASE");
        b3=new JButton("CUTTING PHASE");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4=new JButton("Mind Fitness");
	b4.addActionListener(this);
        l1=new JLabel(" FITNESS PLANNER");
        l2=new JLabel("Registeration Number");
        l3=new JLabel("Age");
        l4=new JLabel("Height");
	l5=new JLabel("Gender");
        l6=new JLabel("Current Weight (In Kg)");
        l7=new JLabel("Hours of Exercising/ week");
        l8=new JLabel("Minutes of Exercising/ day");
        l9=new JLabel("Feet");
	l10=new JLabel("Inches");

la=new JLabel("");
lb=new JLabel("");
lc=new JLabel("");
ld=new JLabel("");

ImageIcon i = new ImageIcon("p10.jpg"); 

li=new JLabel(i);



        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
	t7=new JTextField();
	t8=new JTextField();

t1.setText(regno);
t4.setText(gender);

try
{
SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
String d1=dob;
java.util.Date date1=sd.parse(d1);
java.util.Date date2=new java.util.Date();
long k=(date2.getTime()-date1.getTime())/1000/60/60/24/365;
t2.setText(String.valueOf(k));
}
catch(Exception e)
{}



        b1.setBounds(420, 580, 300, 65);
        b2.setBounds(820, 580, 300 ,65);
        b3.setBounds(1220, 580, 300, 65);
        b4.setBounds(820, 720, 300, 65);

        l1.setBounds(750, 10,  450, 50);
        l2.setBounds(760, 100, 240 , 50);
        l3.setBounds(764, 150, 140, 50);
        l4.setBounds(760, 200, 140 , 50);
        l5.setBounds(760, 250, 190 , 50);
        l6.setBounds(760, 300, 190 , 50);
        l7.setBounds(760, 350, 230 , 50);
	l8.setBounds(760, 400, 230 , 50);
	l9.setBounds(1040, 200, 140 , 50);
	l10.setBounds(1170, 200, 140 , 50);

la.setBounds(1310, 200, 340 , 50);
lb.setBounds(1150, 300, 340 , 50);
lc.setBounds(1150, 350, 390 , 50);
ld.setBounds(1150, 400, 340 , 50);
li.setBounds(0,0,1920,990);




      t1.setBounds(1080, 115, 55 , 20);
      t2.setBounds(1080, 165, 55, 20);
      t3.setBounds(1080, 215, 55, 20);
      t4.setBounds(1080, 265, 55, 20);
      t5.setBounds(1080, 315, 55, 20);
      t6.setBounds(1080, 365, 55, 20);
      t7.setBounds(1080, 415, 55, 20);
      t8.setBounds(1235, 215, 55, 20);

        Font f = new Font("Times New Roman" ,Font.BOLD, 45);
        Font f2 = new Font("Times New Roman" ,Font.ITALIC, 16);
	Font f3 = new Font("Times New Roman" ,Font.BOLD, 18);
        l1.setFont(f);
        l1.setForeground(Color.blue);
	l2.setFont(f3);
        l2.setForeground(Color.black);
	l3.setFont(f3);
        l3.setForeground(Color.black);
	l4.setFont(f3);
        l4.setForeground(Color.black);
	l5.setFont(f3);
        l5.setForeground(Color.black);
	l6.setFont(f3);
        l6.setForeground(Color.black);
	l7.setFont(f3);
        l7.setForeground(Color.black);
        l8.setFont(f3);
        l8.setForeground(Color.black);
	l9.setFont(f3);
        l9.setForeground(Color.black);
	l10.setFont(f3);
        l10.setForeground(Color.black);

	la.setFont(f2);
        la.setForeground(Color.black);
	lb.setFont(f2);
        lb.setForeground(Color.black);
	lc.setFont(f2);
        lc.setForeground(Color.black);
	ld.setFont(f2);
        ld.setForeground(Color.black);
	
	Font f4 = new Font("Times New Roman" ,Font.BOLD, 15);
	t1.setFont(f4);
	t1.setForeground(Color.blue);
	t2.setFont(f4);
	t2.setForeground(Color.blue);
	t3.setFont(f4);
	t3.setForeground(Color.blue);
	t4.setFont(f4);
	t4.setForeground(Color.blue);
	t5.setFont(f4);
	t5.setForeground(Color.blue);
	t6.setFont(f4);
	t6.setForeground(Color.blue);
	t7.setFont(f4);
	t7.setForeground(Color.blue);
	t8.setFont(f4);
	t8.setForeground(Color.blue);


        add(b1);
        add(b2);
        add(b3);
        add(b4);
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
        
add(la);
add(lb);
add(lc);
add(ld);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
	add(t7);
	add(t8);
	add(li);
	setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
   
        
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int err=0;
if(t3.getText().trim().equals(""))
{
err= 1;
la.setText("*Please Enter Height");
}
else
{
la.setText("");
}
if(t8.getText().trim().equals(""))
{
err= 1;
la.setText("*Please Enter Height");
}
else
{
la.setText("");
}

if(t5.getText().trim().equals(""))
{
err= 1;
lb.setText("*Please Enter Current Weight");
}
else
{
lb.setText("");
}

if(t6.getText().trim().equals(""))
{
err= 1;
lc.setText("*Please Enter Hours Of Exercise performed per week");
}
else
{
lc.setText("");
}
if(t7.getText().trim().equals(""))
{
err= 1;
ld.setText("*Please Enter Minutes of Workout Per Session");
}
else
{
ld.setText("");
}
if(err==0)
{
t5.setText( String.valueOf(Double.parseDouble(t5.getText())*2.2046));
maintenancephase obj = new maintenancephase(Integer.parseInt(t2.getText()),Double.parseDouble(t3.getText()), Double.parseDouble(t8.getText()), t4.getText(), Double.parseDouble(t5.getText()), Double.parseDouble(t6.getText()), Double.parseDouble(t7.getText()));
this.dispose();
}
}
if(e.getSource()==b2)
{
int err=0;
if(t3.getText().trim().equals(""))
{
err= 1;
la.setText("*Please Enter Height");
}
else
{
la.setText("");
}
if(t8.getText().trim().equals(""))
{
err= 1;
la.setText("*Please Enter Height");
}
else
{
la.setText("");
}

if(t5.getText().trim().equals(""))
{
err= 1;
lb.setText("*Please Enter Current Weight");
}
else
{
lb.setText("");
}

if(t6.getText().trim().equals(""))
{
err= 1;
lc.setText("*Please Enter Hours Of Exercise performed per week");
}
else
{
lc.setText("");
}
if(t7.getText().trim().equals(""))
{
err= 1;
ld.setText("*Please Enter Minutes of Workout Per Session");
}
else
{
ld.setText("");
}
if(err==0)
{
t5.setText( String.valueOf(Double.parseDouble(t5.getText())*2.2046));

gainingphase obj = new gainingphase(Integer.parseInt(t2.getText()),Double.parseDouble(t3.getText()), Double.parseDouble(t8.getText()), t4.getText(), Double.parseDouble(t5.getText()), Double.parseDouble(t6.getText()), Double.parseDouble(t7.getText()));

this.dispose();
}
}
if(e.getSource()==b3)
{
int err=0;
if(t3.getText().trim().equals(""))
{
err= 1;
la.setText("*Please Enter Height");
}
else
{
la.setText("");
}
if(t8.getText().trim().equals(""))
{
err= 1;
la.setText("*Please Enter Height");
}
else
{
la.setText("");
}

if(t5.getText().trim().equals(""))
{
err= 1;
lb.setText("*Please Enter Current Weight");
}
else
{
lb.setText("");
}

if(t6.getText().trim().equals(""))
{
err= 1;
lc.setText("*Please Enter Hours Of Exercise performed per week");
}
else
{
lc.setText("");
}
if(t7.getText().trim().equals(""))
{
err= 1;
ld.setText("*Please Enter Minutes of Workout Per Session");
}
else
{
ld.setText("");
}
if(err==0)
{
t5.setText( String.valueOf(Double.parseDouble(t5.getText())*2.2046));

cuttingphase obj = new cuttingphase(Integer.parseInt(t2.getText()),Double.parseDouble(t3.getText()), Double.parseDouble(t8.getText()), t4.getText(), Double.parseDouble(t5.getText()), Double.parseDouble(t6.getText()), Double.parseDouble(t7.getText()));

this.dispose();
}
}
if(e.getSource()==b4)
{
med obj = new med();
}

}
    public static void main(String args[])
    {
       client  obj=new client();
       
	
    }
}
