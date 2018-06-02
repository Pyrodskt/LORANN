package view;
//import controller.IController;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre2 extends JFrame  {

	/**
	 * 
	 */


	public Fenetre2 () 
	{
		 JFrame Fenetre2 = new JFrame();

		    JPanel pan = new JPanel();
		    JButton bouton2 = new JButton("Level 1");
		    JButton bouton3 = new JButton("Level 2");
		    JButton bouton4 = new JButton("Level 3");
		    JButton bouton5 = new JButton("Level 4");
		    JButton bouton6 = new JButton("Level 5");
		    
		    Fenetre2.setTitle("Lorann");
		    Fenetre2.setSize(800, 600);
		    Fenetre2.setLocationRelativeTo(null);
		    		
		    JLabel texte = new JLabel("Welcome to Lorann !\n\n Which level do you wanna play ?\n\n");
		    
		    String url = "C:\\Users\\PyrodSkt\\Desktop\\Projet JAVA\\LORANN\\LorannPhoto.jpg";
		    ImageIcon icone = new ImageIcon(url);
		    
		    JLabel logo = new JLabel (icone, JLabel.CENTER);
		    pan.add(bouton2);
		    pan.add(bouton3);
		    pan.add(bouton4);
		    pan.add(bouton5);
		    pan.add(bouton6);
		    pan.add(texte);
		    pan.add(logo);
		    Fenetre2.validate();
		    Fenetre2.setContentPane(pan);
		    Fenetre2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	
		 
		    
		    
		    Fenetre2.setVisible(true);
		    //faire une méthode publique  qui permet l'affichage de la map
		//    bouton2.addActionListener(e -> System.out.println(map));
		 
		   bouton2.addActionListener(e -> Fenetre2.dispose()); 
		    
		    bouton3.addActionListener(e -> new Fenetre3().setVisible(true)); 
		   
		    bouton5.addActionListener(e -> System.exit(0));
		    
		   
	}

}
