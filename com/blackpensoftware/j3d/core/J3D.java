package com.blackpensoftware.j3d.core;

import java.awt.Color;
import java.awt.Graphics;

public class J3D {
	
	private static Color fillColor = Color.BLACK;	/** Creates the variable for fill color and also sets it to a default black **/
	
	public static void gen3DRect(Graphics g, int xPos, int yPos, int width, int height, int debth, int buffer){		/** gen3DRect method that will be used to create 3D rectangles or squares **/
		
	}	/** End of the gen3DRect method **/
	
	public static void gen3DOval(Graphics g, int xPos, int yPos, int width, int height, int debth, int buffer){		/** gen3DOval method that will be used to create 3D ovals or circles **/
		
	}	/** End of the gen3DOval method **/	
	
	public static void gen3DPolygon(Graphics g, int[] area){	/** gen3DPolygon method that will be used to create 3D polygon **/
		
	}	/** End of the gen3DPolygon method **/	
	
	public static void add3DPoint(int[] area, int xPos, int yPos, int zPos){	/** Adds a 3D point to an array that can be read from to make a new 3D object **/
		
	}	/** End of the add3DPoint method **/	
	
	public static Color getFillColor(){		/** Gets the fill color of the J3D class **/
		return fillColor;
	}	/** End of the getFillColor method **/	
	
	public static void setFillColor(Color fillColor){	/** Sets the fill color for all of the J3D objects after this method **/
		J3D.fillColor = fillColor;
	}	/** End of the setFillColor method **/	
}	/** End of the J3D Class **/	