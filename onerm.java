import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;

public class onerm extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,la,lb,lc,ld,le,lf,lg,lh,li,lj,lk,lm,lz,ln,lo,lp,lq,lr,l9,l10,l11,l12;
JTextField t1,t2,t3;

public onerm()
{
super("1 RM Calculations");
setSize(1800,900);
setLayout(null);
b1=new JButton("Brzeski");
b2=new JButton("Epley");
b3=new JButton("Lander");
b4=new JButton("Lombardi");
b5=new JButton("Mayhew et al.");
b6=new JButton("O'Connor");
b7=new JButton("Wathen");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

l1=new JLabel("1 RM CALCULATOR");
l2=new JLabel("Rep's Performed");
l3=new JLabel("Weight taken during last repetition");
l4=new JLabel("1 RM RESULTING WEIGHT");
l6=new JLabel("* O'Connor equation = CHEST PRESS MOVEMENTS");
l9 =new JLabel("* Lander's equation= LEG PRESS");
l10=new JLabel("* Wathen's equation= SQUAT");
l11=new JLabel("* Berzeski's equation= Millitary press");
l12=new JLabel("* Eply's equation= DEADLIFT");
l7=new JLabel("Kilograms");
l8=new JLabel("Kilograms");
ImageIcon i = new ImageIcon("p10.jpg") ;
l5=new JLabel(i);

la=new JLabel("90 % of 1RM :");
lb=new JLabel("85 % of 1RM :");
lc=new JLabel("80% of 1RM :");
ld=new JLabel("75% of 1RM :");
le=new JLabel("70% of 1RM :");
lf=new JLabel("65% of 1RM :");
lg=new JLabel("60% of 1RM :");
lh=new JLabel("55% of 1RM :");
li=new JLabel("50% of 1RM :");
lj=new JLabel("");
lk=new JLabel("");
lz=new JLabel("");
lm=new JLabel("");
ln=new JLabel("");
lo=new JLabel("");
lp=new JLabel("");
lq=new JLabel("");
lr=new JLabel("");


t1=new JTextField();
t2=new JTextField();
t3=new JTextField();

b1.setBounds(430, 600, 140, 100);
b2.setBounds(560, 600, 140 , 100);
b3.setBounds(690, 600, 140, 100);
b4.setBounds(820, 600, 140 , 100);
b5.setBounds(950, 600, 140 , 100);
b6.setBounds(1080, 600, 140 ,100);
b7.setBounds(1210,600, 140 , 100);
l6.setBounds(20, 800, 940, 100);
l9.setBounds(20, 850, 940, 100);
l10.setBounds(20, 900, 940, 100);
l11.setBounds(20, 1000, 940, 100);
l12.setBounds(20, 750, 940, 100);

l1.setBounds(780, 1,  450, 50);
l2.setBounds(720, 140, 240 , 50);
l3.setBounds(720, 200, 340, 50);
l4.setBounds(720, 300, 240 , 50);
l5.setBounds(0, 0, 1920, 990);


la.setBounds(1580, 100,  150, 50);
lb.setBounds(1580, 150,  150, 50);
lc.setBounds(1580, 200,  150, 50);
ld.setBounds(1580, 250,  150, 50);
le.setBounds(1580, 300,  150, 50);
lf.setBounds(1580, 350,  150, 50);
lg.setBounds(1580, 400,  150, 50);
lh.setBounds(1580, 450,  150, 50);
li.setBounds(1580, 500,  150, 50);

lj.setBounds(1780, 100,  150, 50);
lk.setBounds(1780, 150,  150, 50);
lz.setBounds(1780, 200,  150, 50);
lm.setBounds(1780, 250,  150, 50);
ln.setBounds(1780, 300,  150, 50);
lo.setBounds(1780, 350,  150, 50);
lp.setBounds(1780, 400,  150, 50);
lq.setBounds(1780, 450,  150, 50);
lr.setBounds(1780, 500,  150, 50);



t1.setBounds(1050, 150, 70 , 25);
t2.setBounds(1050, 210, 70, 25);
t3.setBounds(1050, 310, 70, 25);

l7.setBounds(1150, 210, 100, 25);
l8.setBounds(1150, 310, 100, 25);
Font f3 = new Font("Times New Roman" ,Font.BOLD, 16);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 18);
Font f = new Font("Times New Roman" ,Font.BOLD, 45);
l1.setFont(f);
l1.setForeground(Color.blue);

l2.setFont(f2);
l2.setForeground(Color.black);
l3.setFont(f2);
l3.setForeground(Color.black);
l4.setFont(f2);
l4.setForeground(Color.black);
l6.setFont(f2);
l6.setForeground(Color.black);
l9.setFont(f2);
l9.setForeground(Color.black);
l7.setFont(f2);
l7.setForeground(Color.black);
l8.setFont(f2);
l8.setForeground(Color.black);
l10.setFont(f2);
l10.setForeground(Color.black);
l11.setFont(f2);
l11.setForeground(Color.black);
l12.setFont(f2);
l12.setForeground(Color.black);


la.setFont(f2);
la.setForeground(Color.black);
lb.setFont(f2);
lb.setForeground(Color.black);
lc.setFont(f2);
lc.setForeground(Color.black);
ld.setFont(f2);
ld.setForeground(Color.black);
le.setFont(f2);
le.setForeground(Color.black);
lf.setFont(f2);
lf.setForeground(Color.black);
lg.setFont(f2);
lg.setForeground(Color.black);
lh.setFont(f2);
lh.setForeground(Color.black);
li.setFont(f2);
li.setForeground(Color.black);

