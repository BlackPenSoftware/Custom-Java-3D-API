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
		J3DPoint pointOne = new J3DPoint();
		pointOne.setXPos(300);
		pointOne.setYPos(300);
		pointOne.setWidth(50);
		pointOne.setHeight(20);
		
		J3DPoint pointTwo = new J3DPoint();
		pointTwo.setXPos(500);
		pointTwo.setYPos(500);
		pointTwo.setWidth(50);
		pointTwo.setHeight(20);
		
	}
}
