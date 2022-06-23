import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.text.*;

public class loginpage extends JFrame implements ActionListener
{

JButton b1;
JTextField t1,t2;
JLabel l1,l2,l3,li;
Connection con ;
int kkk=0;
public loginpage()
{
super("Login Page ");
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"IRS9Kg@1" );
}
catch(Exception e) 
{
l1.setText("error1 : "+e.toString());
// System.out.println(e);
}
setSize(1000,400);
setLayout(null);
b1=new JButton("Login");
b1.addActionListener(this);

l1=new JLabel("User-ID");
l2=new JLabel("Password");
l3=new JLabel("Fitness Planner System");
t1=new JTextField();
t2=new JPasswordField();
ImageIcon i = new ImageIcon("p10.jpg"); 

li=new JLabel(i);
li.setBounds(0,0,1920,990);


  b1.setBounds(650, 490, 140, 40);
  l1.setBounds(550, 310, 450, 60);
  l2.setBounds(550, 380, 140 ,40);
  t1.setBounds(685, 332, 150 ,20);
  t2.setBounds(685, 393, 150, 20);
  l3.setBounds(490, 10, 600,50);

Font f = new Font("Baskerville" ,Font.BOLD, 25);
l1.setFont(f);
l2.setFont(f);

Font f2 = new Font("Times New Roman" ,Font.BOLD, 50);
l3.setFont(f2);
l3.setForeground(Color.blue);

add(b1);

add(l1);
add(l2);
add(l3);

add(t1);
add(t2);
add(li);

setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String k ="";
int kkk=0;
if(e.getSource()==b1)
{

try
{
Statement stmt = con.createStatement();
ResultSet  rs= stmt.executeQuery("Select * from all_users where user_id ='"+t1.getText()+ "' and user_pass='" +t2.getText()+"'") ;
if(rs.next())
{
kkk=1;


String type1=rs.getString(3);

if(type1.equals("admin"))
{
adminpage obj=new adminpage();
this.dispose();
}
else
{
SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
java.util.Date date1=new java.util.Date();

k= String.valueOf(sd.format(date1));
String user_id= t1.getText();
String Time =k;

Statement stmnt2 = con.createStatement();

String str2 = "insert into time_of_login values('"+user_id+"','"+k+"')";
System.out.println(str2);
stmt.close();
if(kkk==1)
{
stmnt2.executeUpdate(str2);
stmnt2.close();
kkk=1;
}





login2 obj=new login2(t1.getText());
this.dispose();
}
}
else
JOptionPane.showMessageDialog(this,"Invalid User");
}
catch(Exception mse)
{ 
l1.setText("error2 : "+mse.toString());
System.out.println(mse);
}
}
}
}


