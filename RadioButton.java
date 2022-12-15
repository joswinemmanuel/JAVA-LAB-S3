import javax.swing.*;
import java.awt.*;

public class test2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Radio Button Demo");
		ButtonGroup radioGroup = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Male", true);
		JRadioButton rb2 = new JRadioButton("Female");
		radioGroup.add(rb1);
		radioGroup.add(rb2);
		frame.add(rb1);
		frame.add(rb2);
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
