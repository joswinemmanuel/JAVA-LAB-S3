import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class demon implements ActionListener{
	JButton button;
	JTextField field1, field2;
	
	demon() {
		JFrame frame = new JFrame("JOSWIN Woo");
		
		field1 = new JTextField("Hello");
		field1.setBounds(400, 300, 80, 30);
		field1.setBackground(Color.black);
		field1.setForeground(Color.green);
		
		field2 = new JTextField();
		field2.setBounds(250, 300, 80, 30);
		field2.setBackground(Color.black);
		field2.setForeground(Color.red);
		
		button = new JButton("Get Data");
		button.setBounds(100, 300, 100, 30);
		button.addActionListener(this);
		button.setBackground(Color.black);
		button.setForeground(Color.green);
		
		frame.add(field1);
		frame.add(field2);
		frame.add(button);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLayout(null);
		frame.setSize(800, 700);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			String data = field1.getText();
			System.out.println(data);
			field2.setText(data);
		}
	}
}


public class test  {
	public static void main(String[] args) {
		new demon();
	}
}

