package com.padwolf.game.graphics;

import javax.swing.JFrame;

import com.padwolf.game.resources.Resources;

public class Frame extends JFrame{
	private static final long serialVersionUID = -7436983541077654518L;

	public Frame(Resources resources){
		setTitle(resources.NAME);
		setUndecorated(true);
		setSize(resources.SCREEN_SIZE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
}
