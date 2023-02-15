import java.awt.Color;
import javax.swing.*;

public class Main  {
	public static void main(String[] args) {
		
		JLabel label = new JLabel("You bruv");
		label.setBounds(500, 100, 100, 100);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		panel.setBounds(100, 100, 100, 100);
		
		
		JFrame frame = new JFrame("Frame dawg");
		frame.add(panel);
		frame.add(label);
		frame.setLayout(null);
		frame.setSize(600, 300);
		frame.setVisible(true);
	}
}
