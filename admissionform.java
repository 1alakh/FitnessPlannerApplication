import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public class admissionform extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4,b5;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,li;
JTextField t1,t2,t3,t4,t5,t6,t7;
JRadioButton r1,r2;
JCheckBox j1,j2,j3;
JComboBox c1;
ButtonGroup bg;
Connection con;
int count1=10000;
public admissionform()
{
super("Administrative page ");
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"dC4M7R@1" );
}
catch(Exception e)
{
 System.out.println(e);
}

setSize(1400,900);


setLayout(null);


bg=new ButtonGroup();


b1=new JButton("New");
b2=new JButton("Save");
b3=new JButton("Modify");
b4=new JButton("Find");
b5=new JButton("Delete");




b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);



l1=new JLabel("Registeration Number");
l2=new JLabel("Name");
l3=new JLabel("Address");
l4=new JLabel("Phone");
l5=new JLabel("DOB");
l6=new JLabel("Gender");
l7=new JLabel("Hobbies");
l8=new JLabel("Gym membership");
l9=new JLabel("ADMIN PAGE");


l15=new JLabel("Set Password");

l10=new JLabel("");
l11=new JLabel("");
l12=new JLabel("");
l13=new JLabel("");
l14=new JLabel("");
l16=new JLabel("");
ImageIcon i = new ImageIcon("p10.jpg"); 

li=new JLabel(i);
li.setBounds(0,0,1920,990);

c1=new JComboBox();
c1.addItem("1 Month");
c1.addItem("2 Months");
c1.addItem("3 Months");
c1.addItem("4 Months");
c1.addItem("5 Months");
c1.addItem("6 Months");
c1.addItem("7 Months");
c1.addItem("8 Months");
c1.addItem("9 Months");
c1.addItem("10 Months");
c1.addItem("11 Months");
c1.addItem("12 Months");


t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
t5=new JTextField();
t6=new JTextField();
t7=new JPasswordField();

r1=new JRadioButton("MALE");
r2=new JRadioButton("FEMALE");

bg.add(r1);
bg.add(r2);

j1=new JCheckBox("SPORTS");
j2=new JCheckBox("MUSIC");
j3=new JCheckBox("MOVIES");


b1.setBounds(500, 550, 70, 50);
b2.setBounds(600, 550, 70, 50);
b3.setBounds(780, 550, 120 ,50);
b4.setBounds(500, 750, 70, 50);
b5.setBounds(780, 750, 120, 50);

l1.setBounds(570, 75,180, 50);
l2.setBounds(600, 115,50, 50);
l3.setBounds(600, 155,110 , 50);
l4.setBounds(600, 195,50, 50);
l5.setBounds(600, 235,50, 50);
l6.setBounds(600, 275,100 , 50);
l7.setBounds(600, 315,100, 50);
l8.setBounds(570, 375,180, 50);
l15.setBounds(600,445,100, 50);
l9.setBounds(850, 1 , 300, 100);

l10.setBounds(900, 50 ,300, 70);
l11.setBounds(990, 100 ,300, 70);
l12.setBounds(1100, 138 ,300, 70);
l13.setBounds(900, 180 ,300, 70);
l14.setBounds(900, 220 ,300, 70);
l16.setBounds(900, 428 ,300, 70);

Font f = new Font("Times New Roman" ,Font.BOLD, 25);
l9.setFont(f);
l9.setForeground(Color.black);

Font f2 = new Font("Times New Roman" ,Font.ITALIC, 18);
l10.setFont(f2);
l10.setForeground(Color.black);

l11.setFont(f2);
l11.setForeground(Color.black);

l12.setFont(f2);
l12.setForeground(Color.black);

l13.setFont(f2);
l13.setForeground(Color.black);

l14.setFont(f2);
l14.setForeground(Color.black);

l16.setFont(f2);
l16.setForeground(Color.black);

l10.setFont(f2);
l10.setForeground(Color.black);

l1.setFont(f2);
l1.setForeground(Color.black);

l2.setFont(f2);
l2.setForeground(Color.black);

l3.setFont(f2);
l3.setForeground(Color.black);

l4.setFont(f2);
l4.setForeground(Color.black);

l6.setFont(f2);
l6.setForeground(Color.black);

