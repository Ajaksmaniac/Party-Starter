package com.Ajaks;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Start {

	private static String TITLE = "Party Starter";
	private static int WIDTH = 1500;
	private static int HEIGHT = WIDTH / 2 +100;
	
	
	
	public static void main(String[] args) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameOpener f = new frameOpener();
		f.setVisible(true);
		Window w = new Window(TITLE,WIDTH,HEIGHT);
		//w.setVisible(true);
		
		
		
		
		
		
		

	}

}
