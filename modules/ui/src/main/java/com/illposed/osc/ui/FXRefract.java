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
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class FXRefract extends EffectPanel{

	public FXRefract(String name, OscUI oscUI) {
		super("");
		double scaler = 1.5;
		this.setPreferredSize( new Dimension(ScreenRes.getScaledWidth(0.1042*scaler),ScreenRes.getScaledHeight(0.213*scaler)) );
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
        SpringLayout.Constraints  contentPaneCons = 
                layout.getConstraints(this);
		//this.setLayout(new GridBagLayout());
		//GridBagConstraints c = new GridBagConstraints();
		Font font1 = new Font("Verdana", Font.BOLD, ScreenRes.getScaledHeight(0.016*scaler));
		Font font2 = new Font("Verdana", Font.BOLD, ScreenRes.getScaledHeight(0.008*scaler));
		
		
		JLabel l1 = new JLabel(name,JLabel.CENTER);
		l1.setVisible(true);
		l1.setForeground(Color.white);
		l1.setFont(font1);

		layout.putConstraint(SpringLayout.NORTH, l1,
                0,
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, l1,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.ipady = ScreenRes.getScaledHeight(p);      //make this component tall
		//c.insets = new Insets(0,0,ScreenRes.getScaledHeight(0.025),0);//28

		this.add(l1);
		
		JLabel l2 = new JLabel("Video Refraction",JLabel.LEFT);
		l2.setForeground(Color.white);
		l2.setFont(font2);
		//l2.setBounds(ScreenRes.getScaledHeight((0.02*scaler)),ScreenRes.getScaledWidth((-0.05*scaler)),0,0);
		
		layout.putConstraint(SpringLayout.NORTH, l2,
				ScreenRes.getScaledHeight(0.0463),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, l2,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);

		//c.ipady = ScreenRes.getScaledHeight(p);      //make this component tall
		//c.insets = new Insets(0,0,ScreenRes.getScaledHeight(0.025),0);//28

		this.add(l2);
		
		JButton b1 = new JButton();
		b1.setBackground(Color.RED);
		b1.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.018*scaler),ScreenRes.getScaledHeight(0.0324*scaler) ) );
		//b1.setBounds(ScreenRes.getScaledHeight(-0.1),ScreenRes.getScaledWidth(0.1),0,0);
		layout.putConstraint(SpringLayout.NORTH, b1,
				ScreenRes.getScaledHeight(0.04623),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b1,
				ScreenRes.getScaledWidth(0.1094),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(ScreenRes.getScaledHeight(-0.1),ScreenRes.getScaledWidth(0.1),0,0);
		this.add(b1);
		
		
		JLabel lmin = new JLabel("min");
		lmin.setFont(font2);
		lmin.setForeground(Color.white);
		lmin.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		lmin.setBackground(new Color(109, 110, 115));
		lmin.setOpaque(true);
		lmin.setFont(font2);
		//lmin.setBounds(-200,-200,0,0);
		
		layout.putConstraint(SpringLayout.NORTH, lmin,
				ScreenRes.getScaledHeight(0.07407),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lmin,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);

		//c.insets = new Insets(-200,-200,0,0);;
		this.add(lmin);
		
		JLabel lmax = new JLabel("max");
		lmax.setFont(font2);
		lmax.setForeground(Color.white);
		lmax.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		lmax.setBackground(new Color(109, 110, 115));
		lmax.setOpaque(true);
		
		//lmax.setBounds(-130,-200,0,0);
		layout.putConstraint(SpringLayout.NORTH, lmax,
				ScreenRes.getScaledHeight(0.1204),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lmax,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(-130,-200,0,0);
		this.add(lmax);
		
		JLabel lmag = new JLabel("mag");
		lmag.setFont(font2);
		lmag.setForeground(Color.white);
		lmag.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.02*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		lmag.setBackground(new Color(109, 110, 115));
		lmag.setOpaque(true);
		//lmag.setBounds(-200,195,0,0);
		//c.insets = new Insets(-130,195,0,0);
		layout.putConstraint(SpringLayout.NORTH, lmag,
				ScreenRes.getScaledHeight(0.1111),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lmag,
				ScreenRes.getScaledWidth(0.1146),
                SpringLayout.NORTH, this);
		this.add(lmag);
		
		JButton b2 = new JButton();
		b2.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.018*scaler),ScreenRes.getScaledHeight(0.0324*scaler) ) );

		//b2.setBounds(-50,ScreenRes.getScaledWidth(0.1),0,0);
		//c.insets = new Insets(-50,ScreenRes.getScaledWidth(0.1),0,0);
		layout.putConstraint(SpringLayout.NORTH, b2,
				ScreenRes.getScaledHeight(0.1389),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, b2,
				ScreenRes.getScaledWidth(0.1094),
                SpringLayout.NORTH, this);
		
		this.add(b2);
		
		JSlider slider2 = new JSlider(JSlider.HORIZONTAL,0,50,0);
		slider2.setPreferredSize(new Dimension(120,40));
		slider2.setBackground(new Color(109, 110, 115));
		//slider2.setBounds(-150,-130,0,0);
		layout.putConstraint(SpringLayout.NORTH, slider2,
				ScreenRes.getScaledHeight(0.0926),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider2,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(-150,-130,0,0);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);		

		this.add(slider2);
		
		JLabel t1 = new JLabel("0");
		t1.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t1.setBackground(Color.WHITE);
		t1.setOpaque(true);
		//t1.setBounds(-160,80,0,0);
		//c.insets = new Insets(-160,80,0,0);
		layout.putConstraint(SpringLayout.NORTH, t1,
				ScreenRes.getScaledHeight(0.0926),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t1,
				ScreenRes.getScaledWidth(0.0729),
                SpringLayout.NORTH, this);
		this.add(t1);
		
		JLabel t11 = new JLabel("0");
		t11.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t11.setBackground(Color.WHITE);
		t11.setOpaque(true);
		//t1.setBounds(-160,80,0,0);
		//c.insets = new Insets(-160,80,0,0);
		layout.putConstraint(SpringLayout.NORTH, t11,
				ScreenRes.getScaledHeight(0.218),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t11,
				ScreenRes.getScaledWidth(0.12),
                SpringLayout.NORTH, this);
		this.add(t11);

		JLabel t2 = new JLabel("0");
		t2.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t2.setBackground(Color.WHITE);
		t2.setOpaque(true);
		//t1.setBounds(-160,80,0,0);
		//c.insets = new Insets(-160,80,0,0);
		layout.putConstraint(SpringLayout.NORTH, t2,
				ScreenRes.getScaledHeight(0.253),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t2,
				ScreenRes.getScaledWidth(0.12),
                SpringLayout.NORTH, this);
		this.add(t2);
		
		JLabel t31 = new JLabel("0");
		t31.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t31.setBackground(Color.WHITE);
		t31.setOpaque(true);
		//t1.setBounds(-160,80,0,0);
		//c.insets = new Insets(-160,80,0,0);
		layout.putConstraint(SpringLayout.NORTH, t31,
				ScreenRes.getScaledHeight(0.29),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t31,
				ScreenRes.getScaledWidth(0.12),
                SpringLayout.NORTH, this);
		this.add(t31);
		
		JLabel t22 = new JLabel("0");
		t22.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.01*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t22.setBackground(Color.WHITE);
		t22.setOpaque(true);
		layout.putConstraint(SpringLayout.NORTH, t22,
				ScreenRes.getScaledHeight(0.1389),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t22,
				ScreenRes.getScaledWidth(0.0729),//0.0729
                SpringLayout.NORTH, this);
		//t2.setBounds(-90,80,0,0);

		//c.insets = new Insets(-90,80,0,0);

		this.add(t22);
		
		JSlider slider3 = new JSlider(JSlider.HORIZONTAL,0,50,0);
		slider3.setPreferredSize(new Dimension(ScreenRes.getScaledWidth(0.0625),ScreenRes.getScaledHeight(0.0370)));
		slider3.setBackground(new Color(109, 110, 115));
		//slider3.setBounds(-80,-130,0,0);
		//c.insets = new Insets(-80,-130,0,0);
		layout.putConstraint(SpringLayout.NORTH, slider3,
				ScreenRes.getScaledHeight(0.1389),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider3,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		slider3.setPaintTicks(true);
		slider3.setPaintLabels(true);		

		this.add(slider3);
		
		JLabel t3 = new JLabel("Refraction Magnitude");
		t3.setFont(font2);
		t3.setForeground(Color.white);
		t3.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.06*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t3.setBackground(new Color(109, 110, 115));
		t3.setOpaque(true);
		//t3.setBounds(0,-70,0,0);
		layout.putConstraint(SpringLayout.NORTH, t3,
				ScreenRes.getScaledHeight(0.2037),
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
				ScreenRes.getScaledHeight(0.2222),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider4,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(60,-80,0,0);
		slider4.setPaintTicks(true);
		slider4.setPaintLabels(true);		

		this.add(slider4);
		
		JLabel t4 = new JLabel("Refraction Height");
		t4.setFont(font2);
		t4.setForeground(Color.white);
		t4.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.06*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t4.setBackground(new Color(109, 110, 115));
		t4.setOpaque(true);
		//t4.setBounds(110,-70,0,0);
		layout.putConstraint(SpringLayout.NORTH, t4,
				ScreenRes.getScaledHeight(0.2407),
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
				ScreenRes.getScaledHeight(0.25925),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider5,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(160,-80,0,0);
		slider5.setPaintTicks(true);
		slider5.setPaintLabels(true);		

		this.add(slider5);
		
		JLabel t5 = new JLabel("Refraction Width");
		t5.setFont(font2);
		t5.setForeground(Color.white);
		t5.setPreferredSize( new Dimension( ScreenRes.getScaledWidth(0.06*scaler),ScreenRes.getScaledHeight(0.0139*scaler) ) );
		t5.setBackground(new Color(109, 110, 115));
		t5.setOpaque(true);
		//t5.setBounds(200,-70,0,0);
		layout.putConstraint(SpringLayout.NORTH, t5,
				ScreenRes.getScaledHeight(0.2778),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, t5,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(200,-70,0,0);
		this.add(t5);

		JSlider slider6 = new JSlider(JSlider.HORIZONTAL,0,50,0);
		slider6.setBackground(new Color(109, 110, 115));
		//slider6.setBounds(260,-80,0,0);
		layout.putConstraint(SpringLayout.NORTH, slider6,
				ScreenRes.getScaledHeight(0.2963),
                SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, slider6,
				ScreenRes.getScaledWidth(0.0078),
                SpringLayout.NORTH, this);
		//c.insets = new Insets(260,-80,0,0);
		slider6.setPaintTicks(true);
		slider6.setPaintLabels(true);		

		this.add(slider6);
		
		
		
	}

}
