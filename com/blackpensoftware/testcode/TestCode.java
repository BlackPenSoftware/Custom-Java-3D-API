package com.blackpensoftware.testcode;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import com.blackpensoftware.j3d.core.J3D;
import com.blackpensoftware.j3d.core.J3DPoint;

@SuppressWarnings("serial")
public class TestCode extends Applet{
	public void init(){
		this.setSize(new Dimension(1920, 1080));
		this.setBackground(Color.CYAN);
		this.setName("Test Code Applet");
	}
	
	public void paint(Graphics g){
		int xPos = 400, yPos = 400, width = 300, height = 200, depth = 60, buffer = 50;
		
	//	J3D.draw3DRect(g, xPos, yPos, width, height, depth, buffer);
		
		J3D.fill3DRect(g, xPos, yPos, width, height, depth, buffer, Color.BLACK, Color.MAGENTA);
		
	}
}
