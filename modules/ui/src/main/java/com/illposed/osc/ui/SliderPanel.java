package com.illposed.osc.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SliderPanel extends EffectPanel {

	JSlider slider;
	public SliderPanel (String n, double w, double h, int f1, int f2, double p){
		super("");
		this.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(w), ScreenRes.getScaledHeight(h) ) );//130 90
		//add 3 white boxes
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		slider = new JSlider(JSlider.HORIZONTAL,0,50,0);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		Font font1 = new Font("Verdana", Font.BOLD, f1);
		final JLabel l1 = new JLabel(n);
		l1.setForeground(Color.white);
		l1.setFont(font1);
		c.ipady = ScreenRes.getScaledHeight(p);      //make this component tall
		c.weightx = 0;
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy = 0;
		this.add(l1, c);
		
		Squares squares = new Squares();
		//squares.addSquare(0,0,55,8);
		//squares.addSquare(0,10,25,8);
		//squares.addSquare(0,20,55,8);
		c.weightx = 1;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		this.add(squares, c);
		
		c.gridx =0;
		c.gridy =1;
		c.gridwidth = 2;
		this.add(slider,c);
			
		JButton b1 = new JButton();
		b1.setBackground(Color.RED);
		b1.setPreferredSize(new Dimension(ScreenRes.getScaledWidth(0.0078), ScreenRes.getScaledHeight(0.0139)));
		c.weightx = 1;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		this.add(b1, c);
		

		
		//add 1 red box
	}
}
@SuppressWarnings("serial")
class Squares extends JPanel {
	   private int width = ScreenRes.getScaledWidth(0.0313);
	   private int height = ScreenRes.getScaledHeight(0.0019);
	   private List<Rectangle> squares = new ArrayList<Rectangle>();

	   public void addSquare(int x, int y, int width, int height) {
	      Rectangle rect = new Rectangle(x, y, width, height);
	      squares.add(rect);
	   }

	   @Override
	   public Dimension getPreferredSize() {
	      return new Dimension(width, height);
	   }

	   @Override
	   protected void paintComponent(Graphics g) {
	      //super.paintComponent(g);
	         System.out.println("SIZE"+squares.size());
	      Graphics2D g2 = (Graphics2D) g;
	      for (Rectangle rect : squares) {
			     g2.setColor(Color.green);
	         g2.draw(rect);
	         g2.fill(rect);
	      }
	   }

	}
