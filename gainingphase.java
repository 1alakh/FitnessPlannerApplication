import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.sql.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;


public class gainingphase extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,la,lb,lc,ld,l9,l10,l11,l12,l13,l14;
JTextField t1,t2,t3,t4,t5,t6,t7,ta,tb;
JButton b1,b2;
double heightInInches, heightInMeters, weightInKilograms, bodyMassIndex , basalMetabolicRate, TDEE,calorie ;
double Protein,ProteinCal,Carbohydrate,CarbohydrateCal,FatCal,Fat,PROTEIN=0,CARBOHYDRATE=0,FAT=0,MinFat,FatRes,FatResCal,FatEx,TotalCal,FatLossCal=0;
double w,Wtdiff,Wtinc,calincperday,timetaken=0,WtGainCal=0,carbincperday,proincperday,fatincperday,rate,goalwt;
int age;
double heightFeet,heightInches;
String gender;
double currentWeight,  n , minutes;


public gainingphase()
{
}
public gainingphase(int agex, double heightFeetx ,double heightInchesx,String genderx, double currentWeightx, double nx ,double minutesx)
{
super("Gaining Phase");
setSize(1500,600);
setLayout(null);

age= agex;
heightFeet=heightFeetx;
heightInches= heightInchesx;
gender=genderx;
currentWeight=currentWeightx;
n= nx;
minutes=minutesx;

             heightInInches = (heightFeet * 12) + heightInches;

             heightInMeters = heightInInches / 39.370;
             weightInKilograms = currentWeight / 2.2046;

             bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);





	    if(currentWeight>=100 && currentWeight<=115 && minutes==0)
            {
                calorie = 1300;
            }
            else if(currentWeight>=116 && currentWeight<=130 && minutes==0)
            {
                calorie = 1500;
            }
            else if(currentWeight>=131 && currentWeight<=145 && minutes==0)
            {
                calorie = 1700;
            }
            else if(currentWeight>=146 && currentWeight<=160 && minutes==0)
            {
                calorie = 1800;
            }
            else if(currentWeight>=161 && currentWeight<=175 && minutes==0)
            {
                calorie = 1900;
            }
            else if(currentWeight>=176 && currentWeight<=190 && minutes==0)
            {
                calorie = 1950;
            }
            else if(currentWeight>=191 && currentWeight<=210 && minutes==0)
            {
                calorie = 2000;
            }
            else if(currentWeight>=211 && currentWeight<=230 && minutes==0)
            {
                calorie = 2150;
            }
            else if(currentWeight>=231 && currentWeight<=250 && minutes==0)
            {
                calorie = 2300;
            }
            else if(currentWeight>=251 && currentWeight<=275 && minutes==0)
            {
                calorie = 2500;
            }
            else if(currentWeight>=276 && currentWeight<=300 && minutes==0)
            {
                calorie = 2700;
            }
            else if(currentWeight>=100 && currentWeight<=115 && minutes<60)
            {
                calorie = 1500;
            }
            else if(currentWeight>=116 && currentWeight<=130 && minutes<60)
            {
                calorie = 1700;
            }
            else if(currentWeight>=131 && currentWeight<=145 && minutes<60)
            {
                calorie = 1900;
            }
            else if(currentWeight>=146 && currentWeight<=160 && minutes<60)
            {
                calorie = 2000;
            }
            else if(currentWeight>=161 && currentWeight<=175 && minutes<60)
            {
                calorie = 2100;
            }
            else if(currentWeight>=176 && currentWeight<=190 && minutes<60)
            {
                calorie = 2200;
            }
            else if(currentWeight>=191 && currentWeight<=210 && minutes<60)
            {
                calorie = 2300;
            }
            else if(currentWeight>=211 && currentWeight<=230 && minutes<60)
            {
                calorie = 2500;
            }
            else if(currentWeight>=231 && currentWeight<=250 && minutes<60)
            {
                calorie = 2700;
            }
            else if(currentWeight>=251 && currentWeight<=275 && minutes<60)
            {
                calorie = 2900;
            }
            else if(currentWeight>=276 && currentWeight<=300 && minutes<60)
            {
                calorie = 3100;
            }
            else if((currentWeight>=100 && currentWeight<=115) && (minutes>=60 && minutes<=120))
            {
                calorie = 1700;
            }
            else if((currentWeight>=116 && currentWeight<=130) && (minutes>=60 && minutes<=120))
            {
                calorie = 1900;
            }
            else if((currentWeight>=131 && currentWeight<=145) && (minutes>=60 && minutes<=120))
            {
                calorie = 2100;
            }
            else if((currentWeight>=146 && currentWeight<=160) && (minutes>=60 && minutes<=120))
            {
                calorie = 2250;
            }
            else if((currentWeight>=161 && currentWeight<=175) && (minutes>=60 && minutes<=120))
            {
                calorie = 2400;
            }
            else if((currentWeight>=176 && currentWeight<=190) && (minutes>=60 && minutes<=120))
            {
                calorie = 2500;
            }
            else if((currentWeight>=191 && currentWeight<=210) && (minutes>=60 && minutes<=120))
            {
                calorie = 2600;
            }
            else if((currentWeight>=211 && currentWeight<=230) && (minutes>=60 && minutes<=120))
            {
                calorie = 2800;
            }
            else if((currentWeight>=231 && currentWeight<=250) && (minutes>=60 && minutes<=120))
            {
                calorie = 3000;
            }
            else if((currentWeight>=251 && currentWeight<=275) && (minutes>=60 && minutes<=120))
            {
                calorie = 3250;
            }
            else if((currentWeight>=276 && currentWeight<=300) && (minutes>=60 && minutes<=120))
            {
                calorie = 3500;
            }
            else if(currentWeight>=100 && currentWeight<=115 && minutes>120)
            {
                calorie = 1900;
            }
            else if(currentWeight>=116 && currentWeight<=130 && minutes>120)
            {
                calorie = 2100;
            }
            else if(currentWeight>=131 && currentWeight<=145 && minutes>120)
            {
                calorie = 2300;
            }
            else if(currentWeight>=146 && currentWeight<=160 && minutes>120)
            {
                calorie = 2450;
            }
            else if(currentWeight>=161 && currentWeight<=175 && minutes>120)
            {
                calorie = 2600;
            }
            else if(currentWeight>=176 && currentWeight<=190 && minutes>120)
            {
                calorie = 2750;
            }
            else if(currentWeight>=191 && currentWeight<=210 && minutes>120)
            {
                calorie = 2900;
            }
            else if(currentWeight>=211 && currentWeight<=230 && minutes>120)
            {
                calorie = 3100;
            }
            else if(currentWeight>=231 && currentWeight<=250 && minutes>120)
            {
                calorie = 3300;
            }
            else if(currentWeight>=251 && currentWeight<=275 && minutes>120)
            {
                calorie = 3600;
            }
            else if(currentWeight>=276 && currentWeight<=300 && minutes>120)
            {
                calorie = 3900;
            }






