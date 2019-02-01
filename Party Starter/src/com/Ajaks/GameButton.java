package com.Ajaks;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.filechooser.FileSystemView;

public class GameButton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File file;
	
	public GameButton(int posX, int posY, String PATH ) {
		this.setBounds(posX, posY, 100, 100);
		this.setBackground(new Color(0,0,0,0));
		file= new File(PATH);
		this.setVisible(true);
		Icon icon = FileSystemView.getFileSystemView().getSystemIcon(file);
		setBorderPainted(false);

		
		
		
		Image image = ((ImageIcon) icon).getImage(); // transform it 
		Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		
		this.setIcon(icon);
		
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				setBorderPainted(false);
				setBackground(new Color(0,0,0,0));
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				setBorderPainted(false);
				setBackground(new Color(0,0,0,0));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(0,0,0,0));
				setBorderPainted(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(0,0,0,0));
				setBorderPainted(false);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop desktop = Desktop.getDesktop(); try {
					desktop.open(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setBorderPainted(false);

				
			}
		});
	}

}
