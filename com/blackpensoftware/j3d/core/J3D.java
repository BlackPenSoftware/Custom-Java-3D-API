package com.blackpensoftware.j3d.core;

import java.awt.Color;
import java.awt.Graphics;

public class J3D {
	
	private static Color fillColor = Color.BLACK;	/** Creates the variable for fill color and also sets it to a default black **/
	
	public static void gen3DRect(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** gen3DRect method that will be used to create 3D rectangles or squares **/
		g.setColor(fillColor);	// Set the color for the 3D rectangle
		J3D.add3DPoint(g, xPos, yPos, 10, 10);	// Draws the top left point for debug
		J3D.add3DPoint(g, xPos + width, yPos, 10, 10);	// Draws the top right point for debug
		J3D.add3DPoint(g, xPos, yPos + height, 10, 10);	// Draws the bottom left point for debug
		
		xPos += buffer;		// Adds the buffer to offset the back of the cube from the front 
		yPos += depth;		// Adds the depth to the y so that the back is more to one side then the front panel
		
		J3D.add3DPoint(g, xPos, yPos, 10, 10);	// Draws the top left point for debug
		J3D.add3DPoint(g, xPos + width, yPos, 10, 10);	// Draws the top right point for debug
		J3D.add3DPoint(g, xPos, yPos + height, 10, 10);	// Draws the bottom left point for debug
		J3D.add3DPoint(g, xPos + width, yPos + height, 10, 10);	// Draws the bottom right point for debug
	}	/** End of the gen3DRect method **/
	
	public static void gen3DOval(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** gen3DOval method that will be used to create 3D ovals or circles **/
		
	}	/** End of the gen3DOval method **/	
	
	public static void gen3DPolygon(Graphics g, int[] area){	/** gen3DPolygon method that will be used to create 3D polygon **/
		
	}	/** End of the gen3DPolygon method **/	
	
	public static void add3DPoint(Graphics g, int xPos, int yPos, int width, int height){	/** Adds a 3D point to an array that can be read from to make a new 3D object **/
		g.setColor(fillColor);
		g.fillRect(xPos, yPos, width, height);
	}	/** End of the add3DPoint method **/	
	
	public static Color getFillColor(){		/** Gets the fill color of the J3D class **/
		return fillColor;
	}	/** End of the getFillColor method **/	
	
	public static void setFillColor(Color fillColor){	/** Sets the fill color for all of the J3D objects after this method **/
		J3D.fillColor = fillColor;
	}	/** End of the setFillColor method **/	
}	/** End of the J3D Class **/	