if(gender.equals("MALE"))
{
basalMetabolicRate = 5 + (4.536 * currentWeight) + (15.88 * heightInInches) - (5 * age);
}
else
{
basalMetabolicRate =  (4.536 * currentWeight) + (15.88 * heightInInches) - (5 * age) - 161;
}

if(n==0||n==1 || n==2 || n==3){
                TDEE = basalMetabolicRate*1.2;
            }
            else if(n==4 || n==5 || n==6){
                TDEE = basalMetabolicRate*1.35;
            }
            else if(n==7 || n==8){
                TDEE = basalMetabolicRate*1.55;
            }
            else{
                TDEE = basalMetabolicRate*1.56;
            }




	la=new JLabel("Goal weight(in kg's) ");
	lb=new JLabel("Rate of increase in Weight(Kg/week) ");
	lc=new JLabel("");
	ld=new JLabel("");
	l1=new JLabel(" BMI is :");
        l2=new JLabel("BMR is :");
        l3=new JLabel("TDEE is :");
        l4=new JLabel("Calories (in Kcal) :");
	l5=new JLabel("Protein(in gm's)");
        l6=new JLabel("Carbohydrate (in gm/s)");
        l7=new JLabel("Fat (in gm's)");
        l8=new JLabel("GAINING PHASE");
	l9=new JLabel("Yellow : Carbohydrate Percentage");
	l10=new JLabel("Red : Protein Percentage");
	l11=new JLabel("Green : Fat Percentage");
	l12=new JLabel("Time taken to achieve goal weight is :");
        l13=new JLabel("");
	ta=new JTextField();
	tb=new JTextField();
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
	t7=new JTextField();
	ImageIcon i = new ImageIcon("p12.jpg"); 
	l14=new JLabel(i);


b1=new JButton("SHOW");
b1.addActionListener(this);
b2=new JButton("DISPLAY MEAL CHART");
b2.addActionListener(this);
	la.setBounds(100, 70, 250 , 100);
	lb.setBounds(100, 170, 420 , 100);
	lc.setBounds(330, 128, 210 , 30);
	ld.setBounds(330, 228, 250 , 30);
 	l1.setBounds(760, 100, 240 , 50);
        l2.setBounds(764, 150, 140, 50);
        l3.setBounds(760, 200, 140 , 50);
        l4.setBounds(760, 250, 160 , 50);
        l5.setBounds(760, 300, 190 , 50);
        l6.setBounds(760, 350, 190 , 50);
	l7.setBounds(760, 400, 190 , 50);
	l8.setBounds(760, 10,  650, 50);
	l10.setBounds( 1355, 150,290 , 50);
	l9.setBounds( 1355, 200,290 , 50);
	l11.setBounds( 1355, 250,290 , 50);
	l12.setBounds(680, 500, 450, 50);
	l13.setBounds(1120, 500, 150 , 50);
	l14.setBounds(0,0,1920,990);

