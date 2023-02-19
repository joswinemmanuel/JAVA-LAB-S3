import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class test2 extends JFrame implements ActionListener {
	JButton button;
	JTextField field;
	int i = 1;

	test2() {
		field = new JTextField();
		field.setBounds(300, 100, 100, 35);
		field.setText("         POW 0");
		field.setForeground(Color.green);
		field.setBackground(Color.black);
		button = new JButton();
		button.setText("Powwww");
		button.setBounds(100, 100, 100, 35);
		button.setForeground(Color.RED);
		button.setBackground(Color.BLACK);
		button.addActionListener(this);

		this.add(field);
		this.add(button);
		this.setTitle("Joswin Woo");
		this.getContentPane().setBackground(Color.GRAY);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(500, 400);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			field.setText("         POW "+i);
			System.out.println("pow " + i);
			i++;
		}
	}
}

class test {
	public static void main(String[] args) {
		new test2();
	}
}
