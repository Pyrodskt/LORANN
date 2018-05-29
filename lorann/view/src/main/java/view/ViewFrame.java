package view;

import javax.swing.JFrame;

public class ViewFrame extends JFrame {
	public ViewFrame (String Title) {
		this.setTitle("Lorann");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
