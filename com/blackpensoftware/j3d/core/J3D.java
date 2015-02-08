package com.blackpensoftware.j3d.core;

import java.awt.Color;
import java.awt.Graphics;

public class J3D {
	
	private static Color fillColor = Color.BLACK;	/** Creates the variable for fill color and also sets it to a default black **/
	
	public static void draw3DRect(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** draw3DRect method that will be used to create 3D rectangles or squares **/
		g.setColor(fillColor);	// Sets the color of the lines to be drawn // 
		g.drawLine(xPos, yPos, xPos + buffer, yPos + depth);	// Line From Top Left of outer square to top left of inner square // 
		g.drawLine(xPos, yPos, xPos + width, yPos);		// Line from top left to top right of outer square // 
		g.drawLine(xPos, yPos, xPos, yPos + height); 	// Line from top left to bottom left of outer square // 
		g.drawLine(xPos, yPos + height, xPos + buffer, (yPos + height) + depth);	// Line from bottom left of outer square to bottom left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, xPos + buffer, yPos + depth);	// Line from bottom left of inner square to top left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, (xPos + buffer) + width, (yPos + height) + depth);	// Line from the bottom left of the inner square to the bottom right of the inner square // 
		g.drawLine( (xPos + buffer) + width, (yPos + height) + depth, (xPos + buffer) + width, yPos + depth);	// Line from bottom right of outer cube to top right of outer square // 
		g.drawLine(xPos + width, yPos, (xPos + buffer) + width, yPos + depth);		// Line from top right of outer square to top right of inner square // 
		g.drawLine(xPos + buffer, yPos + depth, (xPos + buffer) + width, yPos + depth);		// Line from top left of inner cube to top right of inner cube // 
	}	/** End of the draw3DRect method **/
	
	public static void draw3DOval(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** draw3DOval method that will be used to create 3D ovals or circles **/
		
	}	/** End of the draw3DOval method **/	
	
	public static void draw3DPolygon(Graphics g, J3DPoint[] area){	/** draw3DPolygon method that will be used to create 3D polygon **/
		
	}	/** End of the draw3DPolygon method **/	
	
	public static void fill3DRect(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer, Color outlineColor, Color fillColor){		/** fill3DRect method that will be used to create filled 3D rectangles or squares **/
		
		g.setColor(fillColor);
		int[] topXPos = {xPos, xPos + width, (xPos + buffer) + width, xPos + buffer};
		int[] topYPos = {yPos, yPos, yPos + depth, yPos + depth};
		int[] leftXPos = {xPos, xPos + buffer, xPos + buffer, xPos};
		int[] leftYPos = {yPos, yPos + depth, (yPos + depth) + height, yPos + height};
		int[] frontXPos = {xPos + buffer, (xPos + buffer) + width, (xPos + buffer) + width, xPos + buffer};
		int[] frontYPos = {yPos + depth, yPos + depth, (yPos + depth) + height, (yPos + depth) + height};
		
		g.fillPolygon(topXPos, topYPos, 4);
		g.fillPolygon(leftXPos, leftYPos, 4);
		g.fillPolygon(frontXPos, frontYPos, 4);
		
		g.setColor(outlineColor);	// Sets the color of the lines to be drawn // 
		g.drawLine(xPos, yPos, xPos + buffer, yPos + depth);	// Line From Top Left of outer square to top left of inner square // 
		g.drawLine(xPos, yPos, xPos + width, yPos);		// Line from top left to top right of outer square // 
		g.drawLine(xPos, yPos, xPos, yPos + height); 	// Line from top left to bottom left of outer square // 
		g.drawLine(xPos, yPos + height, xPos + buffer, (yPos + height) + depth);	// Line from bottom left of outer square to bottom left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, xPos + buffer, yPos + depth);	// Line from bottom left of inner square to top left of inner square // 
		g.drawLine(xPos + buffer, (yPos + height) + depth, (xPos + buffer) + width, (yPos + height) + depth);	// Line from the bottom left of the inner square to the bottom right of the inner square // 
		g.drawLine( (xPos + buffer) + width, (yPos + height) + depth, (xPos + buffer) + width, yPos + depth);	// Line from bottom right of outer cube to top right of outer square // 
		g.drawLine(xPos + width, yPos, (xPos + buffer) + width, yPos + depth);		// Line from top right of outer square to top right of inner square // 
		g.drawLine(xPos + buffer, yPos + depth, (xPos + buffer) + width, yPos + depth);		// Line from top left of inner cube to top right of inner cube // 
		
	}	/** End of the fill3DRect method **/
	
	public static void fill3DOval(Graphics g, int xPos, int yPos, int width, int height, int depth, int buffer){		/** fill3DOval method that will be used to create filled 3D ovals or circles **/
		
	}	/** End of the fill3DOval method **/	
	
	public static void fill3DPolygon(Graphics g, J3DPoint[] area){	/** fill3DPolygon method that will be used to create a filled 3D polygon **/
		
	}	/** End of the fill3DPolygon method **/	
	
	public static Color getFillColor(){		/** Gets the fill color of the J3D class **/
		return fillColor;
	}	/** End of the getFillColor method **/	
	
	public static void setFillColor(Color fillColor){	/** Sets the fill color for all of the J3D objects after this method **/
		J3D.fillColor = fillColor;
	}	/** End of the setFillColor method **/	
	
	public static void connectPoint(Graphics g, J3DPoint pointOne, J3DPoint pointTwo){	/** Connects two J3D points together **/
		g.setColor(fillColor);
		g.drawLine(pointOne.getXPos(), pointOne.getYPos(), pointTwo.getXPos(), pointTwo.getYPos());
	}	/** End of the connectPoint method **/
}	/** End of the J3D Class **/	