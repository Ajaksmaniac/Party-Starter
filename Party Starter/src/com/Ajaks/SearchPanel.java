package com.Ajaks;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SearchPanel extends JPanel {
	private int posX = 10;
	private int posY = 70;
	private int WIDTH = 400;
	private int HEIGHT = 600;
	
	private  String url ;
	
	
	public  SearchPanel() {
		JPanel s = new JPanel();
		this.setBackground(new Color(80,0,0,100));
		this.setBounds(posX, posY, WIDTH, HEIGHT);
		this.setLayout(null);
		
		
		
		
		JTextField tx = new JTextField("");
		tx.setBounds(10, 10, 300, 25);
		tx.setVisible(true);
		tx.setBackground(Color.BLACK);
		tx.setForeground(Color.red);
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(320, 10, 75, 25);
		searchButton.setVisible(true);
		

		
		//Add url butons here
		
		
		this.add(new URLButton("www.google.com", "google" , 10, 60));
		this.add(new URLButton("www.youtube.com", "youtube" , 90, 60));
		this.add(new URLButton("www.facebook.com", "facebook" , 170, 60));
		
		
		
		
		
		///////
		
		
		this.add(tx);
		this.add(searchButton);
		
		
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				url = tx.getText();
				System.out.println(url);
				try {
					if(tx.getText().compareTo("") == 0 ) {
						JOptionPane.showMessageDialog(s, "Please enter url", "Warning", JOptionPane.WARNING_MESSAGE);
					}else
										
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
						tx.setText("");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(s, "Wrong adress", "Warning", JOptionPane.WARNING_MESSAGE);
					
					
				}
				
			}
		});
		
		
		
		
		
		
	
	}
}