Font f0 = new Font("Times New Roman" ,Font.ITALIC, 18);
lc.setFont(f0);
lc.setForeground(Color.red);
ld.setFont(f0);
ld.setForeground(Color.red);

	b1.setBounds(870,600, 120,60);	
	b2.setBounds(820,700, 220,60);		


      ta.setBounds(560, 100, 85 , 30);
      tb.setBounds(560, 200, 85 , 30);
      t1.setBounds(980, 115, 85 , 20);
      t2.setBounds(980, 165, 85, 20);
      t3.setBounds(980, 215, 85, 20);
      t4.setBounds(980, 265, 85, 20);
      t5.setBounds(980, 315, 85, 20);
      t6.setBounds(980, 365, 85, 20);
      t7.setBounds(980, 415, 85, 20);


Font f = new Font("Times New Roman" ,Font.BOLD, 45);
        l8.setFont(f);
        l8.setForeground(Color.blue);
Font f2 = new Font("Times New Roman" ,Font.BOLD, 17);
Font f3 = new Font("Times New Roman" ,Font.BOLD, 25);
        l1.setFont(f2);
        l1.setForeground(Color.black);
l2.setFont(f2);
        l2.setForeground(Color.black);
l3.setFont(f2);
        l3.setForeground(Color.black);
l4.setFont(f2);
        l4.setForeground(Color.black);
l5.setFont(f2);
        l5.setForeground(Color.black);
l6.setFont(f2);
        l6.setForeground(Color.black);
l7.setFont(f2);
        l7.setForeground(Color.black);
l12.setFont(f3);
        l12.setForeground(Color.blue);
l13.setFont(f3);
        l13.setForeground(Color.blue);
la.setFont(f3);
        la.setForeground(Color.black);
lb.setFont(f3);
        lb.setForeground(Color.black);
l9.setFont(f2);
        l9.setForeground( new Color(225,173,1));
l10.setFont(f2);
        l10.setForeground(Color.red);
l11.setFont(f2);
        l11.setForeground(Color.green);
	

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
	
	ta.setFont(f4);
	ta.setForeground(Color.blue);
	tb.setFont(f4);
	tb.setForeground(Color.blue);


l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);
l13.setVisible(false);
b2.setEnabled(false);

	add(la);
	add(lb);
	add(lc);
	add(ld);

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
	add(b1);
	add(b2);


	add(ta);
	add(tb);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
	add(t7);


t1.setEnabled(false);
t2.setEnabled(false);
t3.setEnabled(false);
t4.setEnabled(false);
t5.setEnabled(false);
t6.setEnabled(false);
t7.setEnabled(false);
        add(l14);

setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setVisible(true);
}
public void calc1()
{
calorie= TDEE;
if (minutes > 120) {
                    if(n >= 0 && n < 4 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.3 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 2.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if(n >= 4 && n < 7 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.5 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 2.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if (n >= 7 && n <= 10 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 2.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }else if (n > 10 && n <= 12 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                        fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 2.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 12 && n <= 14 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.2 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 2.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 14 && n <= 16 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.3 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 2.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    }
                }
if (minutes >= 60 && minutes<=120) {
                    if(n >= 0 && n < 4 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.3 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 2.0 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if(n >= 4 && n < 7 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.5 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 2.0 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if (n >= 7 && n <= 10 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                        fatincperday = (0.05 * calincperday)/9;
                        Protein = 1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 2.0 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 10 && n <= 12 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 2.0 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 12 && n <= 14 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.2 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 2.0 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 14 && n <= 16 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.3 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 2.0 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    }
                }
                if (minutes >= 20 && minutes<60) {
                    if(n >= 0 && n < 4 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.3 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 1.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if(n >= 4 && n < 7 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.5 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 1.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if (n >= 7 && n <= 10 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 1.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 10 && n <= 12 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 1.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 12 && n <= 14 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.2 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 1.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 14 && n <= 16 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.3 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                         Carbohydrate = 1.5 * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    }
                }
                if (minutes == 0) {
                    if(n >= 0 && n < 4 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.3 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 1  * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if(n >= 4 && n < 7 && rate > 0.0 && rate <= 0.5){
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 0.5 * currentWeight;
                        PROTEIN = Protein + proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 1  * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate + carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat + fatincperday;
                    }
                    else if (n >= 7 && n <= 10 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 1  * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 10 && n <= 12 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.1 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 1  * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 12 && n <= 14 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.2 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 1  * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    } else if (n > 14 && n <= 16 && rate > 0.0 && rate <= 0.5) {
                        w = rate * 2.2;
                        Wtdiff = goalwt - currentWeight;
                        Wtinc = 3500 * w;
                        calincperday = Wtinc / 7;
                        timetaken = Wtdiff / w;
                        WtGainCal = calorie+calincperday;
                        carbincperday = (0.70 * calincperday)/4;;
                        proincperday = (0.25* calincperday)/4;    
                            fatincperday = (0.05 * calincperday)/9;
                        Protein = 1.3 * currentWeight;
                        PROTEIN = Protein+proincperday;
                        ProteinCal = Protein * 4;
                        Carbohydrate = 1  * currentWeight;
                        CarbohydrateCal = Carbohydrate * 4;
                        CARBOHYDRATE = Carbohydrate+carbincperday;
                        FatCal = calorie - ProteinCal - CarbohydrateCal;
                        Fat = FatCal / 9;
                        FAT = Fat+fatincperday;
                    }
                }
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{t1.setEnabled(true);
t2.setEnabled(true);
t3.setEnabled(true);
t4.setEnabled(true);
t5.setEnabled(true);
t6.setEnabled(true);
t7.setEnabled(true);


int err=0;
System.out.println(ta.getText());
System.out.println(currentWeight);
if(ta.getText().trim().equals("") || Float.parseFloat(ta.getText())<(currentWeight/2.2))
{
err= 1;
lc.setText("*Please Enter Goal Weight");
}
else
{
lc.setText("");
}
if(tb.getText().trim().equals("")   || Float.parseFloat(tb.getText())>0.5 )
{
err= 1;
ld.setText("*Please Enter Rate less than 0.5 ");
}
else
{
ld.setText("");
}
if(err==0)
{
goalwt=Double.parseDouble(ta.getText())*2.2046 ;
rate= Double.parseDouble(tb.getText()) ;
calc1();
double k= FatLossCal = PROTEIN*4 +CARBOHYDRATE*4 +FAT*9;
t1.setText(String.valueOf(String.format("%.2f",bodyMassIndex)));
t2.setText(String.valueOf(String.format("%.2f",basalMetabolicRate)));
t3.setText(String.valueOf(String.format("%.2f",TDEE)));
t4.setText(String.valueOf(String.format("%.2f",k)));
t5.setText(String.valueOf(String.format("%.2f",PROTEIN)));
t6.setText(String.valueOf(String.format("%.2f",CARBOHYDRATE)));
t7.setText(String.valueOf(String.format("%.2f",FAT)));
l13.setText(String.valueOf(String.format("%.1f",timetaken)+" Weeks"));


JPanel panel = new JPanel();
  
       JFXPanel fxPanel = new JFXPanel();
        Platform.runLater(() -> createChart(fxPanel));
        panel.setBounds(1350,300,500,500);
        panel.add(fxPanel, BorderLayout.EAST);
       add(panel);
 revalidate();
repaint();
l9.setVisible(true);
l10.setVisible(true);
l11.setVisible(true);
l12.setVisible(true);
l13.setVisible(true);
b2.setEnabled(true);






}
}


if(e.getSource()==b2)
{
mealplmain obj = new mealplmain(PROTEIN, CARBOHYDRATE, FAT);
}

}
private void createChart(JFXPanel dataPanel) 
{



        PieChart pieChart = new PieChart();

        ObservableList<PieChart.Data> data= FXCollections.observableArrayList(
                new PieChart.Data(String.valueOf(String.format("%.2f",((PROTEIN*400)/(PROTEIN*4 +CARBOHYDRATE*4 +FAT*9)))), (PROTEIN*400)/(PROTEIN*4 +CARBOHYDRATE*4 +FAT*9)),
                new PieChart.Data(String.valueOf(String.format("%.2f",((CARBOHYDRATE*400)/(PROTEIN*4 +CARBOHYDRATE*4 +FAT*9)))), (CARBOHYDRATE*400)/(PROTEIN*4 +CARBOHYDRATE*4 +FAT*9)),
                new PieChart.Data(String.valueOf(String.format("%.2f",((FAT*900)/(PROTEIN*4 +CARBOHYDRATE*4 +FAT*9)))), (FAT*900)/(PROTEIN*4 +CARBOHYDRATE*4 +FAT*9)));
        pieChart.setData(data);
        pieChart.setTitle("MACRO NUTRIENTS FOR DAY");
        pieChart.setLabelsVisible(true);

        Group root = new Group();

        root.getChildren().add(pieChart);
        
        Scene scene = new Scene(root);

        dataPanel.setScene(scene); 
    }

public static void main(String args[])
    {
       gainingphase obj=new gainingphase();
    }

}



 
