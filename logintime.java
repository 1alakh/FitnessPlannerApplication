import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.*;

public class logintime extends JFrame
{
JLabel li2;
JTableHeader th;

public logintime ()
{
super("login time ");

setSize(1800,900);
setLayout(null);


ImageIcon i2 = new ImageIcon("p12.jpg"); 
li2=new JLabel(i2);
try{

li2.setBounds(0,0,1920,990);
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"IRS9Kg@1" );

int k=100000;
Object row[][] =new Object[k][6];
String cal [] = new String[]{"Registeration Number ","Time of login"};
Statement stmnt = con.createStatement();
ResultSet  rs= stmnt.executeQuery("Select * from time_of_login;");
int i =0;
while(rs.next())
{
row[i][0] =rs.getString(1);
row[i][1] =rs.getString(2);

i++;
}





JTable t = new JTable(row, cal);
JScrollPane s = new JScrollPane(t);
s.setBounds( 350, 100, 1000, 550);
s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

t.setRowHeight(78);
th = t.getTableHeader();
Font f2 = new Font("Times New Roman"  ,Font.BOLD, 40);
Font f = new Font("Times New Roman"  ,Font.BOLD, 27);
t.setFont(f);
th.setFont(f2);

add(s);
revalidate();
}
catch(Exception e)
{
 System.out.println(e);
}
add(li2);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);

}
public static void main(String args[])
{
logintime obj=new logintime();
}
}