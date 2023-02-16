import java.awt.Color;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class demo extends JFrame implements ActionListener{
	JRadioButton radio1;
	JRadioButton radio2;
	JRadioButton radio3;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	public demo() {
		
		radio1 = new JRadioButton("Red");
		radio1.setBounds(250, 50, 75, 10);	
		radio1.addActionListener(this);
		radio2 = new JRadioButton("Yellow");
		radio2.addActionListener(this);
		radio2.setBounds(350, 50, 75, 10);
		radio3 = new JRadioButton("Green");
		radio3.addActionListener(this);
		radio3.setBounds(450, 50, 75, 10);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		panel1 = new JPanel();
		panel1.setBounds(350, 100, 100, 100);
		panel2 = new JPanel();
		panel2.setBounds(350, 250, 100, 100);	
		panel3 = new JPanel();
		panel3.setBounds(350, 400, 100, 100);
		
		this.add(radio1);
		this.add(radio2);
		this.add(radio3);
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.gray);
		this.setTitle("Traffic Light");
		this.setSize(1000, 800);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == radio1)	{
			panel1.setBackground(Color.red);
			panel2.setBackground(Color.white);
			panel3.setBackground(Color.white);
		} else if(e.getSource() == radio2)	{
			panel1.setBackground(Color.white);
			panel2.setBackground(Color.yellow);
			panel3.setBackground(Color.white);
		} else if(e.getSource() == radio3)	{
			panel1.setBackground(Color.white);
			panel2.setBackground(Color.white);
			panel3.setBackground(Color.green);
		}
	}
}	

public class EXAM {
	public static void main(String[] args) {
		new demo();
	}
}