lj.setFont(f2);
lj.setForeground(Color.black);
lk.setFont(f2);
lk.setForeground(Color.black);
lz.setFont(f2);
lz.setForeground(Color.black);
lm.setFont(f2);
lm.setForeground(Color.black);
ln.setFont(f2);
ln.setForeground(Color.black);
lo.setFont(f2);
lo.setForeground(Color.black);
lp.setFont(f2);
lp.setForeground(Color.black);
lq.setFont(f2);
lq.setForeground(Color.black);
lr.setFont(f2);
lr.setForeground(Color.black);




t3.setFont(f2);
t3.setForeground(Color.red);
t1.setFont(f2);
t1.setForeground(Color.red);
t2.setFont(f2);
t2.setForeground(Color.red);
b1.setFont(f2);
b1.setForeground(Color.black);
b2.setFont(f3);
b2.setForeground(Color.black);
b3.setFont(f3);
b3.setForeground(Color.black);
b4.setFont(f3);
b4.setForeground(Color.black);
b5.setFont(f3);
b5.setForeground(Color.black);
b6.setFont(f3);
b6.setForeground(Color.black);
b7.setFont(f3);
b7.setForeground(Color.black);





















add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);

add(l1);
add(l2);
add(l3);
add(l4);
add(l9);
add(l10);
add(l11);
add(l12);

add(la);
add(lb);
add(lc);
add(ld);
add(le);
add(lf);
add(lg);
add(lh);
add(li);
add(lj);
add(lk);
add(lz);
add(lm);
add(ln);
add(lo);
add(lp);
add(lq);
add(lr);



add(l6);
add(l7);
add(l8);
add(t1);
add(t2);
add(t3);

t3.setEnabled(false);











add(l5);

setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
t3.setEnabled(true);
double a= Double.parseDouble(t1.getText());
double b= Double.parseDouble(t2.getText());
double c= 100*b/(102.78-(2.78*a));

t3.setText(String.valueOf(String.format("%.2f",c)));
lj.setText(String.valueOf(String.format("%.2f",c*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c*0.5)));
}
else if(e.getSource()==b2)
{
t3.setEnabled(true);
double a2= Double.parseDouble(t1.getText());
double b2= Double.parseDouble(t2.getText());
double c2 = b2*(1+a2/30);
t3.setText(String.valueOf(String.format("%.2f",c2)));
lj.setText(String.valueOf(String.format("%.2f",c2*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c2*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c2*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c2*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c2*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c2*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c2*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c2*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c2*0.5)));
}
else if(e.getSource()==b3)
{
t3.setEnabled(true);
double a3= Double.parseDouble(t1.getText());
double b3= Double.parseDouble(t2.getText());
double c3 =100*b3/(101.3-(2.67123*a3));
t3.setText(String.valueOf(String.format("%.2f",c3)));
lj.setText(String.valueOf(String.format("%.2f",c3*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c3*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c3*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c3*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c3*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c3*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c3*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c3*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c3*0.5)));
}
else if(e.getSource()==b4)
{
t3.setEnabled(true);
double a4= Double.parseDouble(t1.getText());
double b4= Double.parseDouble(t2.getText());
double c4 = b4*(Math.pow(a4,0.1));

t3.setText(String.valueOf(String.format("%.2f",c4)));
lj.setText(String.valueOf(String.format("%.2f",c4*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c4*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c4*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c4*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c4*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c4*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c4*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c4*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c4*0.5)));
}

else if(e.getSource()==b5)
{
t3.setEnabled(true);
double a5= Double.parseDouble(t1.getText());
double b5= Double.parseDouble(t2.getText());
double c5 = (100 *b5)/(52.2+ 41.9*Math.exp(-0.055*a5));
t3.setText(String.valueOf(String.format("%.2f",c5)));
lj.setText(String.valueOf(String.format("%.2f",c5*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c5*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c5*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c5*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c5*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c5*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c5*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c5*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c5*0.5)));
}
else if(e.getSource()==b6)
{
t3.setEnabled(true);
double a6= Double.parseDouble(t1.getText());
double b6= Double.parseDouble(t2.getText());
double c6 = b6*(1+0.025*a6);

t3.setText(String.valueOf(String.format("%.2f",c6)));
lj.setText(String.valueOf(String.format("%.2f",c6*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c6*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c6*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c6*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c6*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c6*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c6*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c6*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c6*0.5)));
}
else if(e.getSource()==b7)
{
t3.setEnabled(true);
double a7= Double.parseDouble(t1.getText());
double b7= Double.parseDouble(t2.getText());
double c7 = (100*b7)/(48.8+ 53.8*Math.exp(-0.075*a7));

t3.setText(String.valueOf(String.format("%.2f",c7)));
lj.setText(String.valueOf(String.format("%.2f",c7*0.9)));
lk.setText(String.valueOf(String.format("%.2f",c7*0.85)));
lz.setText(String.valueOf(String.format("%.2f",c7*0.80)));
lm.setText(String.valueOf(String.format("%.2f",c7*0.75)));
ln.setText(String.valueOf(String.format("%.2f",c7*0.7)));
lo.setText(String.valueOf(String.format("%.2f",c7*0.65)));
lp.setText(String.valueOf(String.format("%.2f",c7*0.6)));
lq.setText(String.valueOf(String.format("%.2f",c7*0.55)));
lr.setText(String.valueOf(String.format("%.2f",c7*0.5)));
}
}
public static void main(String args[])
{
onerm obj=new onerm();
}
}