l7.setFont(f2);
l7.setForeground(Color.black);



l8.setFont(f2);
l8.setForeground(Color.black);

r1.setBounds(750, 280,70, 30);
r2.setBounds(820, 280,100, 30);
c1.setBounds(750, 380,100, 40);

t1.setBounds(750,80,100,30);
t2.setBounds(750,120,180,30);
t3.setBounds(750,160,300,30);
t4.setBounds(750,200,100,30);
t5.setBounds(750,240,100,30);
t7.setBounds(750,450,100,30);
t6.setBounds(600,750,100,50);


j1.setBounds(750, 315,100, 60);
j2.setBounds(850, 315,100, 60);
j3.setBounds(950, 315,100, 60);

b5.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);

add(b1);
add(b2);
add(b3);
add(b4);
add(b5);

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

add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);

add(r1);
add(r2);

add(c1);

add(j1);
add(j2);
add(j3);
add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);


setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
Statement stmt3 = con.createStatement();
String d ="Select adm_no from reg order by adm_no desc limit 1";
ResultSet  rs= stmt3.executeQuery(d);
if(rs.next())
{
count1=rs.getInt(1);
}
count1++;
}
catch(Exception ee)
{
}
t1.setText(String.valueOf(count1));
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
r1.setSelected(true);
j1.setSelected(false);
j2.setSelected(false);
j3.setSelected(false);
c1.setSelectedIndex(0);
b2.setEnabled(true);
b5.setEnabled(false);
b3.setEnabled(false);
l10.setText("");
l11.setText("");
l12.setText("");
l13.setText("");
l14.setText("");
l16.setText("");
}



if(e.getSource()==b2)
{
int err= 0;
int adm_no=0;

String sname= t2.getText();
String address= t3.getText();
String phone = t4.getText();
String dob = t5.getText();
String password = t7.getText();
String gender = "";
if(r1.isSelected())
gender="MALE";
else
gender="FEMALE";

String hobbies = "";
if(j1.isSelected())
hobbies= hobbies +" SPORTS ";
if(j2.isSelected())
hobbies= hobbies +" MUSIC ";
if(j3.isSelected())
hobbies= hobbies +" MOVIES ";


String state = " ";
err=0;
if(t1.getText().trim().equals(""))
{
err= 1;
l10.setText("*Please Enter Admission Number");
}
else
{
l10.setText("");
adm_no=Integer.parseInt(t1.getText());
}
if(t2.getText().trim().equals(""))
{
err= 1;
l11.setText("*Please Enter Name");
}
else
{
l11.setText("");
}

if(t3.getText().trim().equals(""))
{
err= 1;
l12.setText("*Please Enter Address");
}
else
{
l12.setText("");
}

if(t4.getText().trim().equals(""))
{
err= 1;
l13.setText("*Please Enter Phone Number");
}
else
{
l13.setText("");
}
if(t5.getText().trim().equals(""))
{
err= 1;
l14.setText("*Please Enter Date Of birth");
}
else
{
l14.setText("");
}
if(t7.getText().trim().equals(""))
{
err= 1;
l16.setText("*Please Enter Password");
}
else
{
l16.setText("");
}
if(err==0)
{
try
{
Statement stmnt = con.createStatement();
ResultSet  rs= stmnt.executeQuery("Select * from maintain_rec where date ="+Integer.parseInt(t1.getText()));

if(rs.next()){
JOptionPane.showMessageDialog(this,"Record already exist");
}
else
{

state =c1.getSelectedItem().toString();
Statement stmt = con.createStatement();

String str = "insert into reg values("+adm_no+",'"+sname+"','"+address+"','"+phone+"','"+dob+"','"+gender+"','"+hobbies+"','"+state+"')";
stmt.executeUpdate(str);
stmt.close();

Statement stmt2 = con.createStatement();

String pass= t7.getText();

String str2 = "insert into all_users values("+adm_no+",'"+pass+"','client')";
stmt2.executeUpdate(str2);
stmt2.close();
}
}
catch(Exception ee)
{
System.out.println(ee);
}
}
}

