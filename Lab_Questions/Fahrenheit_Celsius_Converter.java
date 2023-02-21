import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class work extends JFrame implements ActionListener{
	JButton button, button2;
	JLabel label3;
	JTextField field;
	
	work() {
		field = new JTextField();
		field.setBounds(250, 100, 100, 30);
		
		JLabel label1 = new JLabel("Enter the temperature in Celsius : ");
		label1.setBounds(50, 100, 200, 30);
		
		JLabel label2 = new JLabel("          The temperature in Celsius : ");
		label2.setBounds(50, 200, 200, 30);
		
		label3 = new JLabel();
		label3.setBounds(250, 200, 100, 30);
		label3.setOpaque(true);
		
		button = new JButton("Convert  ");
		button.setBounds(100, 150, 100, 30);
		button.addActionListener(this);
		
		button2 = new JButton("Reset  ");
		button2.setBounds(250, 150, 100, 30);
		button2.addActionListener(this);
		
		this.add(field);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(button);
		this.add(button2);
		this.setTitle("Celsius to Kelvin CONVERTER");
		this.setSize(600, 500);
		this.setLayout(null);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			float f, c;
			if(! (field.getText().equals(""))) {
				c = Integer.parseInt(field.getText());
				f = (float) (c * (9/5.0) + 32);
				label3.setText(f + " F");
			}
		} else if(e.getSource()==button2) {
			field.setText("");
			label3.setText("");
		}
	}
}

public class test {
	public static void main(String[] args) {
		new work();
	}
}
