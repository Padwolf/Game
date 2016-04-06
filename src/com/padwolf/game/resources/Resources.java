package com.padwolf.game.resources;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.padwolf.game.graphics.Frame;

public class Resources {
	public final String NAME = "Game of Yes";
	public final Dimension SCREEN_SIZE;
	public final Frame FRAME;
	
	public Resources(){
		SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
		FRAME = new Frame(this);
	}
}
