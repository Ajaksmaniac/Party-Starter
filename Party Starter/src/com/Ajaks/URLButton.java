package com.Ajaks;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.w3c.dom.events.MouseEvent;

public class URLButton extends JButton  {
	private String PATH;
	private String URL;
	private int posX, posY;
	
	public URLButton(String URL, String PATH, int posX, int posY) {
		this.setBounds(posX, posY, 74, 74);
		this.setBackground(new Color(0,0,0,0));
		this.setBorderPainted(false);
		    
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				setBackground(new Color(0,0,0,0));
				setBorderPainted(false);
			}
			
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				setBackground(new Color(0,0,0,0));
				setBorderPainted(false);
			}
			
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				setBorderPainted(false);
				setBackground(new Color(0,0,0,0));
				
			}
			
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				setBackground(new Color(0,0,0,0));
				
				
				
			}
			

			

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setBackground(new Color(0,0,0,0));
				setBorderPainted(false);
			}
		});
		this.setIcon(new ImageIcon(System.getProperty("user.dir")+"//src//com//Ajaks//Images//" + PATH + ".png"));
		
		setBorderPainted(false);
		setBackground(new Color(0,0,0,0));
	}

	

	
	
}
