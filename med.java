import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.awt.Desktop;
import java.net.URI;
public class med extends JFrame implements ActionListener
{
JLabel l1,li;
JButton b1,b2;


public med()
{
super("EXERCISE PROGRAM FOR BEGINNERS TO ADVANCE");

setSize(1200,800);
setLayout(null);


l1=new JLabel("Fitness Of Mind Is Also Important");
b1=new JButton("Meditation's");
b2=new JButton("Padamsadhna");

b1.setBounds(560, 600, 940, 50);
b2.setBounds(560, 400,940, 50);
l1.setBounds(700, 1, 800, 50);
ImageIcon i = new ImageIcon("p10.jpg"); 

li=new JLabel(i);
li.setBounds(0,0,1920,990);

Font f1 = new Font("Times New Roman" ,Font.ITALIC, 50);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 45);
l1.setFont(f1);
l1.setForeground(Color.blue);

b1.setFont(f2);
b1.setForeground(Color.red);
b2.setFont(f2);
b2.setForeground(Color.red);

b1.addActionListener(this);
b2.addActionListener(this);
add(b1);
add(b2);
add(l1);
add(li);
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{

  try {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) 
{
    Desktop.getDesktop().browse(new URI("https://www.youtube.com/playlist?list=PL480C9CCB94DF5D82"));
}
    } catch (Exception ee) {
        ee.printStackTrace();
    }

 
}
if(e.getSource()==b2)
{

  try {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) 
{
    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=9JSUszBfMbA"));
}
    } catch (Exception eee) {
        eee.printStackTrace();
    }

}

}
public static void main(String args[])
{
med obj=new med();
}


}