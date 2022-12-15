package javalab;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventDemo extends JFrame implements MouseListener {
	public MouseEventDemo() {
		addMouseListener(this);
		setSize(300,300);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
	}
	public static void main(String[] args) {
		new MouseEventDemo();

	}

}