if(e.getSource()==b3)
{
int err=0;
String gender="";
if(r1.isSelected())
gender="MALE";
else
gender="FEMALE";

String state = " ";


String hobbies = "";
if(j1.isSelected())
hobbies= hobbies +" SPORTS ";
if(j2.isSelected())
hobbies= hobbies +" MUSIC ";
if(j3.isSelected())
hobbies= hobbies +" MOVIES ";


try
{
err=0;
if(t1.getText().trim().equals(""))
{
err= 1;
l10.setText("*Please Enter Admission Number");
}
else
{
l10.setText("");
}
if(t2.getText().trim().equals(""))
{
err= 1;
l11.setText("*Please Enter Name");
}
else
{
l11.setText("");
}

if(t3.getText().trim().equals(""))
{
err= 1;
l12.setText("*Please Enter Address");
}
else
{
l12.setText("");
}

if(t4.getText().trim().equals(""))
{
err= 1;
l13.setText("*Please Enter Phone Number");
}
else
{
l13.setText("");
}
if(t5.getText().trim().equals(""))
{
err= 1;
l14.setText("*Please Enter Date Of birth");
}
else
{
l14.setText("");
}
if(t7.getText().trim().equals(""))
{
err= 1;
l16.setText("*Please Enter Password");
}
else
{
l16.setText("");
}
if(err==0)
{

state =c1.getSelectedItem().toString();

Statement stmt = con.createStatement();
stmt.executeUpdate("update reg set sname='"+t2.getText()+"',address='"+t3.getText()+"',phone='"+t4.getText()+"',dob='"+t5.getText()+"',gender='"+gender+"',hobbies='"+hobbies+"',state='"+state+"' where adm_no ="+Integer.parseInt(t1.getText()));
stmt.close();

Statement stmt2 = con.createStatement();
String q= "update all_users set user_pass='"+t7.getText()+"' where user_id ='"+t1.getText()+"'";
System.out.println(q);
stmt2.executeUpdate(q);

stmt2.close();

b5.setEnabled(false);
b3.setEnabled(false);

}
}
//end of if(err==0)
catch(Exception se)
{
System.out.println(se);
}
}






if(e.getSource()==b4)
{
try
{
Statement stmt = con.createStatement();
ResultSet  rs= stmt.executeQuery("Select * from reg where adm_no ="+Integer.parseInt(t6.getText()));
Statement stmt2 = con.createStatement();
ResultSet  rs2= stmt2.executeQuery("Select * from all_users where user_id ='"+t6.getText()+"'");
if(rs.next()){
b5.setEnabled(true);
b3.setEnabled(true);
b2.setEnabled(false);
t1.setText(String.valueOf(rs.getInt(1)));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(rs.getString(4));
t5.setText(rs.getString(5));


if(rs.getString(6).trim().equals("MALE"))
r1.setSelected(true);
else
r2.setSelected(true);
j1.setSelected(false);
j2.setSelected(false);
j3.setSelected(false);

if(rs.getString(7).indexOf("SPORTS")>=0)
j1.setSelected(true);

if(rs.getString(7).indexOf("MUSIC")>=0)
j2.setSelected(true);

if(rs.getString(7).indexOf("MOVIES")>=0)
j3.setSelected(true);


c1.setSelectedItem(String.valueOf(rs.getString(8)));

if(rs2.next())
{
b5.setEnabled(true);
b3.setEnabled(true);
b2.setEnabled(false);
t7.setText(rs2.getString(2));
}

l10.setText("");
l11.setText("");
l12.setText("");
l13.setText("");
l14.setText("");
l16.setText("");
}
else
JOptionPane.showMessageDialog(this,"Record not found");
stmt.close();
}
catch(Exception ese)
{
System.out.println(ese);
}

}

if(e.getSource()==b5)
{
try
{
Statement stmt = con.createStatement();
stmt.executeUpdate("delete from reg where adm_no ="+Integer.parseInt(t1.getText()));
Statement stmt2 = con.createStatement();
stmt.executeUpdate("delete from all_users where user_id ='"+t6.getText()+"'");

t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t7.setText("");
r1.setSelected(true);
j1.setSelected(false);
j2.setSelected(false);
j3.setSelected(false);
c1.setSelectedIndex(0);

b5.setEnabled(false);
b3.setEnabled(false);
stmt.close();

}
catch(Exception se)
{
System.out.println(se);
}
}








}


public static void main(String args[])
{
admissionform obj=new admissionform();
}


}
