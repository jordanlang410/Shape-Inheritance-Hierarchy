/* File Name: Cone.java
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class inherits the three dimensional features from the
 * ThreeDimensionalShape Class. It then uses the radius and height to calculate the
 *  Volume of a Cone.
*/
package Project1Cmsc335;

public class Cone extends ThreeDimensionalShape {
	//is a three Dimensional Shape inherited from ThreeDimensionalShape Class
	
	private double radius;
	private double height;

	public Cone(double radius, double height) {
		super("Cone");
		this.radius = radius;
		this.height = height;
	}

	public void calcConeVolume(double radius, double height) {
		//has a volume (from the ThreeDimensionalShape Class)
		volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
	}

}
