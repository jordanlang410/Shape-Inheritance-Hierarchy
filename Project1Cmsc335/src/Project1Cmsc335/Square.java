/* File Name: Square.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class inherits the two dimensional features from the
 * TwoDimensionalShape Class. It then uses the edges to calculate the Area of a square.
*/
package Project1Cmsc335;

public class Square extends TwoDimensionalShape {
	//is a two Dimensional Shape inherited from the TwoDimensionalShape Class

	private double edge;

	Square(double edge) {
		super("Square");
		this.edge = edge;
	}

	public void calcSquareArea(double edge) {
		
		//has an area (from the TwoDimensionalShape Class)
		area = Math.pow(edge, 2);
	}
}