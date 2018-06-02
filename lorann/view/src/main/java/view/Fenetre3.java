package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;





public class Fenetre3 extends JFrame  implements KeyListener{

	
	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;
		Panneau pan;
	    private JLabel imageLbl;
	    private ImageIcon iconPhoto;
	    
	    public Fenetre3() {
	    
	        super();
	        WindowSetting();
	    
	    }
	    
	    private void WindowSetting() {
	        
	    this.setTitle("Lorann la death machine");
	    this.setSize(656, 432);  // x = 20 * 32 + 32/2 pixel, y= 20 * 32 + 32/2 pixel
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    pan = new Panneau();
	    this.setContentPane(pan);
	    this.setAlwaysOnTop(true);
	    
	    
	    

	    
	    
	    //imageLbl = new JLabel();
	    //iconPhoto = new ImageIcon("lorann.gif");

		this.setLayout(null);
		this.setFocusable(true);
	    this.requestFocusInWindow();
	    /*this.imageLbl.setBounds(32, 0, 32, 32);
	    this.imageLbl.setIcon(iconPhoto);
	    this.add(imageLbl);*/
	    imageLbl = new JLabel();
	    iconPhoto = new ImageIcon("C:\\Users\\PyrodSkt\\eclipse-workspace\\TESTESTESTESTESTEST\\lorann.gif");
	    this.imageLbl.setBounds(32, 0, 32, 32);
	    this.addKeyListener(this);
	    this.imageLbl.setIcon(iconPhoto);
	    this.add(imageLbl);
	   // this.setPreferredSize(new Dimension(200, 200));
	 //imageLbl.setDisabledIcon(imageLbl);
	    
	    }
	    




		@Override
	    public void keyTyped(KeyEvent e) {
	    	// TODO Auto-generated method stub
	    	//JLabel piou = new JLabel();
			
	    	int x = imageLbl.getBounds().x;
	    	int y = imageLbl.getBounds().y;
	    	if (e.getKeyCode() == KeyEvent.VK_RIGHT && x < 19*32) {
	 

	    	imageLbl.setLocation(x +32 , y);
	    	}
	    	
	    	else if (e.getKeyCode() == KeyEvent.VK_LEFT  && x > 31 ) {

	        	imageLbl.setLocation(x - 32 , y);
	    	}
	    	
	    	else if (e.getKeyCode() == KeyEvent.VK_UP  && y > 31 ) {

	        	imageLbl.setLocation(x  , y -32 );
	    	}
	    	else if (e.getKeyCode() == KeyEvent.VK_DOWN  && y < 11*32 ) {

	        	imageLbl.setLocation(x  , y +32 );
	    	}
	    	repaint();
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	    	// TODO Auto-generated method stub
	    	int x = imageLbl.getBounds().x;
	    	int y = imageLbl.getBounds().y;
	    	if (e.getKeyCode() == KeyEvent.VK_RIGHT && x < 19*32) {
	    		

	    	 imageLbl.setLocation(x +32 , y);
	    	
	    	}
	    	else if (e.getKeyCode() == KeyEvent.VK_LEFT  && x > 31) {

	        	imageLbl.setLocation(x - 32 , y);
	    	}
	    	else if (e.getKeyCode() == KeyEvent.VK_UP  && y > 31 ) {

	        	imageLbl.setLocation(x  , y -32 );
	    	}
	    	else if (e.getKeyCode() == KeyEvent.VK_DOWN  && y < 11*32) {

	        	imageLbl.setLocation(x  , y +32);
	    	}
	    	repaint();
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
	    	// TODO Auto-generated method stub
	 

	    	repaint();
	    }    
	    }

