import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Trafficlight extends JPanel implements ActionListener{
JRadioButton r1,r2,r3;
Color red_c,green_c,yellow_c;
Trafficlight(){
setBounds(0,0,640,480);
r1=new JRadioButton("Red");
r2=new JRadioButton("Yellow");
r3=new JRadioButton("Green");
r1.setSelected(true);
red_c=Color.red;
yellow_c=getBackground();
green_c=getBackground();
ButtonGroup b=new ButtonGroup();
b.add(r1);
b.add(r2);
b.add(r3);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
}
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawOval(50,50,50,50);
g.drawOval(50,110,50,50);
g.drawOval(50,170,50,50);
g.setColor(red_c);
g.fillOval(50,50,50,50);
g.setColor(yellow_c);
g.fillOval(50,110,50,50);
g.setColor(green_c);
g.fillOval(50,170,50,50);
}
public void actionPerformed(ActionEvent e) {
if(r1.isSelected()==true) {
red_c=Color.red;
yellow_c=getBackground();
green_c=getBackground();

}
else if(r2.isSelected()==true) {

red_c=Color.white;
yellow_c=Color.yellow;
green_c=Color.white;
}
else if(r3.isSelected()==true) {

red_c=Color.white;
yellow_c=Color.white;
green_c=Color.green;
}
repaint();
}

public static void main(String[] args) {
// TODO Auto-generated method stub
JFrame f=new JFrame("Traffic light");
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
Trafficlight tl=new Trafficlight();
f.add(tl);
}

}

