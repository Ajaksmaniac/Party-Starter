package com.Ajaks;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;

import javax.annotation.processing.FilerException;
import javax.swing.JPanel;

public class GameFinder extends JPanel  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int posX = 430;
	private int posY = 70;
	private int WIDTH = 1050;
	private int HEIGHT = 750;
	private String DESKTOP = "\\Desktop";
	public GameFinder() {
		
		this.setBounds(posX, posY, WIDTH, HEIGHT);
		this.setVisible(true);
		this.setLayout(null);
		this.setBackground(new Color(100,0,0,100));
		Desktop des = Desktop.getDesktop();
		String path = des.toString();
		
		int x = 10;
		int y = 10;
		
		File file = new File(System.getProperty("user.home")+DESKTOP);
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
            
            this.add(new GameButton(x,y,f.getPath()));
            x+=140;
            if(x>= WIDTH - 100) {
            	y+=140;
            	x =10;
            }
        }
	
	}

}
