/* File Name: Rectangle.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class inherits the two dimensional features from the
 * TwoDimensionalShape Class. It then uses the length and width to calculate the
 * Area of a rectangle.
*/
package Project1Cmsc335;

public class Rectangle extends TwoDimensionalShape {
	//is a two Dimensional Shape inherited from the TwoDimensionalShape Class

	private double length;
	private double width;

	Rectangle(double length, double width) {

		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	public void calcRectangleArea(double length, double width) {
		//has an area (from the TwoDimensionalShape Class)
		area = length * width;

	}
}
