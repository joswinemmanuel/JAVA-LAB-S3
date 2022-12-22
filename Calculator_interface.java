import java.awt.event.*;
import javax.swing.*;


public class GUI_Calculator implements ActionListener {
	
	GUI_Calculator() {
		JFrame f = new JFrame("CALCULATOR");
		JPanel p = new JPanel();
		
		JTextField t1;
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
		
		t1 = new JTextField();
		t1.setBounds(100, 100, 200, 30);
		b1 = new JButton("1");
		b1.setBounds(100, 140, 50, 30);
		b2 = new JButton("2");
		b2.setBounds(150, 140, 50, 30);
		b3 = new JButton("3");
		b3.setBounds(200, 140, 50, 30);
		b4 = new JButton("+");
		b4.setBounds(250, 140, 50, 30);
		b5 = new JButton("4");
		b5.setBounds(100, 170, 50, 30);
		b6 = new JButton("5");
		b6.setBounds(150, 170, 50, 30);
		b7 = new JButton("6");
		b7.setBounds(200, 170, 50, 30);
		b8 = new JButton("-");
		b8.setBounds(250, 170, 50, 30);
		b9 = new JButton("7");
		b9.setBounds(100, 200, 50, 30);
		b10 = new JButton("8");
		b10.setBounds(150, 200, 50, 30);
		b11 = new JButton("9");
		b11.setBounds(200, 200, 50, 30);
		b12 = new JButton("*");
		b12.setBounds(250, 200, 50, 30);
		b13 = new JButton("/");
		b13.setBounds(100, 230, 50, 30);
		b14 = new JButton("0");
		b14.setBounds(150, 230, 50, 30);
		b15 = new JButton("=");
		b15.setBounds(200, 230, 50, 30);
		b16 = new JButton("C");
		b16.setBounds(250, 230, 50, 30);
		
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		
		
		f.setContentPane(p);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI_Calculator();
	}

}
