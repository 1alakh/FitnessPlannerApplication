import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import javax.swing.table.*;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;

public class adminexr extends JFrame implements ActionListener
{

JTableHeader th;
JLabel l1,li2;
JTextField t1;
JButton b1;
TableColumnModel columnModel;
Connection con;
public adminexr()
{

super("LOG FILE ");
setSize(1400,900);
setLayout(null);

//getContentPane().setBackground(Color.red);
try
{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost/fps" , "root" ,"dC4M7R@1" );
l1=new JLabel("DATE :");
t1=new JTextField("");
b1=new JButton("ENTER");
b1.addActionListener(this);

SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
java.util.Date date1=new java.util.Date();
t1.setText(String.valueOf(sd.format(date1)));

Font f2 = new Font("Times New Roman" ,Font.BOLD, 20);
t1.setFont(f2);
t1.setForeground(Color.black);


l1.setBounds(850, 10 , 300, 50);
t1.setBounds(950, 10 , 100, 50);
b1.setBounds(1350, 10,150,40);
Font f20 = new Font("Times New Roman" ,Font.BOLD, 20);
l1.setFont(f20);
l1.setForeground(Color.blue);

add(l1);
add(t1);
add(b1);
}
catch(Exception e)
{
System.out.println(e.toString());
}
ImageIcon i2 = new ImageIcon("p12.jpg"); 

li2=new JLabel(i2);
li2.setBounds(0,0,1920,1200);
add(li2);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{

try 
{

int k=0;
Statement stmntx = con.createStatement();
String as1= "Select * from maintain_rec where date ='"+t1.getText()+"'";
System.out.println(as1);
ResultSet  rs1= stmntx.executeQuery(as1);

while(rs1.next())
{
k++;
}
Object row[][] =new Object[k][7];
String cal [] = new String[]{"Reg.no","Name ","Muscle group name ","ExerciseName ","set", "reps","rest"};
if(k==0)
{
JOptionPane.showMessageDialog(this,"RECORD OF THIS DATE DOESNOT EXIST");
}
else{
Statement stmnt = con.createStatement();
String as2= "Select maintain_rec.adm_no,sname,muscle_group_name,exc_name,sets,reps,rest from reg,maintain_rec where reg.adm_no=maintain_rec.adm_no and date ='"+t1.getText()+"'";
System.out.println(as2);
ResultSet  rs= stmnt.executeQuery(as2);
int i =0;
while(rs.next())
{
row[i][0] =rs.getString(1);
row[i][1] =rs.getString(2);
row[i][2] =rs.getString(3);
row[i][3] =rs.getString(4);
row[i][4] =rs.getString(5);
row[i][5] =rs.getString(6);
row[i][6] =rs.getString(7);
i++;
}
JTable t = new JTable(row, cal);

JScrollPane s = new JScrollPane(t);
s.setBounds( 350, 100, 1000, 850);
s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
add(b1);

t.setRowHeight(78);
th = t.getTableHeader();

Font f2 = new Font("Times New Roman"  ,Font.BOLD, 15);
th.setFont(f2);
columnModel = t.getColumnModel();
columnModel.getColumn(0).setPreferredWidth(20);
columnModel.getColumn(3).setPreferredWidth(150);
columnModel.getColumn(4).setPreferredWidth(20);
columnModel.getColumn(6).setPreferredWidth(15);

add(s);

revalidate();
b1.setEnabled(false);

//add(li2);
}
}
catch(Exception el)
{
System.out.println(el.toString());
}



}

}


public static void main(String args[])
{
adminexr obj=new adminexr();
}
}