import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;

public class maintainrecord extends JFrame implements ActionListener
{
JLabel l1,l2, la, lb, lc, ld, le, l3 ,li;
int adm_no;
int count1 =50;
String s=" ";
JTextField t1,t2;
JTextField []srno=new JTextField[15];
JTextField []name1=new JTextField[15];
JTextField []sets=new JTextField[15];
JTextField []reps=new JTextField[15];
JTextField []rest=new JTextField[15];

int i=0;
int top1=250,top2=50;
JButton b1, b2, b3;
Connection con;
public maintainrecord()
{
}
public maintainrecord(String regno)
{
super("Maintain Exercise Record");
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"IRS9Kg@1" );
}
catch(Exception e)
{
 System.out.println(e);
}
adm_no=Integer.parseInt(regno);
s= regno;
setSize(1800,900);
setLayout(null);


srno[0]=new JTextField("1");
name1[0]=new JTextField();
sets[0]=new JTextField();
reps[0]=new JTextField();
rest[0]=new JTextField();


b1=new JButton("Save");
b1.addActionListener(this);
b2= new JButton("Next");
b2.addActionListener(this);
l1=new JLabel("Date");
l2=new JLabel("Muscle Group Name");
b3=new JButton("Show Log File");
b3.addActionListener(this);
l3=new JLabel("");

ImageIcon i = new ImageIcon("p12.jpg"); 

li=new JLabel(i);
li.setBounds(0,0,1920,990);


la=new JLabel("Sr.No");
lb=new JLabel("Exercise Name(Wt's)");
lc=new JLabel("Sets");
ld=new JLabel("Repititions");
le=new JLabel("Rest ");
t1=new JTextField();
t2=new JTextField();

Font f0 = new Font("Times New Roman" ,Font.BOLD, 24);
l3.setFont(f0);
l3.setForeground(Color.black);
la.setFont(f0);
la.setForeground(Color.black);
lb.setFont(f0);
lb.setForeground(Color.black);
lc.setFont(f0);
lc.setForeground(Color.black);
ld.setFont(f0);
ld.setForeground(Color.black);
le.setFont(f0);
le.setForeground(Color.black);



srno[0].setBounds(170, 250 , 200, 50);
name1[0].setBounds(370, 250 , 300, 50);
sets[0].setBounds(670, 250 , 200, 50);
reps[0].setBounds(870, 250 , 150, 50);
rest[0].setBounds(1020, 250 , 150, 50);

la.setBounds(240, 200 , 200, 50);
lb.setBounds(420, 200 , 250, 50);
lc.setBounds(715, 200 , 200, 50);
ld.setBounds(880, 200 , 200, 50);
le.setBounds(1050, 200 , 200, 50);


l1.setBounds(700, 10 , 300, 50);
l2.setBounds(700, 80 , 300, 50);


t1.setBounds(950, 10 , 100, 50);
t2.setBounds(950, 80 , 100, 50);
b1.setBounds(50, 880 , 100, 50);
l3.setBounds(1350, 880 ,300, 50);
b2.setBounds(1350, 248 ,150, 50);
b3.setBounds(1350, 40, 150, 50);
try
{
SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
java.util.Date date1=new java.util.Date();

t1.setText(String.valueOf(sd.format(date1)));
}
catch(Exception e)
{}

Font f2 = new Font("Times New Roman" ,Font.BOLD, 20);
t1.setFont(f2);
t1.setForeground(Color.black);

t2.setFont(f2);
t2.setForeground(Color.black);

Font f = new Font("Baskerville" ,Font.BOLD, 18);
l1.setFont(f);
l1.setForeground(Color.black);

l2.setFont(f);
l2.setForeground(Color.black);

//getContentPane().setBackground(cyan);
add(l1);
add(l2);
add(l3);
add(la);
add(lb);
add(lc);
add(ld);
add(le);


add(t1);
add(t2);
add(b1);
add(b2);
add(b3);

add(srno[0]);
add(name1[0]);
add(sets[0]);
add(reps[0]);
add(rest[0]);



add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);


setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b2)
{;
int x=i;
i++;

String k = String.valueOf(x+2);
srno[i]=new JTextField(k);
name1[i]=new JTextField();
sets[i]=new JTextField();
reps[i]=new JTextField();
rest[i]=new JTextField();

top1=top1+50;


srno[i].setBounds(170, top1 , 200, 50);
name1[i].setBounds(370, top1 , 300, 50);
sets[i].setBounds(670, top1 , 200, 50);
reps[i].setBounds(870, top1 , 150, 50);
rest[i].setBounds(1020, top1 , 150, 50);
add(srno[i]);
add(name1[i]);
add(sets[i]);
add(reps[i]);
add(rest[i]);
revalidate();
repaint();
add(li);
}

//for save button
if(e.getSource()==b1)
{
String date = t1.getText();
String muscle_group_name = t2.getText();

for (int x= 0; x<=i+1; x++)
{

int sr_no = Integer.parseInt(srno[x].getText());
String exc_name = name1[x].getText();
int setss = Integer.parseInt(sets[x].getText());
String repss = reps[x].getText();
String rest_in_min =rest[x].getText();

try
{
Statement stmnt = con.createStatement();
String as1= "Select * from maintain_rec where date ='"+t1.getText()+"' and adm_no ="+adm_no+" and exc_name ='"+name1[x].getText()+"'";
System.out.println(as1);
ResultSet  rs= stmnt.executeQuery(as1);


if(rs.next())
{

}
else
{
Statement stmt = con.createStatement();
String str = "insert into maintain_rec values("+adm_no+",'"+date+"','"+muscle_group_name+"',"+sr_no+",'"+exc_name+"',"+setss+",'"+repss+"','"+rest_in_min+"')";
System.out.println(str);
stmt.executeUpdate(str);
stmt.close();
l3.setText("'RECORD SAVED'");
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
showlogfile obj =new showlogfile(s);
}


}
public static void main(String args[])
{
maintainrecord obj=new maintainrecord();
}
}