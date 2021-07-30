/* File Name: Shape.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class is the parent class for the TwoDimensionalShape
 * and ThreeDimensionalShape Classes.  It defines that a shape has a type and
 * a number of dimensions.
*/
package Project1Cmsc335;

public class Shape {
	// is an object

	String shapeType;
	int numOfDimensions; // has a number of dimensions
	
	public Shape(String shapeType, int numOfDimensions) {
		this.shapeType = shapeType;
		this.numOfDimensions = numOfDimensions;
	}
}
