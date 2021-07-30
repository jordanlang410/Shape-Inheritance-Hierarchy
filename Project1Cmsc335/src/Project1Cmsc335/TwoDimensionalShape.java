/* File Name: TwoDimensionalShape.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class is the a child class of the Shape class. It defines
 * the number of dimensions to be 2 and that a TwoDimensionalShape has an area.
*/
package Project1Cmsc335;

public class TwoDimensionalShape extends Shape {
	// is a shape

	// has an area
    double area;
    
    TwoDimensionalShape(String shapeType) {
    	// has 3 dimensions
        super(shapeType, 2);
    }
}