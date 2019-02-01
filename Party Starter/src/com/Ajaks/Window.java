package com.Ajaks;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.omg.CORBA.portable.InputStream;
import org.w3c.dom.events.MouseEvent;

public class Window extends JFrame{
	
	frameOpener fo ;
	public BufferedImage image = null;
	//public File iconFile = "new-google-favicon-512.png";
	//public Icon icon ;
	
	public Window(String title, int Width, int Height) {
		this.setTitle(title);
		this.setSize(Width, Height);
		
		this.setUndecorated(true);
		this.setBackground(new Color(0,0,0,125));
		
		
		this.setLayout(null);
		
		
		this.add(new SearchPanel());
		this.add(Menus());
		this.add(Exit());
		this.add(new DigitalClock());
		this.add(new GameFinder());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	}
	
			        	
	
				///Upper Menu with Exit
	//////////////////////////////////////////////////////////////
	public JMenuBar Menus() {
		JMenuBar menu = new JMenuBar();
		
		menu.setBounds(0, 0, 1425, 25);
		menu.setBackground(new Color(60,0,0,100));
		
		menu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				setVisible(false);
				fo = new frameOpener();
				fo.setVisible(true);
				
			}
		});
		
		
		return menu;
		
	}
	public JButton Exit() {
		
		JButton exit = new JButton("EXIT");
		exit.setBounds(1425, 0, 75, 25);
		
		exit.setBorderPainted(false);
		
		
		exit.addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});;
		
		
		exit.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	exit.setBackground(new Color(30,0,0,50));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	exit.setBackground(new Color(60,0,0,30));
		    }
		});
		exit.setBackground(new Color(60,0,0,30));
		return exit;
		
	}
	///////////////////////////////////////////////////////////////

}
