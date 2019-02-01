package com.Ajaks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frameOpener extends JFrame {
	
	private File file;
	private static String TITLE = "Party Starter";
	private static int WIDTH = 1500;
	private static int HEIGHT = WIDTH / 2 +100;
	
	
	public frameOpener() {
		Window mainFrame = new Window(TITLE, WIDTH, HEIGHT);
		
	
		this.setSize(100, 100);
		this.setUndecorated(true);
		this.add(panel());
		this.setBackground(new Color(0,0,0,0));
		this.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				mainFrame.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		
	}
	
	public JLabel panel () {
		JLabel p = new JLabel(new ImageIcon(System.getProperty("user.dir")+"//src//com//Ajaks//Images//frameOpener.png"));
		
		p.setVisible(true);
		p.setSize(100,100);
		
		
		return p;
	}
	
}
