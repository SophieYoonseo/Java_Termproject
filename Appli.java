package proj;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.*;
import java.awt.image.*;

class Appli extends JFrame implements MouseListener {
	
	JLabel statusLabel = new JLabel();
	
	public Appli() {

		this.setTitle("CampusMap by À±¼­, ¿¹Àº");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0, 0, 971, 758);

		statusLabel.setBounds(0, 0, 1813, 1053);
		statusLabel.setIcon(new ImageIcon(CampusMap.class.getResource("ÅÒÇÁ·ÎÁ§Æ®.jpg")));
		statusLabel.setForeground(new Color(0, 0, 0));
		
		this.getContentPane().add(statusLabel);
		this.addMouseListener(this);
		this.setVisible(true);

	}

	@Override

	public void mouseClicked(MouseEvent me) {

  
		System.out.println("¸¶¿ì½º XÁÂÇ¥ : " + me.getX());
		System.out.println("¸¶¿ì½º YÁÂÇ¥ : " + me.getY());
  
		int xx =  Integer.valueOf(me.getX());
		int yy =  Integer.valueOf(me.getY());

		System.out.println("xx : " + xx +" "+ yy);
	 
		if(xx >= 644 && xx <= 898 && yy >= 407 && yy <= 678) {

			CampusMap cm = new CampusMap();
			cm.show();
			dispose();
		}
	}

 	@Override
 	public void mouseEntered(MouseEvent me) {

 		System.out.println("mouseEtered");

 	}

 	@Override
 	public void mouseExited(MouseEvent me) {

 		System.out.println("mouseExit");

 	}

 	@Override
 	public void mousePressed(MouseEvent me) {

 		System.out.println("mousePress");

 	}

 	@Override
 	public void mouseReleased(MouseEvent me) {

 		System.out.println("mouseReleased");

 	}

   
 	public static void main(String[] args) {
        Appli app = new Appli();
    }
}






