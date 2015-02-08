package com.blackpensoftware.j3d.core;

import java.awt.Color;
import java.awt.Graphics;

public class J3D {
	
	private static Color fillColor = Color.BLACK;	/** Creates the variable for fill color and also sets it to a default black **/
	
	public static void gen3DRect(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** gen3DRect method that will be used to create 3D rectangles or squares **/
		
	}	/** End of the gen3DRect method **/
	
	public static void gen3DOval(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** gen3DOval method that will be used to create 3D ovals or circles **/
		
	}	/** End of the gen3DOval method **/	
	
	public static void gen3DPolygon(Graphics g, J3DPoint[] area){	/** gen3DPolygon method that will be used to create 3D polygon **/
		
	}	/** End of the gen3DPolygon method **/	
	
	public static Color getFillColor(){		/** Gets the fill color of the J3D class **/
		return fillColor;
	}	/** End of the getFillColor method **/	
	
	public static void setFillColor(Color fillColor){	/** Sets the fill color for all of the J3D objects after this method **/
		J3D.fillColor = fillColor;
	}	/** End of the setFillColor method **/	
	
	public static void drawPoint(Graphics g, J3DPoint point){	/** Draws a new instance of the point **/
		g.setColor(fillColor);
		g.fillRect(point.getXPos(), point.getYPos(), point.getWidth(), point.getHeight());
	}
	
	public static void connectPoint(Graphics g, J3DPoint pointOne, J3DPoint pointTwo){	/** Connects two J3D points together **/
		g.setColor(fillColor);
		g.drawLine(pointOne.getXPos(), pointOne.getYPos(), pointTwo.getXPos(), pointTwo.getYPos());
		
	}	/** End of the connectPoint method **/
}	/** End of the J3D Class **/	