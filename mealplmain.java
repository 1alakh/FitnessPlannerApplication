import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.JTableHeader;
import java.awt.print.*;
import java.awt.geom.*;

public class mealplmain extends JFrame implements ActionListener
{
double k1, k2,k3,k4,k5,k6,k7,k8,k9,k10,F1,F2,F3,Z1,Z2,Z3,X1,X2,X3; 
JLabel l1,l2,l3,li;
JRadioButton r1,r2,r3;
JButton b1, b2;
ButtonGroup bg;
JTableHeader th;
JTable t;
private String[] title = new String[]{"Meal" ,"Protein","Carbohydrate","Fat"};

public mealplmain()
{
}
public mealplmain(double PROTEIN, double CARBOHYDRATE, double FAT)
{
super("MEAL PLAN FOR CLIENT");
setSize(1200,800);
setLayout(null);
b1=new JButton("Get Meal Plan");
b2=new JButton("PRINT MEAL PLAN");
l2=new JLabel("NUMBER OF MEALS PER DAY :");
l3=new JLabel("'BUILD WITH SCIENCE'");

ImageIcon i = new ImageIcon("p12.jpg"); 
li=new JLabel(i);
li.setBounds(0,0,1920,1200);


bg= new ButtonGroup();
r1=new JRadioButton("4");
r2=new JRadioButton("5");
r3=new JRadioButton("6");
bg.add(r1);
bg.add(r2);
bg.add(r3);
 k1 = PROTEIN/4;
 k2 = PROTEIN/5;
 k3=  PROTEIN/6;
 k4= 0.15* CARBOHYDRATE;
 k5= 0.25* CARBOHYDRATE;
 k6= 0.35* CARBOHYDRATE;
 k7= 0.20* CARBOHYDRATE;
 k8= 0.30* CARBOHYDRATE;
 k9 =0.18* CARBOHYDRATE;
 k10=0.13* CARBOHYDRATE;
 F1= FAT/4;
 F2= FAT/5;
 F3= FAT/6;
 Z1= F1+5;
 Z2= F2+5;
 Z3= F3+5;
 X1=F1-5;
 X2=F2-5;
 X3=F3-5;
//String [][] data=new String[4][4];

//JTable t = new JTable(data, title);
//JScrollPane s = new JScrollPane(t);

b1.setBounds(1400, 55, 180, 50);
b1.addActionListener(this);

b2.setBounds(1300, 900, 180, 50);
b2.addActionListener(this);
l2.setBounds(700,8, 380, 30);
l3.setBounds(1200,800,500,100);
r1.setBounds(1200, 20,50, 30);
r2.setBounds(1200, 60,50, 30);
r3.setBounds(1200, 100, 50, 30);
//s.setBounds( 450, 260, 700, 200);

//s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
add(b1);
add(l2);
add(b2);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 25);
l2.setFont(f2);
l2.setForeground(Color.blue);
r1.setFont(f2);
r1.setForeground(Color.blue);
//s.setFont(f2);
//s.setForeground(Color.black);
r2.setFont(f2);
r2.setForeground(Color.blue);
r3.setFont(f2);
r3.setForeground(Color.blue);

Font f3 = new Font("Times New Roman" ,Font.BOLD, 35);
l3.setFont(f3);
l3.setForeground(Color.red);
add(r1);
add(r2);
add(r3);
add(l3);
add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);



setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
//l3.setVisible(true);

title = new String[]{"Meal" ,"Protein","Carbohydrate","Fat"};

String [][] data=new String[4][4];
if(r1.isSelected())
{
data = new String[][]{{"MEAL 1" , String.valueOf(String.format("%.2f",k1)),String.valueOf(String.format("%.2f",k4)),String.valueOf(String.format("%.2f",Z1))},{"PREWORKOUT MEAL" , String.valueOf(String.format("%.2f",k1)),String.valueOf(String.format("%.2f",k5)),String.valueOf(String.format("%.2f",X1))}, {"POSTWORKOUT MEAL", String.valueOf(String.format("%.2f",k1)),String.valueOf(String.format("%.2f",k6)),String.valueOf(String.format("%.2f",F1))},{"BEDTIME MEAL", String.valueOf(String.format("%.2f",k1)),String.valueOf(String.format("%.2f",k5)),String.valueOf(String.format("%.2f",F1))}};
}
else if(r2.isSelected())
{
  data = new String[][] {{"MEAL 1" , String.valueOf(String.format("%.2f",k2)),String.valueOf(String.format("%.2f",k4)),String.valueOf(String.format("%.2f",Z2))},{"MEAL 2" , String.valueOf(String.format("%.2f",k2)),String.valueOf(String.format("%.2f",k4)),String.valueOf(String.format("%.2f",F2))},{"PREWORKOUT MEAL" , String.valueOf(String.format("%.2f",k2)),String.valueOf(String.format("%.2f",k7)),String.valueOf(String.format("%.2f",X2))}, {"POST WORKOUT MEAL", String.valueOf(String.format("%.2f",k2)),String.valueOf(String.format("%.2f",k8)),String.valueOf(String.format("%.2f",F2))},{"BEDTIME MEAL", String.valueOf(String.format("%.2f",k2)),String.valueOf(String.format("%.2f",k7)),String.valueOf(String.format("%.2f",F2))}};
}
else if(r3.isSelected())
{
  data = new String[][] {{"MEAL1" , String.valueOf(String.format("%.2f",k3)),String.valueOf(String.format("%.2f",k10)),String.valueOf(String.format("%.2f",F3))},{"MEAL 2" , String.valueOf(String.format("%.2f",k3)),String.valueOf(String.format("%.2f",k10)),String.valueOf(String.format("%.2f",F3))},{"PRE WORKOUT MEAL" , String.valueOf(String.format("%.2f",k3)),String.valueOf(String.format("%.2f",k9)),String.valueOf(String.format("%.2f",X3))}, {"POST WORKOUT MEAL", String.valueOf(String.format("%.2f",k3)),String.valueOf(String.format("%.2f",k5)),String.valueOf(String.format("%.2f",F3))},{"SNACKS", String.valueOf(String.format("%.2f",k3)),String.valueOf(String.format("%.2f",k10)),String.valueOf(String.format("%.2f",Z3))},{"BEDTIME MEAL", String.valueOf(String.format("%.2f",k3)),String.valueOf(String.format("%.2f",k9)),String.valueOf(String.format("%.2f",F3))}};
}
else
JOptionPane.showMessageDialog(this,"Please select no. of meals");

t = new JTable(data, title);
JScrollPane s = new JScrollPane(t);
s.setBounds( 450, 100, 700, 550);
s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

t.setRowHeight(70);

th = t.getTableHeader();
Font f2 = new Font("Times New Roman"  ,Font.BOLD, 17);
th.setFont(f2);

System.out.println(data);




add(s);
revalidate();

}

if(e.getSource()==b2)
{
        try {
            boolean print = t.print();
            if (!print) {
                JOptionPane.showMessageDialog(null, "Unable To Print !!..");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
}

}
public static void main(String args[])
    {
       mealplmain obj=new mealplmain();
    }

}


