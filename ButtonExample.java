package javalab;

import javax.swing.*;

public class test1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");
		b.setBounds(50, 200, 95, 30);
		f.add(b);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		f.add(tf);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(50, 110, 150, 20);
		f.add(tf2);
		
		JLabel l1, l2;
		l1 = new JLabel("First Label");
		l1.setBounds(50, 20, 100, 30);
		l2 = new JLabel("Second Label");
		l2.setBounds(50, 80, 100, 30);
		f.add(l1);
		f.add(l2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}

