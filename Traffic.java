package trafficdemo;
//Java Program to Implement Traffic signal
//Using Java Swing Components
//Importing required classes
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;
//Main class
//Extending JFrame class and
//Implementing ActionListener interface
public class Traffic_Signal extends JFrame implements ActionListener {
// Setting the buttons for the layout
JRadioButton jr1;
JRadioButton jr2;
JRadioButton jr3;
ButtonGroup b = new ButtonGroup();
private Color red_c;
private Color yellow_c;
private Color green_c;
public Traffic_Signal(String msg)
{
 setLayout(new FlowLayout());
 // Assigning name to the button declared above
 // with help of JRadioButton class
 jr1 = new JRadioButton("Red");
 jr2 = new JRadioButton("Yellow");
 jr3 = new JRadioButton("Green");
 jr1.addActionListener(this);
 jr2.addActionListener(this);
 jr3.addActionListener(this);
 add(jr1);
 add(jr2);
 add(jr3);
 b.add(jr1);
 b.add(jr2);
 b.add(jr3);
}
// Method 1

// To change colors of traffic signal
public void actionPerformed(ActionEvent ae)
{
 if (jr1.isSelected()==true) {
 red_c=Color.red;
 green_c=getBackground();
 yellow_c=getBackground(); 
 }
 if (jr2.isSelected()==true) {
 red_c=getBackground();
 yellow_c=Color.YELLOW;
 green_c=getBackground(); 
 }
 if (jr3.isSelected()==true) {
 red_c=getBackground();
 yellow_c=getBackground(); 
 green_c=Color.GREEN;
 }
 repaint();
}
// Method 2
// handling the paint graphics and
// dimensions of the buttons via
// setting co-ordinates
public void paint(Graphics g)
{
 g.drawRect(100, 105, 110, 270);
 g.drawOval(120, 150, 60, 60);
 g.drawOval(120, 230, 60, 60);
 g.drawOval(120, 300, 60, 60);
 g.setColor(red_c);
 g.fillOval(120, 150, 60, 60);
 g.setColor(yellow_c);
 g.fillOval(120, 230, 60, 60);
 g.setColor(green_c);
 g.fillOval(120, 300, 60, 60);
 }
// Method 3
// Main driver method
public static void main(String args[])

{
 // Creating object of Jframe class inside main()
 // method
 JFrame jf = new Traffic_Signal("Traffic Light");
 // Setting size and making traffic signal
 // operational using setVisible() method
 jf.setSize(500, 500);
 jf.setVisible(true);
}
}
