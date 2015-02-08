package com.blackpensoftware.j3d.core;

import java.awt.Color;

public class J3DPoint {
	
	private static int xPos;	/** Variable for xPos **/
	private static int yPos;	/** Variable for yPos **/
	private static int width;	/** Variable for width **/
	private static int height;	/** Variable for height **/
	private static Color fillColor = Color.BLACK;	/** Creates the variable for fill color and also sets it to a default black **/
	
	public void setXPos(int x){
		J3DPoint.xPos += x;
	}
	
	public int getXPos(){
		return xPos;
	}
	
	public void setYPos(int y){
		J3DPoint.yPos += y;
	}
	
	public int getYPos(){
		return yPos;
	}
	
	public void setWidth(int width){
		J3DPoint.width += width;
	}
	
	public int getWidth(){
		return width;
	}
	
	public void setHeight(int height){
		J3DPoint.height += height;
	}
	
	public int getHeight(){
		return height;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		J3DPoint.fillColor = fillColor;
	}
}
