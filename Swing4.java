import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

class demo1 extends JFrame {
	private static final long serialVersionUID = 1L;
	public demo1(){
		this.setTitle("Test");
		this.setSize(700, 600);
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.yellow);
		g2d.fillOval(100, 50, 400, 400);
		g2d.setPaint(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.fillOval(150, 150, 100, 100);
		g2d.fillOval(350, 150, 100, 100);
		g2d.drawOval(100, 50, 400, 400);
		g2d.drawArc(200, 210, 200, 170, 180, 180);
		
		g2d.setFont(new Font("Ink Free", Font.BOLD, 45));		
		g2d.drawString("Hello Mileex SAAAN", 125, 520);
	}
}

public class graphtut {
	public static void main(String[] args) {
		new demo1();
	}
}
