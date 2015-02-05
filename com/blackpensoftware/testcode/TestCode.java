package com.blackpensoftware.testcode;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import com.blackpensoftware.j3d.core.J3D;

@SuppressWarnings("serial")
public class TestCode extends Applet{
	public void init(){
		this.setSize(new Dimension(1920, 1080));
		this.setBackground(Color.CYAN);
		this.setName("Test Code Applet");
	}
	
	public void paint(Graphics g){
		J3D.gen3DRect(g, 500, 500, 200, 200, 100, 50);
	}
}
