/* File Name: MainProject1Cmsc335
 * Author: Lang, Jordan
 * Project Name: Project 1 CMSC335
 * Date: 05/25/2021
 * Purpose/Description: This class creates a command driven menu for the user to choose
 * which two or three dimensional structure they would like to construct. It then prompts
 * the user for the necessary information to do so.  The program will continue until
 * the user chooses the option not to.
*/
package Project1Cmsc335;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainProject1Cmsc335 {

	public static void main(String[] args) {

		System.out.println("*********Welcome to the Java OO Shapes Program **********");

		Scanner keyboardInput = new Scanner(System.in);
		int userSelection;
		
		try {

			// use a do while loop to continue the program until the user chooses not to
			do {

				displayMenu();
				
				// Repeat until an int is entered
				while (!keyboardInput.hasNextInt()) {
					keyboardInput.next(); // Read and remove any non int input
					System.out.println("Please choose a number from the MENU."); // Re-prompt
				}
				
				userSelection = keyboardInput.nextInt();
				

				// set the format to use for the output areas and volumes
				DecimalFormat numberFormat = new DecimalFormat("#.00");

				switch (userSelection) {

				case 1:

					System.out.println("You have selected a Circle.");
					System.out.println("What is the radius?");

					// accept users double input and save in variable
					double circleRadius = invalidEntry();

					Circle circle = new Circle(circleRadius);

					circle.calcCircleArea(circleRadius);
					System.out.println("The area of the " + circle.numOfDimensions + " Dimensional "
							+ circle.shapeType + " is " + numberFormat.format(circle.area));
					break;

				case 2:
					System.out.println("You have selected a Rectangle.");
					System.out.println("What is the length?");

					// accept users double input and save in variable
					double length = invalidEntry();

					System.out.println("What is the width?");
					double width = invalidEntry();

					Rectangle rectangle = new Rectangle(length, width);

					rectangle.calcRectangleArea(length, width);
					System.out.println("The area of the " + rectangle.numOfDimensions + " Dimensional "
							+ rectangle.shapeType + " is " + numberFormat.format(rectangle.area));

					break;

				case 3:
					System.out.println("You have selected a Square.");
					System.out.println("What are the lengths of all the edges?");
					double squareEdges = invalidEntry();

					Square square = new Square(squareEdges);

					square.calcSquareArea(squareEdges);
					System.out.println("The area of the " + square.numOfDimensions + " Dimensional " + square.shapeType
							+ " is " + numberFormat.format(square.area));
					break;

				case 4:
					System.out.println("You have selected a Triangle.");
					System.out.println("What is the base?");
					double base = invalidEntry();

					System.out.println("What is the height?");
					double height = invalidEntry();

					Triangle triangle = new Triangle(base, height);

					triangle.calcTriangleArea(base, height);
					System.out.println("The area of the " + triangle.numOfDimensions + " Dimensional "
							+ triangle.shapeType + " is " + numberFormat.format(triangle.area));

					break;

				case 5:
					System.out.println("You have selected a Sphere.");
					System.out.println("What is the radius?");
					double sphereRadius = invalidEntry();

					Sphere sphere = new Sphere(sphereRadius);

					sphere.calcSphereVolume(sphereRadius);
					System.out.println("The volume of the " + sphere.numOfDimensions + " Dimensional "
							+ sphere.shapeType + " is " + numberFormat.format(sphere.volume));

					break;

				case 6:
					System.out.println("You have selected a Cube.");
					System.out.println("What are the lengths of all the edges?");
					double cubeEdges = invalidEntry();

					Cube cube = new Cube(cubeEdges);

					cube.calcCubeVolume(cubeEdges);
					System.out.println("The volume of the " + cube.numOfDimensions + " Dimensional " + cube.shapeType
							+ " is " + numberFormat.format(cube.volume));

					break;

				case 7:
					System.out.println("You have selected a Cone.");
					System.out.println("What is the radius?");
					double cubeRadius = invalidEntry();

					System.out.println("What is the height?");
					double cubeHeight = invalidEntry();

					Cone cone = new Cone(cubeRadius, cubeHeight);

					cone.calcConeVolume(cubeRadius, cubeHeight);
					System.out.println("The volume of the " + cone.numOfDimensions + " Dimensional " + cone.shapeType
							+ " is " + numberFormat.format(cone.volume));

					break;

				case 8:
					System.out.println("You have selected a Cylinder.");
					System.out.println("What is the radius?");
					double cylinderRadius = invalidEntry();

					System.out.println("What is the height?");
					double cylinderHeight = invalidEntry();

					Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

					cylinder.calcCylinderVolume(cylinderRadius, cylinderHeight);
					System.out.println("The volume of the " + cylinder.numOfDimensions + " Dimensional "
							+ cylinder.shapeType + " is " + numberFormat.format(cylinder.volume));

					break;

				case 9:
					System.out.println("You have selected a Torus.");
					System.out.println("What is the minor radius?");
					double minorRadius = invalidEntry();

					System.out.println("What is the major radius?");
					double majorRadius = invalidEntry();

					Torus torus = new Torus(minorRadius, majorRadius);

					torus.calcTorusVolume(minorRadius, majorRadius);
					System.out.println("The volume of the " + torus.numOfDimensions + " Dimensional " + torus.shapeType
							+ " is " + numberFormat.format(torus.volume));

					break;

				case 10:
					System.out.println("Thank you for using the program.");
					DisplayTimeDate(); // Call date and time method to display
					break;

				default:
					// Error handling
					System.out.println("Please choose a number from the MENU.\n");

				}

				if (userSelection != 10) {
					char choice;
					keyboardInput.nextLine();
					System.out.println("\nWould you like to continue? (Y or N)");
					// convert all user entries to uppercase for error handling
					choice = Character.toUpperCase(keyboardInput.nextLine().charAt(0));

					do {
						if (choice != 'Y' && choice != 'N') {
							// Continue to re-run until the user enters 'Y' or 'N'
							System.out.println("Please try again, you must enter 'Y' or 'N'.");
							choice = Character.toUpperCase(keyboardInput.nextLine().charAt(0));
						}
						if (choice == 'N') {
							// exit program if the user enter 'n' or 'N'
							System.out.println("\nThank you for using the program.");
							DisplayTimeDate(); // Call date and time method to display
							System.exit(0);
						}

					} while (choice != 'Y' && choice != 'N');

				}

			} while (userSelection != 10);

		} catch (Exception e) {
			// display if user does not enter a number
			System.out.println("Please choose a number from the MENU.");

		}
	}
	
	public static double invalidEntry() {
		// Method to check if users entries are doubles, if not, re-prompt
		
		Scanner keyboardInput = new Scanner(System.in);
		
		// Repeat until a double is entered
		while (!keyboardInput.hasNextDouble()) {
			keyboardInput.next(); // Read and remove any non double input
			System.out.println("Please try again, you must enter a double."); // Re-prompt
		}
		return keyboardInput.nextDouble();
	}

	public static void DisplayTimeDate() {
		// display current date and time

		DateFormat dateFormat = new SimpleDateFormat("MMMM dd");
		DateFormat timeFormat = new SimpleDateFormat("hh:mm a");
		String formattedDate = dateFormat.format(new Date()).toString();
		String formattedTime = timeFormat.format(new Date()).toString();

		System.out.println("Today is " + formattedDate + " at " + formattedTime);

	}

	public static void displayMenu() {
		System.out.println("\nSelect from the menu below:");
		System.out.println("1: Construct a Circle");
		System.out.println("2: Construct a Rectangle");
		System.out.println("3: Construct a Square");
		System.out.println("4: Construct a Triangle");
		System.out.println("5: Construct a Sphere");
		System.out.println("6: Construct a Cube");
		System.out.println("7: Construct a Cone");
		System.out.println("8: Construct a Cylinder");
		System.out.println("9: Construct a Torus");
		System.out.println("10: Exit the program");
	}
}
