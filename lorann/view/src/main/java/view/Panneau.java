package view;
import javax.swing.JLabel;
	import javax.swing.ImageIcon;

import javax.swing.JPanel;

	
   


	public class Panneau extends JPanel  {

	    private static final long serialVersionUID =1L;
 public JLabel imageLbl;
	    public ImageIcon iconPhoto;

	
	    public Panneau() {

	        super();
	        displaySetting();


	    }

	    private void displaySetting() {

	        this.setLayout(null);
	        this.afficheImage();
	        this.setFocusable(true);
	        this.requestFocusInWindow();


	    }

	private void afficheImage(){

	        imageLbl = new JLabel();
	        iconPhoto = new ImageIcon("lorann.gif");
	        this.imageLbl.setBounds(32, 0, 32, 32);

	        this.imageLbl.setIcon(iconPhoto);
	        this.add(imageLbl);


}
	}
