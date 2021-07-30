/* File Name: ThreeDimensionalShape.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class is the a child class of the Shape class. It defines
 * the number of dimensions to be 3 and that a ThreeDimensionalShape has a volume.
*/
package Project1Cmsc335;


public class ThreeDimensionalShape extends Shape {
	// is a shape
	
	// has a volume
	double volume;
    
    public ThreeDimensionalShape(String shapeType) {
    	// has 3 dimensions
        super(shapeType, 3);
    }
}