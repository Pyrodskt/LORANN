package view;
import javax.swing.JMenuBar;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ViewFrame extends JFrame {
	public ViewFrame (String Title) {
		this.setTitle("Lorann");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	JMenuBar menu = new JMenuBar();
	JMenu menu1 = new JMenu("Menu");
	
	JMenuItem niveau1 = new JMenuItem (new AbstractAction("Niveau 1")) {
		public void actionPerformed(ActionEvent ae) 
		{
			
		}
	}
	}
}
