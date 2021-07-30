/* File Name: Cube.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class inherits the three dimensional features from the
 * ThreeDimensionalShape Class. It then uses the length of the edges to calculate the
 *  Volume of a cube.
*/
package Project1Cmsc335;

public class Cube extends ThreeDimensionalShape{
	//is a three Dimensional Shape inherited from ThreeDimensionalShape Class
	
    private double edge;
    double volume;
    
    public Cube(double edge) {
        super("Cube");
        this.edge = edge;
    }
    
    public void calcCubeVolume(double edge) {
    	//has a volume (from the ThreeDimensionalShape Class)
        volume = Math.pow(edge, 3);
    }

}
