package view;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 

public class Fenetre1 extends JFrame {
    
    public Fenetre1() {
    
    JFrame Fenetre = new JFrame();

    JPanel pan = new JPanel();
    JButton bouton = new JButton("Do you wanna be a super hero ?");
    JButton bouton2 = new JButton("Or maybe King Moldu");
    JLabel texte = new JLabel("Welcome to Lorann !\n\n Do you wanna play Video Games ?\n\n");
    
    String url = "C:\\Users\\PyrodSkt\\Desktop\\Projet JAVA\\LORANN\\LorannPhoto.jpg";
    ImageIcon icone = new ImageIcon(url);
    
    JLabel logo = new JLabel (icone, JLabel.CENTER);
    
    
    
    Fenetre.setTitle("Launcher Lorann");
    Fenetre.setSize(800, 600);
    Fenetre.setLocationRelativeTo(null);
    Fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    pan.add(texte);
    pan.add(bouton);
    pan.add(bouton2);
    pan.add(logo);
    Fenetre.validate();
    Fenetre.setVisible(true);
    Fenetre.setContentPane(pan);
    
    bouton2.addActionListener(e -> System.exit(0));
    bouton.addActionListener(e -> Fenetre.dispose()); 
    bouton.addActionListener(e -> new Fenetre2().setVisible(true));
    
    }
}
