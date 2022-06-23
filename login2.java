import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;

public class login2 extends JFrame implements ActionListener
{
JLabel l1,l2,l3,li;
JButton b1,b2,b3;
String regno="";
String gender="";
String dob =" ";
public login2()
{
}
public login2(String s)
{
super("welcome page");
setSize(1800,900);
setLayout(null);
regno=s;
        b1=new JButton("Maintain Exercise Record");
        b2=new JButton("Fitness Planner");
        b3=new JButton("1 RM Calculator");
	


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);



l1= new JLabel(" WELCOME ");
l2= new JLabel(" TO ");
l3= new JLabel(" Fitness  Planner Application ");

Font f = new Font("Times New Roman"  ,Font.BOLD, 25);
l1.setFont(f);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 23);
Font f5 = new Font("Times New Roman" ,Font.BOLD, 18);
l2.setFont(f2);
b1.setFont(f5);
b2.setFont(f5);
b3.setFont(f5);

Font f3 = new Font("Times New Roman" ,Font.BOLD, 25);
l3.setFont(f3);

ImageIcon i = new ImageIcon("p10.jpg"); 

li=new JLabel(i);


l1.setBounds(880, 50,  200, 50);
l2.setBounds(920, 100,  100, 50);
l3.setBounds(800, 150,  390, 50);
li.setBounds(0,0,1920,990);

        b1.setBounds(420, 480, 300, 65);
        b2.setBounds(820, 480, 300, 65);
        b3.setBounds(1220,480, 300, 65);
	
add(l1);
add(l2);
add(l3);

add(b1);
add(b2);
add(b3);



add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"IRS9Kg@1" );

Statement stmt = con.createStatement();
ResultSet  rs= stmt.executeQuery("Select * from reg where adm_no ="+Integer.parseInt(regno));

if(rs.next())
{


maintainrecord obj = new maintainrecord(regno);
}
}
catch(Exception ezc)
{
 System.out.println(ezc);
}

}
if(e.getSource()==b2)
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"dC4M7R@1" );

Statement stmt = con.createStatement();
ResultSet  rs= stmt.executeQuery("Select * from reg where adm_no ="+Integer.parseInt(regno));

if(rs.next())
{
gender =rs.getString(6);
dob= rs.getString(5);
client obj = new client(regno,gender,dob);
}
}
catch(Exception ezc)
{
 System.out.println(ezc);
}

}

if(e.getSource()==b3)
{
onerm obj = new onerm();

}

}
public static void main(String args[])
{
login2 obj=new login2();
}
}
