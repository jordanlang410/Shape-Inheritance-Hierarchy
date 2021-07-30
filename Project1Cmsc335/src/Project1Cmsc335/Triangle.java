/* File Name: Triangle.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class inherits the two dimensional features from the
 * TwoDimensionalShape Class. It then uses the base and height to calculate the 
 * Area of a triangle.
*/
package Project1Cmsc335;

public class Triangle extends TwoDimensionalShape {
	//is a two Dimensional Shape inherited from the TwoDimensionalShape Class

	private double base;
	private double height;

	Triangle(double base, double height) {
		super("Triangle");
		this.base = base;
		this.height = height;
	}

	public void calcTriangleArea(double base, double height) {
		//has an area (from the TwoDimensionalShape Class)
		area = (base * height) / 2;
	}
}