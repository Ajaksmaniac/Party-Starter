package com.Ajaks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class DigitalClock extends JPanel {
	private int posX =10;
	private int posY = 680;
	private int WIDTH = 400;
	private int HEIGHT = 140;
	
	
	int r = 50;
	int g= 10;
	int b = 0;
	final int i  = 100;
	
	final Color color = new Color(r,g,b, i);
	JFrame f;  
	Thread t=null;  
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	 
	JLabel label;
	public DigitalClock() {
		this.setBounds(posX, posY, WIDTH, HEIGHT);
		this.setVisible(true);
		this.setLayout(null);
		this.setBackground(color);
	
		System.out.println(r+""+ g +""+ b+""+i);
	  
		ClockLabel clock = new ClockLabel();
	    this.add(clock);
	    clock.setVisible(true);
	    clock.setBounds(25, 25 , 400, 100);
	    
	   
	   
	   
	    this.setFont(new Font("Arial", Font.BOLD, 28));
	    this.setForeground(Color.black);
	    this.setOpaque(false);
	}
	
	
	

	

}
class ClockLabel extends JLabel implements ActionListener {
	int r,g, b;
	int i  = 50;
	final Color color = new Color(r = 100,g,b,i);
	public Timer t;
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClockLabel() {
	    super("" + new Date());
	    t = new Timer(1000, this);
	    t.start();
	    
	    this.setFont(new Font("Arial", Font.BOLD, 30));
	    this.setForeground(Color.RED);
	   this.setBackground(color);
	    //System.out.println(i);
	    
	    
	  }


	  public void actionPerformed(ActionEvent ae) {
	    setText((new Date()).toString());
	   this.setBackground(new Color(50,0,0,0));
	    
	    
	  }

	
	}
