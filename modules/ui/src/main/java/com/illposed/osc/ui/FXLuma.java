package com.illposed.osc.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class FXLuma extends EffectPanel{

	public FXLuma(String name, OscUI oscUI) {
		super("");
		double scaler = 1.5;
		this.setPreferredSize( new Dimension(ScreenRes.getScaledWidth(0.1042*scaler),ScreenRes.getScaledHeight(0.213*scaler)) );
		
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
        SpringLayout.Constraints  contentPaneCons = 
                layout.getConstraints(this);
        
		Font font1 = new Font("Verdana", Font.BOLD, ScreenRes.getScaledHeight(0.016*scaler));
		Font font2 = new Font("Verdana", Font.BOLD, ScreenRes.getScaledHeight(0.008*scaler));
		
//		JPanel bufferLeft = new JPanel();
//		c.weightx = 0;
//		c.gridwidth = 1;
//		c.gridx = 0;
//		c.gridy = 0;
//		bufferLeft.setOpaque(false);
//		this.add(bufferLeft, c);
//		
//		JPanel bufferRight = new JPanel();
//		c.weightx = 0;
//		c.gridwidth = 1;
//		c.gridx = 6;
//		c.gridy = 0;
//		bufferRight.setOpaque(false);
//		this.add(bufferRight, c);
		
		
		JLabel l1 = new JLabel(name,JLabel.CENTER);
		l1.setForeground(Color.white);
		l1.setFont(font1);
		
		layout.putConstraint(SpringLayout.NORTH, l1,
				ScreenRes.getScaledHeight(0),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, l1,
				ScreenRes.getScaledWidth(0.025),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(ScreenRes.getScaledHeight((-0.035*scaler)),0,0,0);//28   -40*scaler

		this.add(l1);
		
		JLabel l2 = new JLabel("Luma Offset Distribution",JLabel.CENTER);
		l2.setForeground(Color.white);
		l2.setFont(font2);
		
		layout.putConstraint(SpringLayout.NORTH, l2,
				ScreenRes.getScaledHeight(0.03),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, l2,
				ScreenRes.getScaledWidth(0.035),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(ScreenRes.getScaledHeight(-0.01*scaler),0,0,0);//28 -10
		//c.ipady = ScreenRes.getScaledHeight(p);      //make this component tall
		//c.insets = new Insets(0,0,ScreenRes.getScaledHeight(0.025),0);//28

		this.add(l2);
		
		JButton b1 = new JButton();
		b1.setName(name);
		b1.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.018*scaler),ScreenRes.getScaledHeight(0.0324*scaler) ) );
		//t1.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.02), ScreenRes.getScaledHeight(0.02) ) );
		//t1.setSize(new Dimension(1,1));
		//c.weightx = 0.1;
		//b1.setOpaque(false);
		//b1.setBorder(BorderFactory.createEmptyBorder());
		//c.weightx = 0.1;
		//c.insets = new Insets(0,ScreenRes.getScaledWidth(-0.0026*scaler),0,0);

		layout.putConstraint(SpringLayout.NORTH, b1,
				ScreenRes.getScaledHeight(0.04623),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b1,
				ScreenRes.getScaledWidth(0.02),
                SpringLayout.NORTH, this);
		
		this.add(b1);
		

		
		JButton b2 = new JButton();
		b2.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.018*scaler),ScreenRes.getScaledHeight(0.0324*scaler) ) );
		//t1.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.02), ScreenRes.getScaledHeight(0.02) ) );
		//t1.setSize(new Dimension(1,1));
		//c.weightx = 0.1;
		//b1.setOpaque(false);
		//b1.setBorder(BorderFactory.createEmptyBorder());
		//c.weightx = 0.1;
		//c.insets = new Insets(0,ScreenRes.getScaledWidth(0.003*scaler),0,0);

		layout.putConstraint(SpringLayout.NORTH, b2,
				ScreenRes.getScaledHeight(0.04623),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b2,
				ScreenRes.getScaledWidth(0.065),
                SpringLayout.NORTH, this);

		
		this.add(b2);
		

		
		JButton b3 = new JButton();
		b3.setBackground(Color.RED);
		b3.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.018*scaler),ScreenRes.getScaledHeight(0.0324*scaler) ) );
		//t1.setSize(new Dimension(1,1));
		//c.weightx = 0.1;
		//b1.setOpaque(false);
		//b1.setBorder(BorderFactory.createEmptyBorder());
		//c.weightx = 0.1;
		//c.insets = new Insets(0,ScreenRes.getScaledWidth(0.01042*scaler),0,0);
		
		layout.putConstraint(SpringLayout.NORTH, b3,
				ScreenRes.getScaledHeight(0.04623),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b3,
				ScreenRes.getScaledWidth(0.1094),
                SpringLayout.NORTH, this);

		this.add(b3);
		
		JLabel t3 = new JLabel("Magnitude");
		t3.setFont(font2);
		t3.setForeground(Color.white);
		t3.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.06*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t3.setBackground(new Color(109, 110, 115));
		t3.setOpaque(true);
		//t3.setBounds(0,-70,0,0);
		layout.putConstraint(SpringLayout.NORTH, t3,
				ScreenRes.getScaledHeight(0.13),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t3,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(0,-70,0,0);
		this.add(t3);

		JSlider slider4 = new JSlider(JSlider.HORIZONTAL,0,50,0);
		slider4.setBackground(new Color(109, 110, 115));
		//slider4.setBounds(60,-80,0,0);
		layout.putConstraint(SpringLayout.NORTH, slider4,
				ScreenRes.getScaledHeight(0.1522),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider4,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(60,-80,0,0);
		slider4.setPaintTicks(true);
		slider4.setPaintLabels(true);		

		this.add(slider4);
		
		JLabel t4 = new JLabel("Spacing");
		t4.setFont(font2);
		t4.setForeground(Color.white);
		t4.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.06*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t4.setBackground(new Color(109, 110, 115));
		t4.setOpaque(true);
		//t4.setBounds(110,-70,0,0);
		layout.putConstraint(SpringLayout.NORTH, t4,
				ScreenRes.getScaledHeight(0.175),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t4,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(110,-70,0,0);
		this.add(t4);

		JSlider slider5 = new JSlider(JSlider.HORIZONTAL,0,50,0);
		slider5.setBackground(new Color(109, 110, 115));
		//slider5.setBounds(160,-80,0,0);
		layout.putConstraint(SpringLayout.NORTH, slider5,
				ScreenRes.getScaledHeight(0.2),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider5,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(160,-80,0,0);
		slider5.setPaintTicks(true);
		slider5.setPaintLabels(true);		

		this.add(slider5);
		
	
		
		JLabel t1 = new JLabel("0");
		t1.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t1.setBackground(Color.WHITE);
		t1.setOpaque(true);
		//t1.setBounds(-160,80,0,0);
		//c.insets = new Insets(-160,80,0,0);
		layout.putConstraint(SpringLayout.NORTH, t1,
				ScreenRes.getScaledHeight(0.1522),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t1,
				ScreenRes.getScaledWidth(0.12),
                SpringLayout.NORTH, this);
		this.add(t1);

		JLabel t2 = new JLabel("0");
		t2.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t2.setBackground(Color.WHITE);
		t2.setOpaque(true);
		//t1.setBounds(-160,80,0,0);
		//c.insets = new Insets(-160,80,0,0);
		layout.putConstraint(SpringLayout.NORTH, t2,
				ScreenRes.getScaledHeight(0.2),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t2,
				ScreenRes.getScaledWidth(0.12),
                SpringLayout.NORTH, this);
		this.add(t2);
		
		
		JLabel l22 = new JLabel("Fill",JLabel.LEFT);
		l22.setForeground(Color.white);
		l22.setFont(font2);
		//l2.setBounds(ScreenRes.getScaledHeight((0.02*scaler)),ScreenRes.getScaledWidth((-0.05*scaler)),0,0);
		
		layout.putConstraint(SpringLayout.NORTH, l22,
				ScreenRes.getScaledHeight(0.1),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, l22,
				ScreenRes.getScaledWidth(0.027),
                SpringLayout.NORTH, this);

		//c.ipady = ScreenRes.getScaledHeight(p);      //make this component tall
		//c.insets = new Insets(0,0,ScreenRes.getScaledHeight(0.025),0);//28

		this.add(l22);
		
		JLabel l3 = new JLabel("Smooth",JLabel.LEFT);
		l3.setForeground(Color.white);
		l3.setFont(font2);
		//l2.setBounds(ScreenRes.getScaledHeight((0.02*scaler)),ScreenRes.getScaledWidth((-0.05*scaler)),0,0);
		
		layout.putConstraint(SpringLayout.NORTH, l3,
				ScreenRes.getScaledHeight(0.1),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, l3,
				ScreenRes.getScaledWidth(0.065),
                SpringLayout.NORTH, this);

		//c.ipady = ScreenRes.getScaledHeight(p);      //make this component tall
		//c.insets = new Insets(0,0,ScreenRes.getScaledHeight(0.025),0);//28

		this.add(l3);
		
	}

}
